package com.mimaraslan;

import com.mimaraslan.model.Customer;
import com.mimaraslan.model.CustomerDetail;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setFirstname("A1");
        customer.setLastname("A2");

        CustomerDetail customerDetail = new CustomerDetail();
        customerDetail.setAddress("Ankara");
        customerDetail.setPhone("123456789");
        customerDetail.setRecordDate(new Date());

        customerDetail.setCustomer(customer);
        customer.setCustomerDetail(customerDetail);


        Customer customer2 = new Customer("B1","B2");
        CustomerDetail customerDetail2 = new CustomerDetail("Denizli", "11111", new Date());

        customerDetail2.setCustomer(customer2);
        customer2.setCustomerDetail(customerDetail2);


        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
                session.save(customer);
                session.save(customer2);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("Hata: " + e);
        } finally {
            session.close();
        }


    }
}