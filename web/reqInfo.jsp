<%-- 
    Document   : reqInfo
    Created on : Mar 29, 2018, 1:17:55 PM
    Author     : salkayali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="AssetCss.css">
        <title>Request for more information</title>
    </head>
    <body class="logout_img">
        <h1>Request for more information</h1>
        <table>
        <form action="sendMoreInfo">
            <tr><td>
        <label> Message Details:  </label> <br>
        <textarea id="area" name="content" rows="4" cols="60"></textarea></td></tr>
            <tr>
                <td>
                            <button id="btn"  name="action" value="">Send</button>
                        </td>
            </tr>
                        </table>
        
    </form>
    </body>
</html>
