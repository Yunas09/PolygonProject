package DM;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Controller.Connector;
import java.sql.PreparedStatement;
import Controller.Connector;


public class UserDM {

    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        try {
            Connector c = new Connector();
            ResultSet res = c.doQuery("SELECT * FROM logindetails");
            while (res.next()) {
                String username = res.getString("username");
                String password = res.getString("password");

                users.add(new User(username, password));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public User getUser(String username) {
        User user = null;
        try {
            Connector c = new Connector();
            ResultSet res = c.doQuery("SELECT * FROM logindetails WHERE username = '" + username + "'");
            if (res.next()) {
                String password = res.getString("password");

                user = new User(username, password);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return user;
    }
    public ArrayList<User> Register() {
        ArrayList<User> users1 = new ArrayList<>();
        try {
            Connector c = new Connector();
            ResultSet res = c.doQuery("SELECT * FROM logindetails");
            while (res.next()) {
                String username1 = res.getString("username1");
                String password1 = res.getString("password1");

                users1.add(new User(username1, password1));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return users1;
    }
    
//    public void Regsiter (String username1, String password1) throws SQLException, ClassNotFoundException  
//{
//  try {
//            Connector c = new Connector();
//            ResultSet res = c.doQuery("SELECT * FROM logindetails WHERE username = '" + username + "'");
//            if (res.next()) {
//                String password = res.getString("password");
//
//                user = new User1(username1, password);
//            }
//        } catch (SQLException | ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//        return ;
}

