package com.homs.demo.controller;

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

    
    @GetMapping("/create")
    public String Patient_register() {
       // return "Patient_register";
       return "registerPatient";
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
        patient.setPatientName(patientName);
        patient.setPatientEmail(patientEmail);
        patient.setPatientPassword(patientPassword);
        patient.setPatientIC(userIC);
        patient.setPatientPhoneNO(phoneNO);

        PatientDAO patientDAO = new PatientDAO();
        int row = patientDAO.register(patient);
        System.out.println("row affected: " + row);
        return "loginPage";

    }

    @PostMapping("/update")
    public String update(HttpServletRequest request, HttpSession session, Model model)
    {
        String phoneNo = request.getParameter("phoneNo");
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        PatientDAO patientDAO = new PatientDAO();
        Patient patient = patientDAO.updatePatient(name, phoneNo, email);
        if (patient != null) {
            // Change Session Data
            session.setAttribute("patient", patient);
            // Change Model Data
            model.addAttribute("patient", patient);
        }
        
        return "redirect:/mainpage#!/about";

    }
}

