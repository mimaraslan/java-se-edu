package com.mimaraslan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    // http://localhost:9090/fallback/auth
    @GetMapping("/auth")
    public ResponseEntity<String> fallbackAuth() {
        return ResponseEntity.ok("Auth Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }

    // http://localhost:9091/fallback/user
    @GetMapping("/user")
    public  ResponseEntity<String>  fallbackUser() {
        return ResponseEntity.ok("UserProfile Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }


    // http://localhost:9092/fallback/agent
    @GetMapping("/agent")
    public  ResponseEntity<String>  fallbackAgent() {
        return ResponseEntity.ok("Agent Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }


    // http://localhost:9093/fallback/buyer
    @GetMapping("/buyer")
    public  ResponseEntity<String>  fallbackBuyer() {
        return ResponseEntity.ok("Buyer Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }


    // http://localhost:9094/fallback/property
    @GetMapping("/property")
    public  ResponseEntity<String>  fallbackProperty() {
        return ResponseEntity.ok("Property Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }


    // http://localhost:9095/fallback/seller
    @GetMapping("/seller")
    public  ResponseEntity<String>  fallbackSeller() {
        return ResponseEntity.ok("Seller Service: Şu anda geçici olarak hizmet verememekteyiz.");
    }
}