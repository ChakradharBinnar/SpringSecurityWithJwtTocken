package com.internship.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internship.application.entity.User;

@RestController
@RequestMapping("/public")
public class UnSecureController {

	  @GetMapping("/welcome")
	    public String getData() {
	        return "Api Hit Sucessfully...!";
	    }
}

