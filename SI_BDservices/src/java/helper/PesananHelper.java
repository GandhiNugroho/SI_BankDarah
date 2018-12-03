/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import Utility.NewHibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Pesanan;

/**
 *
 * @author asus
 */
public class PesananHelper {

    public PesananHelper() {

    }

    public void addNewPesanan(
            int idDarah,
            String namaRs,
            String alamatRs,
            Date tanggalPesan
    ) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Pesanan pesanan = new Pesanan(idDarah, namaRs, alamatRs, tanggalPesan);
        session.saveOrUpdate(pesanan);
        tx.commit();
        session.close();
    }

    public List<Pesanan> bacaSemuaPesanan() {
        List<Pesanan> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Pesanan p");
        list = q.list();
        tx.commit();
        session.close();
        return list;

    }
}
