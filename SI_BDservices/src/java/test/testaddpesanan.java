/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.DataDarahHelper;
import helper.PesananHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asus
 */
public class testaddpesanan {

    public static void main(String[] args) {
        try {

            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date tanggaldonor = format.parse("19820719");
            Date tanggalpesan = format.parse("20181120");
            Date tanggalkirim = format.parse("20181122");
            int idPesanan = 1;
            int idDarah = 2;
            String golonganDarah = "O";
            String resus = "Positif";
            String pendonor = "Aseng";
            String alamatPendonor = "jln.Buntu";
            PesananHelper helper = new PesananHelper();
            helper.addNewPesanan(idPesanan, tanggalpesan, tanggalkirim, idDarah, golonganDarah, resus, pendonor, tanggaldonor, alamatPendonor);

        } catch (ParseException ex) {

        }
    }
}
