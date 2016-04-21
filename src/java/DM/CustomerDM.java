/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DM;
import DM.Customer;
import DbUtility.Connector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Yuyu
 */
public class CustomerDM {
    
    public ArrayList<String> SearchCustomer(String pid) throws SQLException, ClassNotFoundException{
        
       Connector con = new Connector();
        
      
        ArrayList<String> CustSearch = new ArrayList<String>();
        
        String query = "select * from logindetails where username='" + pid + "' ";

        System.out.println("query " + query);
        
        ResultSet rs = con.doQuery(query);

        while (rs.next()) {
            

            CustSearch.add(rs.getString(1));
            CustSearch.add(rs.getString(2));
            CustSearch.add(rs.getString(3));
            CustSearch.add(rs.getString(4));
            
            System.out.println("al :: " + CustSearch);
           
            }
       return CustSearch;
    }
    
    
}
