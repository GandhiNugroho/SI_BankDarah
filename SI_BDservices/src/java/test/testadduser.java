/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.PesananHelper;
import helper.UserHelper;

/**
 *
 * @author asus
 */
public class testadduser {
    public static void main(String[] args) {
       String username="husor123";
            String password="123456";
            UserHelper helper = new UserHelper();
            helper.addNewUser(username, password); 
    }
    
}
