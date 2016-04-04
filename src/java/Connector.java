




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
    private final String HOST = "Localhost";
    private final int PORT = 3306;
    private final String DATABASE = "polygon1";
    private String USERNAME = "root";
    private String PASSWORD = "Ua123459876";
    private String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
    private Connection Connection;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new Connector().getConnection();
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception ex) {

        } finally {
            Connection conn = null;
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return conn;
        }

    }
    public ResultSet doQuery(String query) throws SQLException{
        System.out.println("*********"+query);
        Statement stmt = Connection.createStatement();
        ResultSet res = stmt.executeQuery(query);
        return res;
    }
    
}
