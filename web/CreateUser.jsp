<%-- 
    Document   : CreateUser
    Created on : 06-04-2016, 12:10:11
    Author     : Yuyu
--%>

<%@page import="javax.resource.spi.Connector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>CreateUser</h1>
        <form method="post" action="Register">
            <p>Name:<input type="text" name="name" /><br/></p>

            <p>Password:<input type="password" name="pass"  /><br/></p>
            
            <p>Adress:<input type="Adress" name="Adress"  /><br/></p>
            
            <p>Zip:<input type="Zip" name="Zip"  /><br/></p>
            
            
            
            <input type="submit" value="register" />
            
        </form>
    </body>
</html>