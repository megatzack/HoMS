package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homepageController {
    // Staff Service
    @GetMapping(value="/staffpage")
    public String getStaffPage() {
        return "staffPage";
    }

    // Patient Service
    @GetMapping(value="/mainpage")
    public String getMainPage() {
        return "mainPage";
    }

    @GetMapping(value="/homepage")
    public String getHomePage() {
        return "homePage";
    }

    @GetMapping(value="/service")
    public String getPatientServicePage() {
        return "patientService";
    }
    @GetMapping(value="/review")
    public String getReviewPage() {
        return "review";
    }
    @GetMapping(value="/service/medicalShop")
    public String getInventoryPage() {
        return "forward:/inventoryController";
    }

}
