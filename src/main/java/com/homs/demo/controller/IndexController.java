package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    
    @RequestMapping(value = "/register")
    public String getregisterPage() {
        return "Register";
    }
    
    @RequestMapping(value = "/login")
    public String getLoginPage() {
        return "loginPage";
    }

}
