
import com.mysql.jdbc.Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yuyu
 */
public class BuildingDM {

    Connection conn;
    
    public BuildingDM(){
        Connector connect = new Connector();
       conn = (Connection) connect.getConnection();
    }
}
