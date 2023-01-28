package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.homs.demo.model.Staff;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class homepageController {
    private Staff staff;

    // Staff Service
    @GetMapping(value="/staffpage")
    public String getStaffPage() {
        return "staffPage";
    }
    @GetMapping(value="/staffservice")
    public String getStaffServicePage(HttpServletRequest request, HttpServletResponse response,Model model) {
        staff = (Staff) request.getSession().getAttribute("staff");
        model.addAttribute("staffDepartment", staff.getStaffDepartment());
        return "staffService";
    }
    @GetMapping(value="/service/ambulance")
    public String getAmbulancePage() {
        return "";
    }
    @GetMapping(value="/service/schedule")
    public String getSchedulePage() {
        return "";
    }
    @GetMapping(value="/service/medicalReport")
    public String getMedicalReportPage() {
        return "";
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
    @GetMapping(value="/doctor")
    public String getDoctorPage() {
        return "";
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
    @GetMapping(value="/service/medicalQueue")
    public String getQueuePage() {
        return "";
    }
    @GetMapping(value="/service/medicalRecord")
    public String getMedicalPage() {
        return "";
    }

}
