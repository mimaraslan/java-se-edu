package com.mimaraslan.dao;

import com.mimaraslan.model.Buyer;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BuyerDAO {

    public void saveOrUpdate(Buyer buyer) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(buyer);
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

    public Buyer getBuyerFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            return  session.get(Buyer.class, id);
        } catch (HibernateException ex) {
            System.out.println("Hata: " + ex);
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public List<Buyer> getBuyersFindAll() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            return session.createQuery("FROM Buyer", Buyer.class).list();
        } catch (HibernateException ex) {
            System.out.println("Hata: " + ex);
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public void deleteBuyerFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();

            Buyer buyer = session.get(Buyer.class, id);

            if(buyer != null){
                session.delete(buyer);
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
