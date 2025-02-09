/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.utility;

import java.util.Date;
import javax.mail.MessagingException;

/**
 *
 * @author Mohit
 */
public class MailMessage {
        public static void registrationSuccess(String recipientMailId, String name)  throws MessagingException {
        String subject = "Registration Successfull";
        String htmlTextMessage = "" + "<html>" + "<body>"
                + "<h2 style='color:green;'>Welcome to " + AppInfo.appName + "</h2>" + "" + "Hi " + name + ","
                + "<br><br>Thanks for singing up with " + AppInfo.appName + ".<br>"
                + "We are glad that you choose us. We invite you to check out our latest collection of new electonics appliances."
                + "<br>We are providing upto 60% OFF on most of the electronic gadgets. So please visit our site and explore the collections."
                + "<br><br>Our Online electronics is growing in a larger amount these days and we are in high demand so we thanks all of you for "
                + "making us up to that level. We Deliver Product to your house with no extra delivery charges and we also have collection of most of the"
                + "branded items.<br><br>As a Welcome gift for our New Customers we are providing additional 10% OFF Upto 500 Rs for the first product purchase. "
                + "<br>To avail this offer you only have "
                + "to enter the promo code given below.<br><br><br> PROMO CODE: " + "" + AppInfo.appName.toUpperCase() + "500<br><br><br>"
                + "Have a good day!<br>" + "" + "</body>" + "</html>";
        JavaMailUtil.sendMail(recipientMailId, subject, htmlTextMessage);
    }
        public static void orderPlaced(String recipientMailId, String name,String orderId) throws MessagingException {
        String subject = "Payment SuccessFull";
        Date today=new Date();
        String htmlTextMessage = "" + "<html>" + "<body>"
                +"<h6>Dear "+name+
                "</h6><br>This email confirms that your recent order from "+AppInfo.appName+" has been successfully placed and payment has been received.\n" +
                "<br>Your Order Id is "+orderId+"\n" +
                "<br>Order Date: "+today.getDate()+"-"+(today.getMonth()+1)+"-"+(today.getYear()+1900)+"\n" +
                "<br>We're excited to get your order shipped out to you as soon as possible. You will receive another email notification once your order has been shipped.\n" +
                "<br>If you have any questions or require assistance, please don't hesitate to contact us at "+AppInfo.appEmail+" or by phone at 9329959041.\n" +
                "Thank you for your order!\n" +
                "<br>Sincerely,\n" +
                "<br>The "+AppInfo.appName+" Team" + "" + "</body>" + "</html>";
        JavaMailUtil.sendMail(recipientMailId, subject, htmlTextMessage);
    }
        public static void shippedSuccess(String recipientMailId,String orderId) throws MessagingException {
        String subject = "Order Shipped Successfully";
        Date today=new Date();
        String htmlTextMessage = "" + "<html>" + "<body>"
                +"<h6>Dear User"+
                "</h6><br>This email confirms that your recent order from "+AppInfo.appName+" with Order Id : "+orderId+" has been shipped.\n"+
                "<br>The expected delivery date of your order is "+(today.getDate()+7)+"-"+(today.getMonth()+1)+"-"+(today.getYear()+1900)+"\n" +
                "<br>If you have any questions or require assistance, please don't hesitate to contact us at "+AppInfo.appEmail+" or by phone at 9329959041.\n" +
                "Thank you for your order. We hope you enjoy your purchase!" +
                "<br>Sincerely,\n" +
                "<br>The "+AppInfo.appName+" Team" + "" + "</body>" + "</html>";
        JavaMailUtil.sendMail(recipientMailId, subject, htmlTextMessage);
    }
}
