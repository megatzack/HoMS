package com.homs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Autowired

    @GetMapping(value = "/HoMS")
    public String index() {
        return "forward:/login";
    }
    @RequestMapping(value = "/register")
    public String getRegister() {
        return "Register";
    }

    @RequestMapping(value = "/login")
    public String getLogin() {
        return "login";
    }

    @RequestMapping(value = "/page")
    public String loginpage() {
        return "page";
    }

}