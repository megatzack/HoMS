package com.homs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired

    @GetMapping(value = "/")
    public String getPage() {
        return "page";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "Register";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/loginpage")
    public String loginpage() {
        return "loginpage";
    }

}