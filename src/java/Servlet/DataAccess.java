
package Servlet;


import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.resource.spi.Connector;
import DM.*;
import java.sql.DriverManager;

public class DataAccess{
        Connection con;
        
        
        public DataAccess() throws SQLException, ClassNotFoundException {
                
    Controller.Connector connect = new Controller.Connector();
    con = (Connection) connect.getConnection();
   }
  
public User getUser(String username) throws SQLException
{
    PreparedStatement prep = con.prepareStatement("SELECT * from user WHERE username = ?;");
    
    prep.setString(1, username);
    ResultSet rs = prep.executeQuery();
    rs.next();
   return new User(rs.getString(1), rs.getString(2));
}

public boolean verifyUser(String username, String password)
{
    User temp;
    
    try
    {
     temp = getUser(username);
    }
    catch (SQLException ex)
    {
        System.out.println("Not in a database");
        return false;
        
        
    }
    return temp.getUsername().equals(username) && temp.getPassword().equals(password);
}
public static boolean checkUser(String user,String pass) 
     {
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=(Connection) DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/test","root","studytonight");
         PreparedStatement ps =con.prepareStatement
                             ("select * from logindetail where username=? and password=?");
         ps.setString(1, user);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
}
