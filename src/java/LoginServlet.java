//package pack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.io.FileDescriptor.out;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author KRISHNA
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ResultSet resultSet;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection;
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/event", "root", "root");
            Statement statement = connection.createStatement();
            
            
                resultSet = statement.executeQuery("select * from user where username='" + username + "' limit 1");

                if (resultSet != null) {

                    if (resultSet.next()) {
                        if (resultSet.getString("Password").equals(password.toString())) {
                            HttpSession session = request.getSession();
                            session.setAttribute("username", resultSet.getInt("username"));

                            response.setContentType("text/html");
                            
                            request.getRequestDispatcher("Home.jsp").forward(request, response);

                        } else {

                            PrintWriter out = response.getWriter();
                            out.println("Password Not Match Try Again...");
                            out.close();
                        }
                    }

                } else {
                    PrintWriter out = response.getWriter();
                    out.println("user Not Found Try Again...");
                    out.close();
                }
        } catch (SQLException ex) {
            PrintWriter out = response.getWriter();
            out.println("Sql Exception Try Again...");
            out.close();

        } catch (Exception ex) {

        } finally {

            PrintWriter out = response.getWriter();
            out.println("SomeThing Went Wrong Try Again...");
            out.close();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
