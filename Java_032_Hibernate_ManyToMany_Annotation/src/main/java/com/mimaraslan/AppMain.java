package com.mimaraslan;

import com.mimaraslan.model.Address;
import com.mimaraslan.model.Customer;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class AppMain {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setFirstname("Servet");
        customer1.setLastname("Demirci");

        Customer customer2 = new Customer("Batuhan", "Devran");


        Address address1 = new Address("Almanya","Münih", "Abc");
        Address address2 = new Address("Türkiye","İstanbul", "Def");
        Address address3 = new Address("Kanada","Toronto", "Xyz");
        Address address4 = new Address("Türkiye","Çanakkale", "TR");
        Address address5 = new Address("Hollanda","Amsterdam", "EFM");


        Set<Address> addressList = new HashSet<>();
        addressList.addAll(Arrays.asList(address1, address2, address3));

        customer1.getAddress().add(address1);
        customer1.getAddress().add(address2);

        customer2.getAddress().add(address2);
        customer2.getAddress().add(address3);
        customer2.getAddress().add(address4);
        customer2.getAddress().add(address5);

        Customer customer3 = new Customer("Banu", "Nur");

        //--------------------------------------

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
                session.save(customer1);
                session.save(customer2);
                session.save(customer3);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("Hata: " + e);
        } finally {
            session.close();
        }


    }
}
