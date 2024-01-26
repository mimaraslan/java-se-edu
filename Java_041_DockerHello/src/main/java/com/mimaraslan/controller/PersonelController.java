package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/v1", "/api/v2"})
public class PersonelController {


    // http://localhost:8080/api/v1/hello
    // http://localhost:8080/api/v2/hello
    @GetMapping("/hello")
    public String getDockerHello (){
        return "Selamlar Docker Kardeş";
    }
}
