/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import pojos.DataDarah;
import com.google.gson.Gson;
import helper.DataDarahHelper;
import java.util.List;

/**
 *
 * @author asus
 */
public class testbacastok {

    public static void main(String[] args) {
        DataDarahHelper test = new DataDarahHelper();      
        List<DataDarah> list = test.bacaSemuaDataDarah();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}

   
