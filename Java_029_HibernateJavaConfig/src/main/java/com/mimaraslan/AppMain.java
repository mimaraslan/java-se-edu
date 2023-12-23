package com.mimaraslan;

import com.mimaraslan.dao_repository.StudentDao;
import com.mimaraslan.model_entity.Student;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setFirstName("A1");
        student1.setLastName("A2");
        student1.setEmail("A3");

        Student student2 = new Student("B1", "B2", "B3");

        StudentDao studentDao = new StudentDao();
        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);


        List<Student> studentList =  studentDao.getStudents();
        System.out.println(studentList);

        studentList.forEach(s -> System.out.println(
                "ID: "+ s.getId() +
                " ADI: " + s.getFirstName() +
                " SOYADI: " + s.getLastName() +
                " EMAIL: " + s.getEmail() ));

    }
}
