package com.mimaraslan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController   // REST
public class StudentController {

    // http://localhost:8082
    @GetMapping
   public  String  getHello() {
       return "Spring Boot Merhaba";
   }

}
