package com.mimaraslan.controller;

import com.mimaraslan.model.Auth;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//    http://localhost:9090
@RestController
@RequestMapping
public class AuthController {

   public ResponseEntity<Auth> register(){
       return null;
   }

   // public  login(){}
  //  public  findAll()   {}

 //   public getMessage(){}

}
