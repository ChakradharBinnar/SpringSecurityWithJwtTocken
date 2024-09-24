package com.internship.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class SecureController {

    @GetMapping("/api")
    public String secret() {
        return "This is a protected resource. You have accessed it with a valid token!";
    }
}