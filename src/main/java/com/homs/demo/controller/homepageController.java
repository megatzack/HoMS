package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homepageController {
    @RequestMapping(value="/mainpage")
    public String getMainPage() {
        return "mainPage";
    }

    @RequestMapping(value="/homepage")
    public String mainPage() {
        return "homePage";
    }

}
