package com.homs.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController {
    
    @GetMapping("/staff")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
