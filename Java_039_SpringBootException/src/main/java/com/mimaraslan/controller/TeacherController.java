package com.mimaraslan.controller;


import com.mimaraslan.model.Teacher;
import com.mimaraslan.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//  http://localhost:8090/api/v1
@RestController
@RequestMapping("/api/v1")
public class TeacherController {

    @Autowired
    TeacherService teacherService;
    

    // GET - SELECT ALL
    //  http://localhost:8090/api/v1/teachers
    @GetMapping ("/teachers")
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }

    // GET - SELECT WHERE
    //  http://localhost:8090/api/v1/teacher/1
    @GetMapping ("/teacher/{id}")
    public Teacher getTeacher(@PathVariable Long id) {
        return teacherService.getTeacher(id);
    }


    // POST - INSERT
    // http://localhost:8090/api/v1/teacher
    @PostMapping("/teacher")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }


    // PUT - UPDATE
    // http://localhost:8090/api/v1/teacher/1
    @PutMapping ("/teacher/{id}")
    public Teacher updateTeacher(@PathVariable Long id,
                                 @RequestBody Teacher teacher) {

        Teacher teacherInfo = teacherService.getTeacher(id);

        if(teacherInfo != null) {
            teacherInfo.setId(id);
            teacherInfo.setFirstName(teacher.getFirstName());
            teacherInfo.setLastName(teacher.getLastName());
            teacherInfo.setEmail(teacher.getEmail());
            return teacherService.updateTeacher(teacherInfo);
        }
        return null;
    }

    // DELETE - DELETE
    // http://localhost:8090/api/v1/teacher/1
    @DeleteMapping ("/teacher/{id}")
    public String deleteTeacher(@PathVariable (value = "id") Long id) {
       return teacherService.deleteTeacher(id);
    }


}
