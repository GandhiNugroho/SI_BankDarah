package pojos;
// Generated Dec 3, 2018 8:05:09 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * DataDarah generated by hbm2java
 */
public class DataDarah  implements java.io.Serializable {


     private Integer idDarah;
     private String golonganDarah;
     private String resus;
     private String pendonor;
     private Date tanggalDonor;
     private String alamatPendonor;
     private String status;

    public DataDarah() {
    }

	
    public DataDarah(String golonganDarah, String resus, String pendonor, Date tanggalDonor, String alamatPendonor) {
        this.golonganDarah = golonganDarah;
        this.resus = resus;
        this.pendonor = pendonor;
        this.tanggalDonor = tanggalDonor;
        this.alamatPendonor = alamatPendonor;
    }
    public DataDarah(String golonganDarah, String resus, String pendonor, Date tanggalDonor, String alamatPendonor, String status) {
       this.golonganDarah = golonganDarah;
       this.resus = resus;
       this.pendonor = pendonor;
       this.tanggalDonor = tanggalDonor;
       this.alamatPendonor = alamatPendonor;
       this.status = status;
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
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


