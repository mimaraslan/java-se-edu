package com.mimaraslan.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//    http://localhost:9094/property

@RequiredArgsConstructor
@RestController
@RequestMapping("/property")
public class PropertyController {

    //    http://localhost:9094/property/hello
    @GetMapping("/hello")
    public String hello (){
        return "PropertyService Hi" ;
    }


}
