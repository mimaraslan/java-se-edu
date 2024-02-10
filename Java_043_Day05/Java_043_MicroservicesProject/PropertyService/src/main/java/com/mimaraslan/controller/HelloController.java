package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//    http://localhost:9094
@RestController
@RequestMapping
public class HelloController {

    //    http://localhost:9094
    @GetMapping("/")
    public String hello (){
        return "PropertyService Hello";
    }


    //    http://localhost:9094/info
    @GetMapping("/info")
    public String info (){
        return "INFO: PropertyService";
    }
}
