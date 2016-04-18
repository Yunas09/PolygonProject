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
        <h1>Welcome Customer.. </h1>
        <h4>If you want to add a building. Please fill the boxes.</h4>
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


            <p><input type="submit" value="Add Building" /></p>
        </form>
        
         
        
           <form action="BuildingSearch.jsp">
               <h2>Want to check information about you building Click here</h2>

<input type="submit" value="My Buildings Information" <a href="/BuildingSearch.jsp">
    
           </form>
        <center>
       <h1>File Upload to Database Demo</h1>
       <form method="post" action="uploadServlet" enctype="multipart/form-data">
           <table border="0">
               <tr>
                   <td>b Name: </td>
                   <td><input type="text" name="Building_Name" size="50"/></td>
               </tr>
               <tr>
                   <td>b adress: </td>
                   <td><input type="text" name="Building_Adress" size="50"/></td>
               </tr>
               <tr>
                   <td>b no: </td>
                   <td><input type="text" name="Building_No" size="50"/></td>
               </tr>
               <tr>
                   <td>b size: </td>
                   <td><input type="text" name="Building_Size" size="50"/></td>
               </tr>
                <tr>
                   <td>b cond: </td>
                   <td><input type="text" name="Building_cond" size="50"/></td>
               </tr>
               <tr>
                   <td>Portrait Photo: </td>
                   <td><input type="File" name="File" size="50"/></td>
               </tr>
               <tr> 
                   <td colspan="2">
                       <input type="submit" value="Save">
                   </td>
               </tr>
           </table>
       </form>
   </center>
    </body>
</html>
