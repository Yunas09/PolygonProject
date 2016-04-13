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
        
      
        
        <h1>Database Lookup</h1>
        <form action="index.jsp">

<input type="submit" value="Click Here!!" <a href="/index.jsp">
</form>
        
        
        <h3>Update BuildingInformation</h3>
        <form action="MANGLER" method="post">
        BuildingName
        <input type="text" name="Building_Name"/>
       
        BuildingAdress
        <input type="text" name="Building_adress"/>
       
        BuildingNo
        <input type="text" name="Building_No"/>
        
        BuildingSize
        <input type="text" name="Building_Size"/>
        
        BuildingCond
        <input type="text" name="Building_cond"/>
        
        <input type="submit" value="Change Values"/>
       
        </form>
    </body>
</html>
