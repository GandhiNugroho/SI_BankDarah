/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import Utility.NewHibernateUtil;
import java.util.Collections;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.User;

/**
 *
 * @author asus
 */
public class UserHelper {
    public UserHelper(){
        
    }
     public List<User> getAllUser() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<User> hasil = null;
        Query q = session.createQuery("from User u");
        hasil = q.list();
        tx.commit();
        session.close();
        return hasil;
    }
     public User login(String username,String password){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String q = "From User a where a.username=:username AND a.password =:password";
        
        Query query = session.createQuery(q);
        query.setParameter("username", username);
        query.setParameter("password", password);
        
        return (User) query.uniqueResult();
    }

     

    public void addNewUser(
          String username,String password
    ) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        User user = new User(password, username);
        session.saveOrUpdate(user);
        tx.commit();
        session.close();
    }
}
