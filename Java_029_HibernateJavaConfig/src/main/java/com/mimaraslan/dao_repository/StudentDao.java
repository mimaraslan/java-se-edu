package com.mimaraslan.dao_repository;

import com.mimaraslan.model_entity.Student;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDao {

    public void saveStudent(Student student){

        Transaction transaction= null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
                session.save(student);
            transaction.commit();
        } catch (HibernateException e){
            System.out.println("Hata: "+ e);
            if(transaction != null) {
                transaction.rollback();
            }
        }

/*
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction= null;

        try {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (HibernateException e){
            transaction.rollback();
            System.out.println("Hata: "+ e);
        } finally {
            session.close();
        }
        */

    }

   public List<Student> getStudents(){
       try (Session session = HibernateUtil.getSessionFactory().openSession()) {
          return session.createQuery("from Student", Student.class).list();
       } catch (HibernateException e){
          return null;
       }
   }

}
