package com.mimaraslan;

import com.mimaraslan.model.Customer;
import com.mimaraslan.model.CustomerDetail;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.Query;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class AppMain {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setFirstname("Doğan");
        customer.setLastname("Kilaz");

        CustomerDetail customerDetail = new CustomerDetail();
        customerDetail.setAddress("Ankara");
        customerDetail.setPhone("123456789");
        customerDetail.setRecordDate(new Date());

        customerDetail.setCustomer(customer);
        customer.setCustomerDetail(customerDetail);


        Customer customer2 = new Customer("Enes","Sait");
        CustomerDetail customerDetail2 = new CustomerDetail("Denizli", "11111", new Date());

        customerDetail2.setCustomer(customer2);
        customer2.setCustomerDetail(customerDetail2);


        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
                session.save(customer);
                session.save(customer2);

            System.out.println("================== SELECT ==================");
            Query query = session.createQuery("FROM Customer");
            List<Customer> customerList = query.list();
            for ( Customer  cust  :  customerList  ) {
                System.out.println(cust.getFirstname() + " " + cust.getLastname());
            }

            System.out.println("================== WHERE ==================");
            Query query2 = session.createQuery("FROM Customer WHERE id=:id");
            query2.setLong("id", 1);

            Customer cust2 = (Customer) query2.uniqueResult();
                System.out.println(cust2.getFirstname() + " " + cust2.getLastname());


            System.out.println("================== DELETE ==================");
/*          Query query3 = session.createQuery("DELETE FROM CustomerDetail WHERE id=:id");
            query3.setLong("id", 1);

            int queryResult3 = query3.executeUpdate();
            System.out.println("CustomerDetail delete sonucu: " +  queryResult3);


            Query  query4 = session.createQuery("DELETE FROM Customer WHERE id=:id");
            query4.setLong("id", 1);

            int  queryResult4 = query4.executeUpdate();
            System.out.println("Customer delete sonucu: " +  queryResult4);

*/
            System.out.println("================== AVG SUM MIN MAX COUNT ==================");
            Query query5 = session.createQuery("SELECT COUNT (*) FROM Customer");

            Long countResult = (Long) query5.uniqueResult();
            System.out.println("COUNT: " + countResult);


            System.out.println("================== JOIN ==================");
            Query query6 = session.createQuery(
                    "SELECT c.firstname, c.lastname " +
                              "FROM Customer c " +
                              "INNER JOIN CustomerDetail d " +
                              "ON c.id = d.id");

            List<Objects> customerList6 = query6.list();
            for ( Customer  cust6  :  customerList  ) {
                System.out.println(cust6.getFirstname() + " " + cust6.getLastname() + " " + cust6.getCustomerDetail().getAddress());
            }



            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            System.err.println("Hata: " + e);
        } finally {
            session.close();
        }


    }
}