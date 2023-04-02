<%-- 
    Document   : reqDetail
    Created on : Mar 21, 2018, 12:17:58 PM
    Author     : salkayali
--%>

<%@page import="model.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="AdminCss.css">
        <title>Request Detail</title>
    </head>
    <img src="logo.png" alt=" ">
       <c:choose>
            <c:when test="${!empty editForm }">
                <h1>Request Detail : ${editForm.title}</h1>
                
                <table class="admin">
                    <tr>
                         <td><label> Administrator: </label>
                          <!-- <% out.print(session.getAttribute("Username"));%>  -->
                            ${Username}
                        </td>
                    </tr>
                   
     </table>
                         <body>
                  <table id="tbl5">
                    <tr>
                        <td> <form action="request" method="get">
                            <button id="btn" title="Request List" name="action" >Request List</button>
                        </form></td>
                        <td><label> Status:${editForm.reqStatus}  </label></td>
                        <!--
                        Here you can add the buttons again on this page, maybe a Formedit bean naming error
                         <td>
                                <form action="approve" method="get">
                             <button id="btn" name="reqid" value="${editForm.reqid}">Approve</button>
                                </form>
                            </td>
                        -->
                              
                            
                    </tr>
     </table>      
                        <br>      
               
                
           
        <table  border="1" cellspacing="1" cellpadding="3" id="tbl3">      
            
           <form>
               <tr>
                    <td><label> Request Title: </label><input type="text" name="title" value="${editForm.title}" length="80"  readonly/></td> 
                </tr>
                <tr>
                    <td><label> Project Code: </label><input type="text" name="code" value="${editForm.code}" length="20" readonly/></td>
                </tr>
                <tr>
                    <td><label> Request Type : </label> <input type="text" name="requestType" value="${editForm.requestType}"  readonly/></td>
                </tr>
                <tr>
                    <td><label> Request Type : </label><br>
                    <label> From: </label><input type="text" name="requestDateFrom" value="${editForm.requestDateFrom}" length="20" readonly/>
                    <label> To: </label><input type="text" name="requestDateTo"  value="${editForm.requestDateTo}" length="20" readonly/></td>
                </tr> 
                <tr>
                    <td><label> Requester Name: </label><input type="text" name="requester" value="${editForm.requester}" length="20" readonly/></td>
                </tr>
                <tr>
                    <td><label> Is there a budget?</label><input type="text" name="budget" value="${editForm.budget}"  readonly/></td>
                </tr>
                <tr>
                 <td>
                     <label>Role of Asset: </label><input class="role" value="<%
                        String[] theRoles = (String[])request.getAttribute("Role");
                        
                        for (String tempRole :theRoles){
                            out.println(tempRole + ",");
                        }
                        
                        

                        %>"
                    />
                 </td>
                </tr>
                <tr>
                   
                </tr>
                <tr>
                    <td>
                        <label>Description of Need(Justification for request. Specify if this is for a project, red flag, etc..): </label> <br>
                        <textarea id="area" name="description" id="area" rows="4" cols="60" readonly>${editForm.description}</textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                          <label>Hardware Requirements: (Processor, Memory, Diskspace, etc..) </label><br>
                        <textarea id="area" name="hardReq" id="area" rows="4" cols="60" readonly>${editForm.hardReq}</textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                         <label>Additional Requirements: </label><br>
                        <textarea id="area" name="addReq" id="area" rows="4" cols="60" readonly>${editForm.addReq}</textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label> Operating System: </label>
                        <input type="text" name="os" value="${editForm.os}${editForm.otherOs} " readonly/><br>
                    </td>
                </tr>
                <td>
                        <label> Physical or Virtual machine:</label>
                        <input type="text" name="machineType" value="${editForm.machineType}"  readonly/>
                    </td>
                    <tr>
                    <td>
                        <label>Hostname(s):</label>
                        <input type="text"  value="${editForm.host}"  readonly/>
                    </td>
                </tr>
                <tr>
                    <td>
                         <label>Added to AD </label>
                         <input type="text"  value="${editForm.domain}"  readonly/>
                         
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>IP Settings(DHCP or Static):</label><input type="text" name="ipsettings" value="${editForm.ipsettings}"  readonly/> <br>
                        
                         <label>IP Address:</label><input type="text" name="ipaddress" value="${editForm.ipaddress}" readonly/>
                    </td>
                </tr>
               
                <tr>
                    <td>
                        <label>Criticality of Asset:</label><input type="text" value="${editForm.criticality}" readonly/><br> 
                          
                    
                        <label>Backup Required:</label><input type="text" value="${editForm.backup}" readonly/> <br> 
                        
                        <label>High Availability Required: </label><input type="text" value="${editForm.availability}" readonly/> 
                       
                    </td>
                </tr>
            </form>
        </table>
                    </c:when>
        </c:choose>
    </body>
</html>
