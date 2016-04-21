<%-- 
    Document   : searchview
    Created on : 20-04-2016, 11:33:00
    Author     : Yuyu
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table width="700px" align="center"
               style="border:1px solid #000000;">
            <tr>
                <td colspan=4 align="center"
                    style="background-color:teal">
                    <b>User Record</b></td>
            </tr>
            <tr style="background-color:lightgrey;">
                <td><b>Name</b></td>
                <td><b>Password</b></td>
                <td><b>Adress</b></td>
                <td><b>Zip</b></td>
               
            </tr>
            <%
                
                int count = 0;
                String color = "#F9EBB3";
                ArrayList<String> poList = (ArrayList<String>)request.getAttribute("poList");
            %>
           
            <tr style="background-color:<%=color%>;">
                <td><%=poList.get(0)%></td>
                <td><%=poList.get(1)%></td>
                <td><%=poList.get(2)%></td>
                <td><%=poList.get(3)%></td>
            </tr>
            
            
            
        </table>
    </body>
</html>
