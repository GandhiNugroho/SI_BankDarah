package pojos;
// Generated Dec 17, 2018 1:43:05 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pengiriman generated by hbm2java
 */
public class Pengiriman  implements java.io.Serializable {


     private Integer idPengiriman;
     private int idPesanan;
     private Date tanggalKirim;
     private String statusPengiriman;

    public Pengiriman() {
    }

    public Pengiriman(int idPesanan, Date tanggalKirim, String statusPengiriman) {
       this.idPesanan = idPesanan;
       this.tanggalKirim = tanggalKirim;
       this.statusPengiriman = statusPengiriman;
    }
   
    public Integer getIdPengiriman() {
        return this.idPengiriman;
    }
    
    public void setIdPengiriman(Integer idPengiriman) {
        this.idPengiriman = idPengiriman;
    }
    public int getIdPesanan() {
        return this.idPesanan;
    }
    
    public void setIdPesanan(int idPesanan) {
        this.idPesanan = idPesanan;
    }
    public Date getTanggalKirim() {
        return this.tanggalKirim;
    }
    
    public void setTanggalKirim(Date tanggalKirim) {
        this.tanggalKirim = tanggalKirim;
    }
    public String getStatusPengiriman() {
        return this.statusPengiriman;
    }
    
    public void setStatusPengiriman(String statusPengiriman) {
        this.statusPengiriman = statusPengiriman;
    }




}


