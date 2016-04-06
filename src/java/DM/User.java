package DM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuyu
 */
public class User {

    private String userName;
    private String passWord;
    
     public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;

    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = userName;
    }

    public String getPassword() {
        return passWord;
    }

    public void setPassword(String password) {
        this.passWord = password;
    }

   
     @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", passWord=" + passWord+ '}';
    }
}
