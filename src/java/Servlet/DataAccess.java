
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
    PreparedStatement prep = con.prepareStatement("SELECT * fom logindetails WHERE username = ?;");
    
    prep.setString(1, username);
    ResultSet rs = prep.executeQuery();
    rs.next();
   return new User(rs.getString(1), rs.getString(2));
}

public boolean verifyUser(String username, String pw)
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
    return temp.getUsername().equals(username) && temp.getPassword().equals(pw);
}

}
