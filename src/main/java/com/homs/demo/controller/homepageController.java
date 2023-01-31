package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.homs.demo.model.Staff;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class homepageController {
    private Staff staff;

    // Staff Service
    @GetMapping(value="/staffpage")
    public String getStaffPage() {
        return "staffPage";
    }
    @GetMapping(value="/staffservice")
    public String getStaffServicePage(HttpServletRequest request, HttpServletResponse response, Model model) {
        staff = (Staff) request.getSession().getAttribute("staff");
        model.addAttribute("staffDepartment", staff.getStaffDepartment());
        return "staffService";
    }
    @GetMapping(value="/service/ambulance")
    public String getAmbulancePage() {
        return "ambulance_profile";
    }
    @GetMapping(value="/service/admin")
    public String getAdminPage() {
        return "admin";
    }
    @GetMapping(value="/service/admin/ambulance_plate")
    public String getAmbulancePlatePage() {
        return "ambulance";
    }
    @GetMapping(value="/service/admin/ambulance_setschedule")
    public String getAmbulanceSchedulePage() {
        return "ambulanceRespond";
    }
    @GetMapping(value="/service/staffSchedule")
    public String getSchedulePage() {
        return "staff_schedule";
    }
    @GetMapping(value="/service/medicalReport")
    public String getMedicalReportPage() {
        return "forward:/medicalReportController";
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
        return "forward:/queueController";
    }
    @GetMapping(value="/service/medicalRecord")
    public String getMedicalPage() {
        return "";
    }
    @GetMapping(value="/appointment/bookAppointment")
    public String getAppointmentPage() {
        return "appointment";
    }
    @GetMapping(value="/Patient/patientProfile")
    public String getPatientProfilePage(){
        return "patientProfile";
    }
    
}
