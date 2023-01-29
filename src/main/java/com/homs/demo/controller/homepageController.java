package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.homs.demo.model.Patient;
import com.homs.demo.model.Staff;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class homepageController {
    private Staff staff;
    private Patient patient;

    // Staff Service
    @GetMapping(value="/staffpage")
    public String getStaffPage(HttpServletRequest request, HttpServletResponse response,Model model) {
        staff = (Staff) request.getSession().getAttribute("staff");
        if (staff != null) {
            return "staffPage";
        } else {
           return "errorPage"; 
        }
    }

    @GetMapping(value="/staffservice")
    public String getStaffServicePage(HttpServletRequest request, HttpServletResponse response,Model model) {
        staff = (Staff) request.getSession().getAttribute("staff");
        if (staff != null) {
            model.addAttribute("department", staff.getStaffDepartment());
            System.out.println(staff.getStaffDepartment());
            return "staffService";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/review")
    public String getReviewPage(HttpServletRequest request, HttpServletResponse response,Model model) {
        staff = (Staff) request.getSession().getAttribute("staff");
        if (staff != null) {
            return "forward:/reviewlist";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/service/ambulance")
    public String getAmbulancePage(HttpServletRequest request, HttpServletResponse response,Model model) {
        staff = (Staff) request.getSession().getAttribute("staff");
        if (staff != null) {
            return "ambulance_profile";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/service/admin")
    public String getAdminPage(HttpServletRequest request, HttpServletResponse response,Model model) {
        staff = (Staff) request.getSession().getAttribute("staff");
        if (staff != null) {
            return "admin";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/service/admin/ambulance_plate")
    public String getAmbulancePlatePage(HttpServletRequest request, HttpServletResponse response,Model model) {
        staff = (Staff) request.getSession().getAttribute("staff");
        if (staff != null) {
            return "ambulance";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/service/admin/ambulance_setschedule")
    public String getAmbulanceSchedulePage(HttpServletRequest request, HttpServletResponse response,Model model) {
        staff = (Staff) request.getSession().getAttribute("staff");
        if (staff != null) {
            return "ambulanceRespond";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/service/staffSchedule")
    public String getSchedulePage(HttpServletRequest request, HttpServletResponse response,Model model) {
        staff = (Staff) request.getSession().getAttribute("staff");
        if (staff != null) {
            return "staff_schedule";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/service/medicalReport")
    public String getMedicalReportPage(HttpServletRequest request, HttpServletResponse response,Model model) {
        staff = (Staff) request.getSession().getAttribute("staff");
        if (staff != null) {
            return "";
        } else {
           return "errorPage"; 
        }
    }



    // Patient Service
    @GetMapping(value="/mainpage")
    public String getMainPage(HttpServletRequest request, HttpServletResponse response,Model model) {
        //return "mainPage";
        patient = (Patient) request.getSession().getAttribute("patient");
        if (patient != null) {
            return "mainPage";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/homepage")
    public String getHomePage(HttpServletRequest request, HttpServletResponse response,Model model) {
        patient = (Patient) request.getSession().getAttribute("patient");
        staff = (Staff) request.getSession().getAttribute("staff");
        if (patient != null | staff != null) {
                model.addAttribute("patient", patient);
                model.addAttribute("staff", staff);
            return "homePage";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/doctor")
    public String getDoctorPage(HttpServletRequest request, HttpServletResponse response,Model model) {
        patient = (Patient) request.getSession().getAttribute("patient");
        staff = (Staff) request.getSession().getAttribute("staff");
        if (patient != null | staff != null) {
            return "";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/service")
    public String getPatientServicePage(HttpServletRequest request, HttpServletResponse response,Model model) {
        patient = (Patient) request.getSession().getAttribute("patient");
        if (patient != null) {
            return "patientService";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/about")
    public String getProfilePage(HttpServletRequest request, HttpServletResponse response,Model model) {
        //return "profile";
        patient = (Patient) request.getSession().getAttribute("patient");
        staff = (Staff) request.getSession().getAttribute("staff");
        if (patient != null | staff != null) {
            model.addAttribute("staff", staff);
            model.addAttribute("patient", patient);
            return "profile";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/service/medicalShop")
    public String getInventoryPage(HttpServletRequest request, HttpServletResponse response,Model model) {
        patient = (Patient) request.getSession().getAttribute("patient");
        if (patient != null) {
            return "forward:/getProduct";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/service/medicalQueue")
    public String getQueuePage(HttpServletRequest request, HttpServletResponse response,Model model) {
        patient = (Patient) request.getSession().getAttribute("patient");
        if (patient != null) {
            return "";
        } else {
           return "errorPage"; 
        }
    }
    @GetMapping(value="/service/medicalRecord")
    public String getMedicalPage(HttpServletRequest request, HttpServletResponse response,Model model) {
        patient = (Patient) request.getSession().getAttribute("patient");
        if (patient != null) {
            return "";
        } else {
           return "errorPage"; 
        }
    }
}
