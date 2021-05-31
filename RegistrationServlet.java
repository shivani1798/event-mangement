/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistrationServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     //   String id = request.getSession().getAttribute("id").toString();
        String username = request.getParameter("username");
        String password = request.getParameter("password");  
        //System.out.println(username);
        
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection;
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/event?autoReconnect=true&useSSL=false", "root", "root");
            Statement statement = connection.createStatement();
            
           // String password;
           System.out.println(username);
            int resultSet = statement.executeUpdate("insert into users values('"+username+"','"+password+"')");
         
            
            if (resultSet ==1) {
                PrintWriter out = response.getWriter();
                //out.println("SucessFul");
                response.sendRedirect("Login.jsp");
                out.println("SucessFul");
                out.close();
                

            } else {
                PrintWriter out = response.getWriter();
                out.println("Not Sucess");
                out.close();
            }
        } catch (SQLException ex) {
            PrintWriter out = response.getWriter();
            out.println("Exception Occur");
            out.close();

        } catch (Exception ex) {

        } finally {

            PrintWriter out = response.getWriter();
            out.println("SomeThing Went Wrong Try Again...");
            out.close();
        }

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