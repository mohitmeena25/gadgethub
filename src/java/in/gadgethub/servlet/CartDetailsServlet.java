package in.gadgethub.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import in.gadgethub.dao.impl.CartDaoImpl;
import in.gadgethub.dao.impl.ProductDaoImpl;
import in.gadgethub.pojo.CartPojo;
import in.gadgethub.pojo.ProductPojo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mohit
 */
public class CartDetailsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        String userName = (String) session.getAttribute("userName");
        String password = (String) session.getAttribute("password");
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equalsIgnoreCase("customer")) {
            response.sendRedirect("login.jsp?message=Access denied ! Please login as customer");
        } else if (userName == null || password == null) {
            response.sendRedirect("login.jsp?message=Session expired ! Please login again");
        }
        //some more code will come here
        String addStr=request.getParameter("add");
        if(addStr!=null){
           int add=Integer.parseInt(addStr);
           String uid=request.getParameter("uid");
           String pid=request.getParameter("pid");
           int avail=Integer.parseInt(request.getParameter("avail"));
           int cartQty=Integer.parseInt(request.getParameter("qty"));
           CartDaoImpl cartDao=new CartDaoImpl();
           if(add==1){
               cartQty+=1;
               CartPojo cartPojo=new CartPojo();
               cartPojo.setProdId(pid);
               cartPojo.setQuantity(1);
               cartPojo.setUseremail(uid);
               cartDao.addProductToCart(cartPojo);
           }else if(add==0){
               cartQty-=1;
               CartPojo cartPojo=new CartPojo();
               cartPojo.setProdId(pid);
               cartPojo.setQuantity(cartQty);
               cartPojo.setUseremail(uid);
               cartDao.upDateProductInCart(cartPojo);
           }
        }
        CartDaoImpl cartDao=new CartDaoImpl();
        ProductDaoImpl productDao=new ProductDaoImpl();
        List<CartPojo>cartItems=new ArrayList<>();
        cartItems=cartDao.getAllCartItems(userName);
        Map<String,Object>map=new HashMap<>();
        for(CartPojo cp:cartItems){
            String prodId=cp.getProdId();
            ProductPojo product=productDao.getProductDetails(prodId);
            map.put(prodId, product);
        }
        RequestDispatcher rd=request.getRequestDispatcher("cartDetails.jsp");
        request.setAttribute("userName", userName);
        request.setAttribute("cartItems",cartItems);
        request.setAttribute("map",map);
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
