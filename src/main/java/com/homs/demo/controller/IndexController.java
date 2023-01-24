package com.homs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired

    @GetMapping(value = "/")
    public String firstpage() {
        return "Register";
    }

    @GetMapping(value = "/index")
    public String index() {
        return "Register";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "loginPage";
    }


    
}
