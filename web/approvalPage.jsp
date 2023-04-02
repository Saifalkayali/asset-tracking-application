 <%-- 
    Document   : logout
    Created on : Mar 24, 2018, 3:29:05 PM
    Author     : salkayali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="AssetCss.css">
        <title>Approval </title>
    </head>
    <body class="logout_img">
        <form action="sendReq" method="get">
        <h1>Approval Page</h1>
        <table>
            <br>
            <tr><td>
        <label>Notes for Requester: </label> <br>
        <textarea id="area" name="content" rows="4" cols="60"></textarea></td></tr>
            <tr>
                <td>
                            <input id="btn"  type="submit" value="Send">
                        </form></td>
            </tr>
                        </table>
        
    </form></body>
</html>
