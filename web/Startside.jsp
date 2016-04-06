<%-- 
    Document   : Startside
    Created on : 01-04-2016, 10:17:14
    Author     : Yuyu
--%>

<%@page import="DM.UserDM"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DM.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Polygon</h1>
        <form action="login" method="post">

            <p>username:<p>
                <input type ="text" name="username" value=""
            </p>
            
            <p>password:</p>
            <input type="password" name="password" value="" />
            <br>
            <input type="submit" name="do_this" value="login"/>

        </form>
    </body>
</html>
