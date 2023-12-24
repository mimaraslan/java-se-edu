package com.mimaraslan;

import com.mimaraslan.model.Customer;
import com.mimaraslan.model.Order;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setFirstname("A1");
        customer1.setLastname("A2");

        Order order1 = new Order ("Elma", "1000",1.90F,new Date());
        Order order2 = new Order ("Armut", "2000",4.12f,new Date());
        Order order3 = new Order ("Ayva", "3000",5.88f,new Date());

        customer1.getOrders().add(order1);
        customer1.getOrders().add(order2);
        customer1.getOrders().add(order3);

        order1.setCustomer(customer1);
        order2.setCustomer(customer1);
        order3.setCustomer(customer1);

        //--------------------------------------

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
                session.save(customer1);
                session.save(order1);
                session.save(order2);
                session.save(order3);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("Hata: " + e);
        } finally {
            session.close();
        }


    }
}
