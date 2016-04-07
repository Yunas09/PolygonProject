<%-- 
    Document   : HomePage
    Created on : 04-04-2016, 12:38:19
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
        <h1>Add Building!</h1>
        <form method="post" action="BuildingAdd">
            
            <table border="1">
                <thead>
                    <tr>
                        <th>Building Name
        <input type="text" name="Building_Name" value="" /></th>
                        <th>Building Size
        <input type="text" name="Building_Size" value="" /></th>
                        <th> Building Cond
        <input type="text" name="Building_cond" value="" /></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Building Adress
        <input type="text" name="Building_Adress" value="" /></td>
                        
                        <td>Building No
        <input type="text" name="Building_No" value="" /></td>
                    </tr>
                    <tr>
                        
                    </tr>
                </tbody>
            </table>

        
        
        
        
        
        
        
        
       
        <input type="submit" value="Submit" />
        </form>
    </body>
</html>
