package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController{
    
    @GetMapping(value = "/")
    public String getIndexPage() {
        return "index";
    }
    @RequestMapping(value = "/register")
    public String getregisterPage() {
        return "registerPage";
    }
    
    @RequestMapping(value = "/login")
    public String getLoginPage() {
        return "loginPage";
    }


}
