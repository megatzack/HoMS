package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController{
    
    @RequestMapping(value = "/register")
    public String getregisterPage() {
        return "Register";
    }

    @RequestMapping(value = "/register2")
    public String getregisterPage2() {
        return "Register2";
    }
    
    @RequestMapping(value = "/login")
    public String getLoginPage() {
        return "loginPage";
    }

    //mapping for error page
    @RequestMapping(value = "/error")
    public String getErrorPage() {
        return "errorPage";
    }

}
