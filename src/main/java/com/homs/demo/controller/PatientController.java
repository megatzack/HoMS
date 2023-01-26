package com.homs.demo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homs.demo.dbutil.PatientDAO;
import com.homs.demo.model.Patient;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/Patient")
public class PatientController {
    
    @GetMapping("/signup")
    public String Patient_register() {
       // return "Patient_register";
       return "registerPage";
    }

    @PostMapping("/welcome")
    public String register(HttpServletRequest request)
    {
        String userIC = request.getParameter("patientIC");
        String phoneNO = request.getParameter("patientPhoneNo");
        String patientName = request.getParameter("patientName");
        String patientPassword = request.getParameter("patientPassword");
        String patientEmail = request.getParameter("patientEmail");

        Patient patient = new Patient();
        patient.setName(patientName);
        patient.setPatientEmail(patientEmail);
        patient.setPatientPassword(patientPassword);
        patient.setUserIC(userIC);
        patient.setPhoneNO(phoneNO);

        PatientDAO patientDAO = new PatientDAO();
        int row = patientDAO.register(patient);
        System.out.println("row affected: " + row);
        return "homePage";

    }

    @GetMapping("/login")
    public String login() {
        return "loginPage";
    }

    @PostMapping(value="/loginController")
    public String mainPage(HttpServletRequest request, Model mod, HttpSession session) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        Patient patient = PatientDAO.authenticate(email, password);
        if (patient != null) {
            session.setAttribute("patient", patient);
            return "redirect:/mainpage#!/homepage";
        }
        else {
            return "redirect:/Patient/login";
        }
    }
}
