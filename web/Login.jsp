<%-- 
    Document   : Login
    Created on : 01-04-2016, 11:49:59
    Author     : Yuyu
--%>

<%@page import="model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.UserDM"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Login" method="GET">
            <p>Username:</p>
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
            <input type="text" name="password" value="1234"/>
            <br>
            <input type="submit" value="Login"/>
       </form>
    </body>
</html>
