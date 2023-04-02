/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AssetBean;

/**
 *
 * @author salkayali
 */
public class SubmitFormServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.text.ParseException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        final String title = request.getParameter("title");
        final String code = request.getParameter("code");
        final String requestType = request.getParameter("requestType");
        final String requestDateFromString = request.getParameter("requestDateFrom");
        final String requestDateToString = request.getParameter("requestDateTo");
        final String requester = request.getParameter("requester");
        final String budget = request.getParameter("budget");
        final String[] role = request.getParameterValues("role");
        final String description = request.getParameter("description");
        final String hardReq = request.getParameter("hardReq");
        final String addReq = request.getParameter("addReq");
        final String os = request.getParameter("os");
        final String otherOs = request.getParameter("otherOs");
        final String machineType = request.getParameter("machineType");
        final String host = request.getParameter("host");
        final String domain = request.getParameter("domain");
        final String criticality = request.getParameter("criticality");
        final String backup = request.getParameter("backup");
        final String availability = request.getParameter("availability");
        
        
        
        
        
                
        AssetBean asset = new AssetBean();
        asset.setTitle(title);
        asset.setCode(code);
        asset.setRequestType(requestType);
        
        if(!(requestDateFromString.trim().isEmpty() && requestDateFromString.trim().isEmpty() ) ){
            DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
            Date requestDateFrom = (Date) df.parse(requestDateFromString);
            Date requestDateTo = (Date) df.parse(requestDateToString);
            asset.setRequestDateFrom(requestDateFrom);
            asset.setRequestDateTo(requestDateTo);
        }
        asset.setRequester(requester);
        asset.setBudget(budget);
        asset.setRole(role);
        asset.setDescription(description);
        asset.setHardReq(hardReq);
        asset.setAddReq(addReq);
        asset.setOs(os);
        asset.setOtherOs(otherOs);
        asset.setMachineType(machineType);
        asset.setHost(host);
        asset.setDomain(domain);
        asset.setCriticality(criticality);
        asset.setBackup(backup);
        asset.setAvailability(availability);
        
        
        
        request.setAttribute("asset",asset);        
        request.getRequestDispatcher("/orderList.jsp").forward(request, response);
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
        } catch (ParseException ex) {
            Logger.getLogger(SubmitFormServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ParseException ex) {
            Logger.getLogger(SubmitFormServlet.class.getName()).log(Level.SEVERE, null, ex);
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
