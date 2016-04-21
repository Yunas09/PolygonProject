/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DM;

/**
 *
 * @author Yuyu
 */
public class Customer {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Customer(String username, String password, String adress, String zip) {
        this.username = username;
        this.password = password;
        this.adress = adress;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Customer{" + "username=" + username + ", password=" + password + ", adress=" + adress + ", zip=" + zip + '}';
    }
    
    private String username;
    private String password;
    private String adress;
    private String zip;
    
    
}
