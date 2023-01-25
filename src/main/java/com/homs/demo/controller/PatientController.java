package com.homs.demo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homs.demo.dbutil.PatientDAO;
import com.homs.demo.model.Patient;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Patient")
public class PatientController {

    @GetMapping("/PatientDB")
    public String opendb() {
    try {
        String dbURL = "jdbc:mysql://localhost:3306/homs";
            String username = "root";
            String password = "HawbAndFj6";
                
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection( dbURL,username,password);
            System.out.println("successfully open database connection  :" +connection.getMetaData());
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    return null;
    }
    
    @GetMapping("/PatientRegisterPage")
    public String Patient_register() {
       // return "Patient_register";
       return "registerPage";
    }

    @PostMapping("/registerPatient")
    public String register(HttpServletRequest request)
    {
        String userIC = request.getParameter("patientIc");
        String phoneNO = request.getParameter("patientPhoneNo");
        String name = request.getParameter("patientName");
        String patientEmail = request.getParameter("patientEmail");
        String patientPassword = request.getParameter("patientPassword");

        Patient patient = new Patient();
        patient.setUserIC(userIC);
        patient.setPhoneNO(phoneNO);
        patient.setName(name);
        patient.setPatientEmail(patientEmail);
        patient.setPatientPassword(patientPassword);

        PatientDAO patientDAO = new PatientDAO();
        int row = patientDAO.register(patient);
        System.out.println("row affected: " + row);
        return "homePage";

    }
}
