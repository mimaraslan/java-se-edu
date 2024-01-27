package com.mimaraslan.service;

import com.mimaraslan.model.Auth;
import com.mimaraslan.repository.IAuthRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService  { // extends ServiceManager<Auth, Long>

  // @Autowired
    private final IAuthRepository repository;

    public AuthService(IAuthRepository repository) {
        this.repository = repository;
    }
}
