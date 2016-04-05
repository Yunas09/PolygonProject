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
        <form>
             <form action="Login" method="GET">
            <p>Username:
                <input type ="text" name="username"
            </p>
            <select name="username">
                <% 
                   UserDM DM = new UserDM();
                    ArrayList<User> users = DM.getUsers();
                    for(User user : users){
                        out.print("<option value='" + user.getUsername()+ "'>");
                        out.print(user.getUsername());
                        out.println("</option>");
                    }
                %>
            </select>
            <p>Password:</p>
            <input type="text" name="password" value=""/>
            <br>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
