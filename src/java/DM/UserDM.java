package DM;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Controller.Connector;

public class UserDM {

    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        try {
            Connector c = new Connector();
            ResultSet res = c.doQuery("SELECT * FROM user");
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
            ResultSet res = c.doQuery("SELECT * FROM user WHERE username = '" + username + "'");
            if (res.next()) {
                String password = res.getString("password");

                user = new User(username, password);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return user;
    }
}
