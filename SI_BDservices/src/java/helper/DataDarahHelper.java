/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.DataDarah;
import Utility.NewHibernateUtil;

/**
 *
 * @author asus
 */
public class DataDarahHelper {
     public DataDarahHelper() {

    }
     

  public void addNewDataDarah(
      int idDarah,
     String golonganDarah,
     String resus,
     String pendonor,
     Date tanggalDonor,
     String alamatPendonor,
     String status
         
          
  ){
         Session session = NewHibernateUtil.getSessionFactory().openSession();
           Transaction tx = session.beginTransaction();
           DataDarah datadarah=new DataDarah(idDarah, golonganDarah, resus, pendonor, tanggalDonor, alamatPendonor, status);
           session.saveOrUpdate(datadarah);
           tx.commit();
           session.close();
  }
  public List<DataDarah> bacaSemuaDataDarah() {
        List<DataDarah> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from DataDarah p where status='tersedia'");
        list = q.list();
        tx.commit();
        session.close();
        return list;

        
    }
  public void updateDataDarah(){
      
  }
}
     
