/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.PesananHelper;
import java.util.List;
import pojos.Pesanan;

/**
 *
 * @author asus
 */
public class tesbacapesanan {
     public static void main(String[] args) {
         PesananHelper test = new PesananHelper();      
        List<Pesanan> list = test.bacaSemuaPesanan();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
