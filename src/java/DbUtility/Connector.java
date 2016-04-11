package DbUtility;






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
    static final String HOST     = "Localhost";
    static final int    PORT     = 3306;
    static final String DATABASE = "Polygon1";
    static final String USERNAME = "root"; 
    static final String PASSWORD = "Yunasyunas09";
    static String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
    static Connection connection;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new Connector().getConnection();
    }
    
    public Connector() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
        connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
    }
    
     public ResultSet doQuery(String query) throws SQLException{
        System.out.println("*********"+query);
        Statement stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery(query);
        return res;
    }
    
    public void doUpdate(String query) throws SQLException{
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
    }
    
    public Connection getConnection() throws SQLException, ClassNotFoundException {

      
            return connection;
        }

    }
   

