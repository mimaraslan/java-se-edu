package com.mimaraslan.service;

import com.mimaraslan.exception.ResourceNotFoundException;
import com.mimaraslan.model.Student;
import com.mimaraslan.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    /*
    getAllStudent
    getOneStudent
    createStudent
    deleteOneStudent
    updateOneStudent
     */

    public List<Student> getAllStudent (){
        return studentRepository.findAll();
    }


    public ResponseEntity<Student> getOneStudent (Long id) throws ResourceNotFoundException {
       // return studentRepository.findById(id).get();

        Student student = studentRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Student not found ID: " + id));

        return ResponseEntity.ok().body(student);
    }


   public Student createStudent(Student student) {
        // FIXME id değeri kontrolü yapılacak.

       if(studentRepository.findById(student.getId()).isPresent())
           return null;

       /*
        if(studentRepository.findById(student.getId()).isPresent()) {
           Student studentInfo = new Student();
            studentInfo.setFirstName(student.getFirstName());
            studentInfo.setLastName(student.getLastName());
            studentInfo.setEmail(student.getEmail());
           return studentRepository.save(studentInfo);
       }
        */
        return studentRepository.save(student);
   }


    public Map<String, Boolean> deleteOneStudent (Long id) throws ResourceNotFoundException {

        Student student = studentRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Student not found ID: " + id));

        studentRepository.deleteById(id);

        Map<String, Boolean> response = new HashMap<>();
        response.put("Delete", Boolean.TRUE);

        return  response;
    }



    public ResponseEntity<Student> updateOneStudent (Student studentInfo) throws ResourceNotFoundException {

        Student student = studentRepository.findById(studentInfo.getId())
                .orElseThrow(()-> new ResourceNotFoundException("Student not found ID: " + studentInfo.getId()));

        return ResponseEntity.ok(studentRepository.save(studentInfo));
    }


    public ResponseEntity<Student> updateOneStudent2 (Long id, Student studentInfo) throws ResourceNotFoundException {

        studentRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Student not found ID: " + id));

        studentInfo.setId(id);
        return ResponseEntity.ok(studentRepository.save(studentInfo));
    }


}
