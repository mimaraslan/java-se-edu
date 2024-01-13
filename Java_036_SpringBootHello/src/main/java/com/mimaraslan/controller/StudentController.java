package com.mimaraslan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // Web Sayfaları
@RestController   // RESTful
public class StudentController {

    // http://localhost:8090
    // http://127.0.0.1:8090
    @GetMapping
   public  String  getHello() {
       return "Spring Boot Merhaba";
   }

}
