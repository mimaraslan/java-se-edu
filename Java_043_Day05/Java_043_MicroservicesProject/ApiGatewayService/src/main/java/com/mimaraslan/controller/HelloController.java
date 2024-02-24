package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//    http://localhost:80
@RestController
@RequestMapping
public class HelloController {

    //    http://localhost:80
    @GetMapping("/")
    public String hello (){
        return "ApiGatewayService Hello";
    }


    //    http://localhost:80/info
    @GetMapping("/info")
    public String info (){
        return "INFO: ApiGatewayService";
    }
}
