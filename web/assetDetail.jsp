<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : orderList
    Created on : Jan 3, 2018, 10:43:26 AM
    Author     : salkayali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="AssetCss.css">
        <title>Asset Request Submitted</title>
    </head>
    <h2>Your asset request has been successfully submitted! </h2>
     <form action="logout">
            <input name="logout" type="submit" value="Logout" class="logout"/>
        </form>
    
    <body>
        
        <table border="1" id="box">
            
                <tr>
                    <td>Our IT Team will contact you as soon as your request has been completed.
                        Thank you for using the IT Asset Request App.</td>
                </tr>
            
        </table> <br>

        
        <c:choose>
            <c:when test="${!empty assetlist }">
               
        <table  border="1" cellspacing="1" cellpadding="3" id="tbl2">
        
            <form>
               <tr>
                    <td><label> Request Title: </label><input type="text" name="title" value="${assetlist.title}" length="80"  readonly/></td>
                </tr>
                <tr>
                    <td><label> Project Code: </label><input type="text" name="code" value="${assetlist.code}" length="20" readonly/></td>
                </tr>
                <tr>
                    <td><label> Request Type : </label> <input type="text" name="requestType" value="${assetlist.requestType}"  readonly/></td>
                </tr>
                <tr>
                    <td><label> Request Type : </label><br>
                    <label> From: </label><input type="text" name="requestDateFrom" value="${assetlist.requestDateFrom}" length="20" readonly/>
                    <label> To: </label><input type="text" name="requestDateTo"  value="${assetlist.requestDateTo}" length="20" readonly/></td>
                </tr> 
                <tr>
                    <td><label> Requester Name: </label><input type="text" name="requester" value="${assetlist.requester}" length="20" readonly/></td>
                </tr>
                <tr>
                    <td><label> Is there a budget?</label> <input type="text" name="budget" value="${assetlist.budget}"  readonly/>
                            
                    </td>
                </tr>
                <tr>
                    <td >
                        <div class="role">
                        <label>Role of Asset:</label>  <c:forEach var="item" items="${assetlist.role}">${item}, 
                        </c:forEach>
                        </div>
                       
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Description of Need(Justification for request. Specify if this is for a project, red flag, etc..): </label> <br>
                        <textarea name="description" id="area" rows="4" cols="60" readonly><c:out value="${assetlist.description}" /></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                          <label>Hardware Requirements: (Processor, Memory, Diskspace, etc..) </label><br>
                        <textarea name="hardReq" id="area" rows="4" cols="60" readonly> <c:out value="${assetlist.hardReq}" /></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                         <label>Additional Requirements: </label><br>
                        <textarea name="addReq" id="area" rows="4" cols="60" readonly><c:out value="${assetlist.addReq}" /></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label> Operating System: </label>
                        <input type="text" name="os" value="${assetlist.os}${assetlist.otherOs} " readonly/><br>
                    </td>
                </tr>
                <td>
                        <label> Physical or Virtual machine:</label>
                        <input type="text" name="machineType" value="${assetlist.machineType}"  readonly/>
                    </td>
                    <tr>
                    <td>
                        <label>Hostname(s):</label>
                        <input type="text"  value="${assetlist.host}"  readonly/>
                    </td>
                </tr>
                <tr>
                    <td>
                         <label>Added to IT domain:</label>
                         <input type="text"  value="${assetlist.domain}"  readonly/>
                         
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>IP Settings(DHCP or Static):</label><input type="text" name="ipsettings" value="${assetlist.ipsettings}"  readonly/> <br>
                        
                         <label>IP Address:</label><input type="text" name="ipaddress" value="${assetlist.ipaddress}" readonly/>
                    </td>
                </tr>
               
                <tr>
                    <td>
                        <label>Criticality of Asset:</label><input type="text" value="${assetlist.criticality}" readonly/><br> 
                          
                    
                        <label>Backup Required:</label><input type="text" value="${assetlist.backup}" readonly/> <br> 
                        
                        <label>High Availability Required: </label><input type="text" value="${assetlist.availability}" readonly/> 
                       
                    </td>
                </tr>
            </form>
        </table>
                    </c:when>
        </c:choose>
              
                 
              
    </body>
</html>
