/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.DataDarahHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asus
 */
public class testadd {
    public static void main(String[] args) throws ParseException{
        try{
            
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date=format.parse("19741231");
        int idDarah=1;
        String golonganDarah="O";
        String resus="negatif";
        String pendonor="Susanto";
         String alamatPendonor="laki-laki";
         DataDarahHelper helper=new DataDarahHelper();
        helper.addNewDataDarah(idDarah,golonganDarah, resus, pendonor, date, alamatPendonor);
        
        }catch(ParseException ex){
            
        }
    }
}
