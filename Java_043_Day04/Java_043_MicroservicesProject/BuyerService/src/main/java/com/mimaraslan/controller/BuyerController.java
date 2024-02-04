package com.mimaraslan.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//    http://localhost:9093/buyer

@RequiredArgsConstructor
@RestController
@RequestMapping("/buyer")
public class BuyerController {

    //    http://localhost:9093/buyer/hello
    @GetMapping("/hello")
    public String hello (){
        return "BuyerService Hi" ;
    }


}
