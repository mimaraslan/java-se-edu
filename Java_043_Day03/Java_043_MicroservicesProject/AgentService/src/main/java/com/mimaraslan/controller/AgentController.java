package com.mimaraslan.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//    http://localhost:9092/agent

@RequiredArgsConstructor
@RestController
@RequestMapping("/agent")
public class AgentController {

    //    http://localhost:9092/agent/hello
    @GetMapping("/hello")
    public String hello (){
        return "AgentService Hi" ;
    }


}
