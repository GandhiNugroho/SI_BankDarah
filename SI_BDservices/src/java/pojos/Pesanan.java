package pojos;
// Generated Nov 14, 2018 3:30:08 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pesanan generated by hbm2java
 */
public class Pesanan  implements java.io.Serializable {


     private int idPesanan;
     private Date tanggalPesan;
     private Date tanggalKirim;
     private Integer idDarah;
     private String golonganDarah;
     private String resus;
     private String pendonor;
     private Date tanggalDonor;
     private String alamatPendonor;

    public Pesanan() {
    }

	
    public Pesanan(int idPesanan, Date tanggalPesan, Date tanggalKirim) {
        this.idPesanan = idPesanan;
        this.tanggalPesan = tanggalPesan;
        this.tanggalKirim = tanggalKirim;
    }
    public Pesanan(int idPesanan, Date tanggalPesan, Date tanggalKirim, Integer idDarah, String golonganDarah, String resus, String pendonor, Date tanggalDonor, String alamatPendonor) {
       this.idPesanan = idPesanan;
       this.tanggalPesan = tanggalPesan;
       this.tanggalKirim = tanggalKirim;
       this.idDarah = idDarah;
       this.golonganDarah = golonganDarah;
       this.resus = resus;
       this.pendonor = pendonor;
       this.tanggalDonor = tanggalDonor;
       this.alamatPendonor = alamatPendonor;
    }
   
    public int getIdPesanan() {
        return this.idPesanan;
    }
    
    public void setIdPesanan(int idPesanan) {
        this.idPesanan = idPesanan;
    }
    public Date getTanggalPesan() {
        return this.tanggalPesan;
    }
    
    public void setTanggalPesan(Date tanggalPesan) {
        this.tanggalPesan = tanggalPesan;
    }
    public Date getTanggalKirim() {
        return this.tanggalKirim;
    }
    
    public void setTanggalKirim(Date tanggalKirim) {
        this.tanggalKirim = tanggalKirim;
    }
    public Integer getIdDarah() {
        return this.idDarah;
    }
    
    public void setIdDarah(Integer idDarah) {
        this.idDarah = idDarah;
    }
    public String getGolonganDarah() {
        return this.golonganDarah;
    }
    
    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }
    public String getResus() {
        return this.resus;
    }
    
    public void setResus(String resus) {
        this.resus = resus;
    }
    public String getPendonor() {
        return this.pendonor;
    }
    
    public void setPendonor(String pendonor) {
        this.pendonor = pendonor;
    }
    public Date getTanggalDonor() {
        return this.tanggalDonor;
    }
    
    public void setTanggalDonor(Date tanggalDonor) {
        this.tanggalDonor = tanggalDonor;
    }
    public String getAlamatPendonor() {
        return this.alamatPendonor;
    }
    
    public void setAlamatPendonor(String alamatPendonor) {
        this.alamatPendonor = alamatPendonor;
    }




}


