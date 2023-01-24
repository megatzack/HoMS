package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping(value="/mainpage")
    public String getMainPage() {
        return "mainPage";
    }

    @RequestMapping(value="/homepage")
    public String getHomePage() {
        return "homePage";
    }

    @RequestMapping(value="/review")
    public String getReviewPage() {
        return "review";
    }

}
