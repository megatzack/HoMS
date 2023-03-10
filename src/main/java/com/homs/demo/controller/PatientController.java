package com.homs.demo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homs.demo.dbutil.PatientDAO;
import com.homs.demo.model.Patient;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/Patient")
public class PatientController {
    
    @GetMapping("/create")
    public String Patient_register() {
       // return "Patient_register";
       return "registerPatient";
    }

    @PostMapping("/welcome")
    public String register(HttpServletRequest request, HttpSession session)
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

        session.setAttribute("patient", patient);
        PatientDAO patientDAO = new PatientDAO();
        int row = patientDAO.register(patient);
        System.out.println("row affected: " + row);
        return "redirect:/login";

    }

    @GetMapping("/login")
    public String login(){
        return "loginPage";
    }


    @PostMapping(value="/updatePatientProfile")
    public String updateProfileDetails(@RequestParam("Name")String Name, @RequestParam("patientEmail")String patientEmail,@RequestParam("phoneNO")String phoneNO,HttpSession session,Model model){
        PatientDAO patientDAO = new PatientDAO();
        Patient patient = null;
        patient = patientDAO.getByname(Name);
        model.addAttribute("patient", patient);
        int row = patientDAO.updateProfile(Name, patientEmail, phoneNO);

        return "redirect:/mainpage#!/homepage";

    }

    @GetMapping(value="/patientProfile")
    public String myProfile(HttpSession session){

        Patient patient = (Patient)session.getAttribute("patient");

        return "patientProfile";
    }
    
}

