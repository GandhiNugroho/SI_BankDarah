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
import pojos.Pengiriman;

/**
 *
 * @author asus
 */
public class PengirimanHelper {

    public PengirimanHelper() {

    }

    public void addNewPesanan(
            int idPengiriman,
            long idPesanan,
            Date tanggalKirim,
            String statusPengiriman
    ) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Pengiriman pengiriman = new Pengiriman(idPengiriman, idPesanan, tanggalKirim, statusPengiriman);
        session.saveOrUpdate(pengiriman);
        tx.commit();
        session.close();
    }

    public List<Pengiriman> bacaSemuaPengiriman() {
        List<Pengiriman> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Pengiriman");
        list = q.list();
        tx.commit();
        session.close();
        return list;

    }
}
