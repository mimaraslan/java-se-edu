package com.mimaraslan.dao;

import com.mimaraslan.model.Agent;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AgentDAO {

    public void saveOrUpdate(Agent agent) {

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

    public Agent getAgentFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            return  session.get(Agent.class, id);
        } catch (HibernateException ex) {
            System.out.println("Hata: " + ex);
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public List<Agent> getAgentsFindAll() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
             return session.createQuery("FROM Agent", Agent.class).list();
        } catch (HibernateException ex) {
            System.out.println("Hata: " + ex);
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public void deleteAgentFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();

            Agent agent = session.get(Agent.class, id);

            if(agent != null){
                session.delete(agent);
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
