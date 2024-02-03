package com.mimaraslan.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//    http://localhost:9091/agent

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserProfileController {

    //    http://localhost:9091/user/hello
    @GetMapping("/hello")
    public String hello (){
        return "UserProfile Hi" ;
    }


}
