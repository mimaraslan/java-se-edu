package com.mimaraslan.dao;

import com.mimaraslan.model.Seller;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SellerDAO {

    public void saveOrUpdate(Seller agent) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(agent);
            transaction.commit();
        } catch (HibernateException ex) {

            if (transaction != null)
                transaction.rollback();

            System.out.println("Hata: " + ex);
            ex.printStackTrace();

        } finally {
            session.close();
        }

    }

    public Seller getSellerFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            return  session.get(Seller.class, id);
        } catch (HibernateException ex) {
            System.out.println("Hata: " + ex);
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public List<Seller> getSellersFindAll() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            return session.createQuery("FROM Seller", Seller.class).list();
        } catch (HibernateException ex) {
            System.out.println("Hata: " + ex);
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public void deleteSellerFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();

            Seller seller = session.get(Seller.class, id);

            if(seller != null){
                session.delete(seller);
            }

            transaction.commit();


        } catch (HibernateException ex) {

            if (transaction != null)
                transaction.rollback();

            System.out.println("Hata: " + ex);
            ex.printStackTrace();

        } finally {
            session.close();
        }

    }

}
