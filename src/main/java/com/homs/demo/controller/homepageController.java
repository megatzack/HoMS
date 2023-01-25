package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homepageController {
    @GetMapping(value="/mainpage")
    public String getMainPage() {
        return "mainPage";
    }

    @GetMapping(value="/homepage")
    public String getHomePage() {
        return "homePage";
    }

    @GetMapping(value="/review")
    public String getReviewPage() {
        return "review";
    }

}
