/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.AssetDB;
import DB.AssetDBException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AssetBean;

/**
 *
 * @author salkayali
 */
public class ToApprovalPageServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     * @throws DB.AssetDBException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, AssetDBException {
        
       
        final String reqid = request.getParameter("reqid");
       
        AssetBean asset = new AssetBean();
        asset.setReqid(Integer.parseInt(reqid));
        asset.setReqStatus("Approved");
        
        
        
        // then assign to DB? look at update prod servlet
       AssetDB db = new AssetDB();
       db.updateForm(asset);
        
       
       // new to grab info
        AssetDB asset1 = new AssetDB();
       AssetBean bean = asset1.getRequest(reqid);
        
        
        
        
        HttpSession session = request.getSession();
        session.setAttribute("bean", bean );
       
        
        
        request.getRequestDispatcher("/approvalPage.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ToApprovalPageServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AssetDBException ex) {
            Logger.getLogger(ToApprovalPageServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ToApprovalPageServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AssetDBException ex) {
            Logger.getLogger(ToApprovalPageServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
