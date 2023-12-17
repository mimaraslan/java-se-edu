package com.mimaraslan;

import com.mimaraslan.model.Customer;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setFirstName("Kadir");
        customer.setLastName("Kılıç");
        customer.setCreateDate(new Date());

        Customer customer2 = new Customer("Filiz", "Helvacı");
        customer2.setCreateDate(new Date());

        Customer customer3 = new Customer("Ecem", "Koro");
        customer3.setCreateDate(new Date());

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction= null;

       try {
           transaction = session.beginTransaction();
               session.save(customer);
               session.save(customer2);
               session.save(customer3);
           transaction.commit();
       } catch (HibernateException e){
           transaction.rollback();
           System.out.println("Hata: "+ e);
       } finally {
           session.close();
       }

    }
}