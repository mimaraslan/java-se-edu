package com.mimaraslan.controller;


import com.mimaraslan.model.Student;
import com.mimaraslan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//  http://localhost:8090/api/v1
@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;



    //  http://localhost:8090/api/v1/hello
   // @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @GetMapping ("/hello")
    public String hello() {
        return "Selam";
    }


    // GET - SELECT ALL
    //  http://localhost:8090/api/v1/students
    @GetMapping ("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    // GET - SELECT WHERE
    //  http://localhost:8090/api/v1/student/1
    @GetMapping ("/student/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }


    // POST - INSERT
    // http://localhost:8090/api/v1/student
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }


    // PUT - UPDATE
    // http://localhost:8090/api/v1/student/1
    @PutMapping ("/student/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {

        Student studentInfo = studentService.getStudent(id);

        if(studentInfo != null) {
            studentInfo.setId(id);
            studentInfo.setFirstName(student.getFirstName());
            studentInfo.setLastName(student.getLastName());
            studentInfo.setEmail(student.getEmail());
            return studentService.updateStudent(studentInfo);
        }
        return null;
    }


    // DELETE - DELETE
    // http://localhost:8090/api/v1/student/1
    @DeleteMapping ("/student/{id}")
    public String deleteStudent(@PathVariable (value = "id") Long id) {
       return studentService.deleteStudent(id);
    }


}
