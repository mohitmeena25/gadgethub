/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.dao.impl;

import in.gadgethub.dao.OrderDao;
import in.gadgethub.dao.TransactionDao;
import in.gadgethub.dao.UserDao;
import in.gadgethub.pojo.CartPojo;
import in.gadgethub.pojo.OrderDetailsPojo;
import in.gadgethub.pojo.OrderPojo;
import in.gadgethub.pojo.TransactionPojo;
import in.gadgethub.pojo.UserPojo;
import in.gadgethub.utility.DBUtil;
import in.gadgethub.utility.IDUtil;
import in.gadgethub.utility.MailMessage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.mail.MessagingException;

/**
 *
 * @author Mohit
 */
public class OrderDaoImpl implements OrderDao{

    @Override
    public boolean addOrder(OrderPojo order) {
        boolean status=false;
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        try{
            ps=conn.prepareStatement("Insert into orders values(?,?,?,?,?)");
            ps.setString(1, order.getOrderId());
            ps.setString(2, order.getProdId());
            ps.setInt(3, order.getQuantity());
            ps.setDouble(4, order.getAmount());
            ps.setInt(5,0);
            int count=ps.executeUpdate();
            status=count>0;
         }catch(SQLException ex){
            System.out.println("Error in addOrder:"+ex);
            ex.printStackTrace();
         }
        DBUtil.closeStatement(ps);
        return status;
    }

    @Override
    public boolean addTransaction(TransactionPojo transaction) {
        boolean status=false;
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        try{
            ps=conn.prepareStatement("Insert into transactions values(?,?,?,?)");
            ps.setString(1, transaction.getTransactionId());
            ps.setString(2, transaction.getUserEmail());
            java.util.Date d1=transaction.getTransTime();
            java.sql.Date d2=new java.sql.Date(d1.getTime());
            ps.setDate(3, d2);
            ps.setDouble(4, transaction.getAmount());
            int count=ps.executeUpdate();
            status=count>0;
         }catch(SQLException ex){
            System.out.println("Error in addTransaction:"+ex);
            ex.printStackTrace();
         }
        DBUtil.closeStatement(ps);
        return status;
    }

    @Override
    public List<OrderPojo> getAllOrders() {
        List<OrderPojo>orderList=new ArrayList<>();
        Connection conn=DBUtil.provideConnection();
        Statement st=null;
        ResultSet rs=null;
        try{
            st=conn.createStatement();
            rs=st.executeQuery("select * from orders");
            while(rs.next()){
                OrderPojo order=new OrderPojo();
                order.setOrderId(rs.getString("orderid"));
                order.setProdId(rs.getString("prodid"));
                order.setQuantity(rs.getInt("quantity"));
                order.setAmount(rs.getDouble("amount"));
                order.setShipped(rs.getInt("shipped"));
                orderList.add(order);
            }
        }catch(SQLException ex){
            System.out.println("Error in getAllOrders"+ex);
            ex.printStackTrace();
         }
        DBUtil.closeStatement(st);
        DBUtil.closeResultSet(rs);
        return orderList;
    }

