/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.AssetDB;
import DB.AssetDBException;
import Email.SendMail;
import java.io.IOException;
import java.sql.SQLException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AssetBean;

/**
 * This class will be handling the form submission 
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
     * @throws DB.AssetDBException
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException, AssetDBException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        final String title = request.getParameter("title");
        final String code = request.getParameter("code");
        final String requestType = request.getParameter("requestType");
        final String requestDateFrom = request.getParameter("requestDateFrom");
        final String requestDateTo = request.getParameter("requestDateTo");
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
        final String ipsettings = request.getParameter("ipsettings");
        final String ipaddress = request.getParameter("ipaddress");
        final String criticality = request.getParameter("criticality");
        final String backup = request.getParameter("backup");
        final String availability = request.getParameter("availability");
        
        
        
         List<String> errMsgs = new LinkedList<>();//class list 
        
                
        AssetBean asset = new AssetBean();
             
        if((requestDateFrom.trim().isEmpty() && requestDateTo.trim().isEmpty() ) ){
              asset.setRequestDateFrom(null);
              asset.setRequestDateTo(null);
        }else{
        try{
            asset.setRequestDateFrom(LocalDate.parse(requestDateFrom));
            asset.setRequestDateTo(LocalDate.parse(requestDateTo));
        }catch(DateTimeParseException ex){
            errMsgs.add("Date format is invalid");        
        }
        }
        if (errMsgs.isEmpty()) {// if there are no errors in the err list 
        
            
        
        asset.setTitle(title);
        asset.setCode(code);
        asset.setRequestType(requestType);       
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
        asset.setIpsettings(ipsettings);
        asset.setIpaddress(ipaddress);
        asset.setCriticality(criticality);
        asset.setBackup(backup);
        asset.setAvailability(availability);
        
        HttpSession session = request.getSession();	               
        
        AssetDB form = new AssetDB();
        form.insertForm(asset);
            
              
        
        session.setAttribute("form", form);
        session.setAttribute("assetlist", asset);        
        
        
        //sends email to IT
        
        String subject = ( title +  " - "+ "New Asset Request ");
        String message = " New Asset Request";
        String content = "Request Title :" + title + "\n" + "Message from IT:"  + message ;
        
        SendMail.sendEmail(content, subject);
        
        
        
        
        response.sendRedirect("assetDetail.jsp");
    }   
        else{
        HttpSession session = request.getSession();	    
        session.setAttribute("errMsgs", errMsgs);
        response.sendRedirect("assetForm.jsp");
           
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(SubmitFormServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AssetDBException ex) {
            Logger.getLogger(SubmitFormServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
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
        } catch (AssetDBException ex) {
            Logger.getLogger(SubmitFormServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
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
