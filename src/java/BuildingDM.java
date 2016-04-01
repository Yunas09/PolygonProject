
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public BuildingDM() throws SQLException, ClassNotFoundException {
        Connector connect = new Connector();
        conn = (Connection) connect.getConnection();

    }

    public ArrayList<Building> BuildingDM(Connection con) throws SQLException {
        ArrayList Building = new Building();

        Statement stmt = null;
        String query = "select * from Building_Name";

        try {
            stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                String Building_Name = rs.getInt("Building_Name");
                String Building_Adress = rs.getString("Building_Adress");
                int Building_No = rs.getInt("Building_No");
                int Building_Size = rs.getInt("Building_Size");
                int Building_cond = rs.getInt("Building_cond");
                Building.add(new Building(Building_Name, Building_Adress, Building_No, Building_Size, Building_cond));
//                System.out.println(
//                        Player_pos + "\t" + Player_num + "\t"
//                        + teamID + "\t" + Player_name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();

            }
            System.out.println(Building);
        }
        return null;
    }
}
