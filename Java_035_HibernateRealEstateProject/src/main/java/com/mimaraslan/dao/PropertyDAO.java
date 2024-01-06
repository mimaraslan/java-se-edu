package com.mimaraslan.dao;

import com.mimaraslan.model.Property;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PropertyDAO {

    public void saveOrUpdate(Property agent) {

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

    public Property getPropertyFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            return  session.get(Property.class, id);
        } catch (HibernateException ex) {
            System.out.println("Hata: " + ex);
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public List<Property> getPropertiesFindAll() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            return session.createQuery("FROM Property", Property.class).list();
        } catch (HibernateException ex) {
            System.out.println("Hata: " + ex);
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public void deletePropertyFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();

            Property property = session.get(Property.class, id);

            if(property != null){
                session.delete(property);
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
