package com.mimaraslan;

import com.mimaraslan.model.Employee;
import com.mimaraslan.model.Owner;
import com.mimaraslan.model.Person;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {


        Person person = new Person("Steve", "Balmer");
       // person.setPersonId(1L);

        Employee employee = new Employee("James", "Gosling", "Marketing", new Date());
       // employee.setPersonId(2L);

        Owner owner = new Owner("Bill", "Gates", 300L, 20L);
       // owner.setPersonId(3L);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

                 session.save(person);
                 session.save(employee);
                 session.save(owner);

            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            System.err.println("Hata: " + e);
        } finally {
            session.close();
        }


    }
}