<%-- 
    Document   : userLogin
    Created on : Jan 18, 2018, 3:07:19 PM
    Author     : salkayali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="AssetCss.css">
        <title>Login Page : IT Asset Request Client  </title>
    </head>
    <body>
        <h1>IT Asset Request Client </h1>
       
    
        
        <form action="LoginServlet">
            <table border="1"  id="tbl4">
               <tr>
                   <td><label> Username: </label><input id="login" type="text" name="username" value="${param.title}" length="80" /></td>
                </tr>
                <tr>
                    <td><label> Password: </label><input id="login" type="password" name="password" value="${param.code}" length="20"/></td>
                </tr>
            </table>
                <input id="btn" type="submit" value="Login" />
                
        </form>
                
                <br>
                <br>
         <c:if test="${errMsgs !=null}">
            
                <c:forEach var="errMsgs"  items="${errMsgs}">
                    
                        <p id="errs">${errMsgs}</p>
                    
                </c:forEach>
            
        </c:if>
                
    </body>
</html>
