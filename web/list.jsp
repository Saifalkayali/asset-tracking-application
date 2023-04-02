<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : list
    Created on : Mar 8, 2018, 1:13:28 PM
    Author     : salkayali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="AdminCss.css">
        <title>IT Requests </title>
    </head>
   
    <img src="logo.png" alt=" ">
    <form action="logout">
            <input name="logout" type="submit" value="Logout" class="logout"/>
        </form>
     <h1>IT Asset Requests</h1>
     <table class="admin">
                    <tr>
                         <td><label> Administrator: </label>
                            <% out.print(session.getAttribute("Username"));%>                        
                        </td>
                    </tr>
     </table>
                        
                      
    <br>
    <body>
        
        <table id="tbl1" border="2">
            <thead>
                <tr>
                    <th>ReqID</th>
                    <th>Request Title </th>
                    <th>Request Status</th>
                    <th>Requester</th>
                    <th>Due Date </th>                    
                    <th colspan="4"></th>
                </tr>
            </thead>
           

            <tbody>            
                <tr><c:forEach var="asset" items="${assets}">
                    <td>${asset.reqid} </td>    
                    <td><form action="editForm" method="get">
                            <button class="click" type='submit' title="edit" name="req" value="${asset.reqid}">${asset.title}
                            </button><form></td>
                    <td>${asset.reqStatus}</td>
                    <td>${asset.requester}</td>
                    <td>${asset.requestDateFrom}</td>
                                     <form action="" method="get">
                            
                                </form>
                          <td>
                                <form action="editForm" method="get">
                             <button class="button4" name="req" value="${asset.reqid}">View</button>
                                </form>
                            </td>
                              <td>
                                <form action="approve" method="get">
                             <button id="btn" name="reqid" value="${asset.reqid}">Approve</button>
                                </form>
                            </td>
                             
                            <td>
                                <form action="moreInfo" method="get">
                            <button id="info"  name="reqid" value="${asset.reqid}">More Info</button>
                        </form>
                            </td>
                            <td>
                                <form action="admin" method="get">
                            <button id="del"  name="reqid" value="${asset.reqid}">Admin</button>
                        </form>
                            </td>
                    </tr></c:forEach>   
            </tbody>
    </table><br>
                
    
        
    </body>
</html>