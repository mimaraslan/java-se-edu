package com.mimaraslan.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//    http://localhost:9095/seller

@RequiredArgsConstructor
@RestController
@RequestMapping("/seller")
public class SellerController {

    //    http://localhost:9095/seller/hello
    @GetMapping("/hello")
    public String hello (){
        return "SellerService Hi" ;
    }


}
