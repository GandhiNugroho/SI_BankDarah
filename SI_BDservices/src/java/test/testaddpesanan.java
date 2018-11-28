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
            Date tanggalPesan= format.parse("20181126");
            int idPesanan=1;
            int idDarah=1;
            String namaRs="Bunda dan Anak";
            String alamatRs="Jln.Singkarak";
            String status="Ditolak";
            PesananHelper helper = new PesananHelper();
            helper.addNewPesanan(idPesanan, idDarah, namaRs, alamatRs, tanggalPesan,status);

        } catch (ParseException ex) {

        }
    }
}
