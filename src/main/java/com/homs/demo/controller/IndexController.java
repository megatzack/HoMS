package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/login")
    public String getLoginPage() {
        return "loginPage";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "Register";
    }
}
