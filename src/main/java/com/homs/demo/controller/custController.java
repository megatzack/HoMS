package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class custController {

    @RequestMapping(value = "/homepage")
    public String getHomePage() {
        return "homePage";
    }

    @RequestMapping(value = "/doctor")
    public String getDoctor() {
        return "doctor";
    }

    @RequestMapping(value = "/service")
    public String getService() {
        return "service";
    }

    @RequestMapping(value = "/review")
    public String getReview() {
        return "review";
    }

    @RequestMapping(value = "/about")
    public String getAbout() {
        return "about";
    }
}
