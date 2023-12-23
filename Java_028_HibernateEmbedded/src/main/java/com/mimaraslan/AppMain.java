package com.mimaraslan;

import com.mimaraslan.model.Address;
import com.mimaraslan.model.Customer;
import com.mimaraslan.model.Worker;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setFirstName("A");
        customer.setLastName("B");
        customer.setCreateDate(new Date());

            Address address = new Address();
            address.setSehir("Ankara");
            address.setIlce("Çankaya");
            address.setMahalle("Söğüt");

        customer.setAddress(address);
//-------------------------------------------------------------------
        Customer customer2 = new Customer("C", "D");
        customer2.setCreateDate(new Date());

            Address address2 = new Address();
            address2.setSehir("Sivas");
            address2.setIlce("Kangal");
            address2.setMahalle("Cumhuriyet");

        customer2.setAddress(address2);
//-------------------------------------------------------------------
        Customer customer3 = new Customer("E", "F");
        customer3.setCreateDate(new Date());

            Address address3 = new Address();
            address3.setSehir("Kars");
            address3.setIlce("Sarı");
            address3.setMahalle("Kamış");

        customer3.setAddress(address3);


//-------------------------------------------------------------------

        Worker worker = new Worker();
        worker.setFirstName("Y");
        worker.setLastName("M");
        worker.setCreateDate(new Date());

            Address address4 = new Address();
            address4.setSehir("Adana");
            address4.setIlce("Çinçin");
            address4.setMahalle("Merkez");

        worker.setAddress(address4);
//-------------------------------------------------------------------



        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction= null;

       try {
           transaction = session.beginTransaction();
               session.save(customer);
               session.save(customer2);
               session.save(customer3);
               session.save(worker);
           transaction.commit();
       } catch (HibernateException e){
           transaction.rollback();
           System.out.println("Hata: "+ e);
       } finally {
           session.close();
       }

    }
}