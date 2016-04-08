<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : AdminSite
    Created on : 07-04-2016, 13:23:56
    Author     : Yuyu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="CreateUser.jsp">
        <p>Create Customer</p>
            <input type="submit" value="Click Here !!" <a href="/CreateUser.jsp">
                </form>
        
        <form>
            Name
            <input type="text" name="Name" value="" />
            Password
            <input type="text" name="Password" value="" />
            Adress
            <input type="text" name="Adress" value="" />
            Zip
            <input type="text" name="Zip" value="" />
        </form>
        
        
    </body>
</html>
