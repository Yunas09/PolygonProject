<%-- 
    Document   : Bui_Search
    Created on : 13-04-2016, 11:45:16
    Author     : Yuyu
--%>

<%@page import="java.util.Iterator"%>
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
                <td colspan=5 align="center"
                    style="background-color:teal">
                    <b>Building Record</b></td>
            </tr>
            <tr style="background-color:lightgrey;">
                <td><b>Building name</b></td>
                <td><b>Building adress</b></td>
                <td><b>Building Number</b></td>
                <td><b>Building size</b></td>
                <td><b>Building Condition</b></td>
            </tr>
            <%
                int count = 0;
                String color = "#F9EBB3";
                ArrayList<String> piList = (ArrayList<String>)request.getAttribute("piList");
            %>
             
             
                 <tr style="background-color:<%=color%>;">
                <td><%=piList.get(0)%></td>
                <td><%=piList.get(1)%></td>
                <td><%=piList.get(2)%></td>
                <td><%=piList.get(3)%></td>
                <td><%=piList.get(4)%></td>
            </tr>
             
            
            
            
                       
            
        </table>  
    </body>
</html>