    @Override
    public List<OrderDetailsPojo> getAllOrderDetails(String userEmailId) {
        List<OrderDetailsPojo> orderList=new ArrayList<>();
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            ps=conn.prepareStatement("Select p.pid as prodid,o.orderid as orderid,o.shipped as shipped, p.image as image,p.pname as pname, o.quantity as qty, o.amount as amount,t.transtime as time From orders o,products p,transactions t where o.orderid=t.transid and o.prodid=p.pid and t.useremail=?");
            ps.setString(1, userEmailId);
            rs=ps.executeQuery();
            while(rs.next()){
                OrderDetailsPojo orderDetails=new OrderDetailsPojo();
                orderDetails.setOrderId(rs.getString("orderid"));
                orderDetails.setProdId(rs.getString("prodid"));
                orderDetails.setProdImage(rs.getAsciiStream("image"));
                orderDetails.setProdname(rs.getString("pname"));
                orderDetails.setQuantity(rs.getInt("qty"));
                orderDetails.setAmount(rs.getDouble("amount"));
                orderDetails.setTime(rs.getTimestamp("time"));
                orderDetails.setShipped(rs.getInt("shipped"));
                orderList.add(orderDetails);
            }
        }catch(SQLException ex){
            System.out.println("Error in getAllOrderDetails"+ex);
            ex.printStackTrace();
         }
        DBUtil.closeStatement(ps);
        DBUtil.closeResultSet(rs);
        return orderList;
    }

    @Override
    public String shipNow(String orderId, String prodId) {
        String status="Failure";
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        try{
            ps=conn.prepareStatement("update orders set shipped=1 where orderid=? and prodid=?");
            ps.setString(1, orderId);
            ps.setString(2, prodId);
            int count=ps.executeUpdate();
            if(count>0){
                status="Order Shipped Successfully";
                TransactionDao transDao=new TransactionDaoImpl();
                try{
                    MailMessage.shippedSuccess(transDao.getUserId(orderId),orderId);
                }catch(MessagingException ex){
                    ex.printStackTrace();
                }
            }
         }catch(SQLException ex){
            System.out.println("Error in shipNow:"+ex);
            ex.printStackTrace();
         }
        DBUtil.closeStatement(ps);
        return status;
    }

    @Override
    public String paymentsSuccess(String username, double paidAmount) {
       String status="Order Placement Failed!";
       CartDaoImpl cartDao=new CartDaoImpl();
       List<CartPojo>cartList=cartDao.getAllCartItems(username);
       if(cartList.isEmpty()){
           return status;
       }
       String transactionId=IDUtil.generateTransId();
       TransactionPojo trPojo=new TransactionPojo();
       trPojo.setTransactionId(transactionId);
       trPojo.setUserEmail(username);
       trPojo.setAmount(paidAmount);
       trPojo.setTransTime(new java.util.Date());
       boolean result=addTransaction(trPojo);
       if(result==false){
           return status;
       }
       boolean ordered=true;
       ProductDaoImpl productDao=new ProductDaoImpl();
       for(CartPojo cartPojo:cartList){
           double amount=productDao.getProductPrice(cartPojo.getProdId())*cartPojo.getQuantity();
           OrderPojo order=new OrderPojo();
           order.setOrderId(transactionId);
           order.setProdId(cartPojo.getProdId());
           order.setQuantity(cartPojo.getQuantity());
           order.setAmount(amount);
           order.setShipped(0);
           ordered=addOrder(order);
           if(!ordered){
               break;
           }
           ordered=cartDao.removeAProduct(cartPojo.getUseremail(), cartPojo.getProdId());
           if(!ordered){
               break;
           }
           ordered=productDao.sellNProduct(cartPojo.getProdId(), cartPojo.getQuantity());
       }
       if(ordered){
           status="Order Placed Successfully";
           System.out.println("Transaction Successfull :"+transactionId);
           try{
               UserDao userDao=new UserDaoImpl();
               UserPojo userPojo=userDao.getUserDetails(username);
               String name=userPojo.getUsername();
               MailMessage.orderPlaced(username,name,transactionId);
           }catch(MessagingException ex){
               ex.printStackTrace();
           }
       }else{
           System.out.println("Transaction Failed");
       }
       return status;
    }
    @Override
    public int getSoldQuantity(String prodId){
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        int quantity=0;
        try{
            ps=conn.prepareStatement("Select sum(quantity) as quant from orders where prodid=?");
            ps.setString(1, prodId);
            rs=ps.executeQuery();
            if(rs.next()){
                quantity=rs.getInt(1);
            }
         }catch(SQLException ex){
            System.out.println("Error in getSoldQuantity():"+ex);
            ex.printStackTrace();
         }
        DBUtil.closeStatement(ps);
        DBUtil.closeResultSet(rs);
        return quantity;
    }
}
