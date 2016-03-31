
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuyu
 */
public class Connector {
    static final String HOST = "Localhost";
    static final int PORT = 3306;
    static final String DATABASE = "polygon1";
    static String USERNAME = "root";
    static String PASSWORD = "Yunasyunas09";
    static String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
    private Connection Connection;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new Connector().getConnection();
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception ex) {

        } finally {
            Connection con = null;
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return con;
        }

    }
    public ResultSet doQuery(String query) throws SQLException{
        System.out.println("*********"+query);
        Statement stmt = Connection.createStatement();
        ResultSet res = stmt.executeQuery(query);
        return res;
    }
    
}
