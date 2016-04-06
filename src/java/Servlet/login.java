/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Yuyu
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    DataAccess DA;

    @Override
    public void init(ServletConfig config) throws ServletException {

        try {
            DA = new DataAccess();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.init(config);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        response.setContentType("text/html;charset=UTF-8");
        String do_this = request.getParameter("do_this");

        switch (do_this) {
            case "login":
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                session.setAttribute("username", username);
                session.setAttribute("password", password);

                if (DA.verifyUser(username, password)) {
                    session.setAttribute("username", username);

                    forward(request, response, "/HomePage.jsp");

                }
                forward(request, response, "/HomePage.jsp");
                break;
            case "getuser":

                String userName = request.getParameter("userName");

                session.setAttribute("userName", userName);
                break;
        }
        {
            forward(request, response, "/index.html");
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void forward(HttpServletRequest request, HttpServletResponse response, String dest) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher(dest);
        rd.forward(request, response);
        
         
    }

}