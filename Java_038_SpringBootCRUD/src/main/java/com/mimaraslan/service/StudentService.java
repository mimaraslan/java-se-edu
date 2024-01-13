package com.mimaraslan.service;


import com.mimaraslan.model.Student;
import com.mimaraslan.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class StudentService {


    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(Long id) {
     //   Student studentInfo = getStudent(id);

        studentRepository.deleteById(id);

     //    studentInfo = getStudent(id);

        return "Başarılı";
    }

}
