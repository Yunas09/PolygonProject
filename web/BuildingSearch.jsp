<%-- 
    Document   : BuildingSearch
    Created on : 13-04-2016, 11:35:59
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
        <br/><br/>
    <form method="post" name="frm" action="BuildingSearch">
      <table border="0" width="300" align="center" bgcolor="#e9f">
        <tr><td colspan=2 style="font-size:12pt;" align="center">
        <h3>Search Building Information</h3></td></tr>
        <tr><td ><b>Building_No</b></td>
          <td>: <input  type="text" name="pid" id="pid">
        </td></tr>        
        <tr><td colspan=2 align="center">
        <input  type="submit" name="submit" value="BuildingSearch"></td></tr>
      </table>
    </form>
    </body>
</html>
