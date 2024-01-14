package com.mimaraslan.controller;

import com.mimaraslan.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class EmployeeController {

    /*
    http://localhost:8090
    http://localhost:8090/
    http://localhost:8090/anasayfa

     */

    @GetMapping({ "/", "/index" })
    public String viewIndex(Map<String, Object> model) {

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("Banu");
        employee.setLastName("Şadiye");
        employee.setEmail("abc@asdadsa.com");

        model.put("employee", employee);
        return "index";
    }

}
