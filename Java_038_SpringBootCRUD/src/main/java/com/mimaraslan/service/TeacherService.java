package com.mimaraslan.service;


import com.mimaraslan.model.Teacher;
import com.mimaraslan.repository.TeacherRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class TeacherService {


    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacher(Long id) {
        return teacherRepository.findById(id).get();
    }

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public String deleteTeacher(Long id) {
     //   Teacher teacherInfo = getTeacher(id);

        teacherRepository.deleteById(id);

     //    teacherInfo = getTeacher(id);

        return "Başarılı";
    }

}
