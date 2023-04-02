/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UserBean;

/**
 * This class will handle the login process for users
 * @author salkayali
 */
public class LoginServlet extends HttpServlet {

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
       
     List<String> errMsgs = new LinkedList<>();//class list 	  
    
     try {
     UserBean user = new UserBean();
     user.setUserName(request.getParameter("username"));
     user.setPassword(request.getParameter("password"));
     
     //if the username is trimed and it's empty or pasword is trimmed and empty
     if (user.getUsername().trim().isEmpty()  || user.getPassword().trim().isEmpty()   ){//checks if fields are empty
            errMsgs.add("Username or Password is empty or invalid");
            request.setAttribute("errMsgs", errMsgs);
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            
        }
     if ("Ryan".equals(user.getUsername()) && "12345678".equals(user.getPassword())){
        
          HttpSession session = request.getSession();	    
          session.setAttribute("Username",user.getUsername()); 
          response.sendRedirect("assetForm.jsp"); //logged-in page   
     }
     if ("Sean".equals(user.getUsername()) && "1234".equals(user.getPassword())){
        
          HttpSession session = request.getSession();	    
          session.setAttribute("Username",user.getUsername()); 
          response.sendRedirect("request"); //logged-in page   
     }
             }
     catch(IOException theException){
         
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

