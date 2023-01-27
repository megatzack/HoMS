package com.homs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import com.homs.demo.dbutil.PatientDAO;
import com.homs.demo.dbutil.StaffDAO;
import com.homs.demo.model.Patient;
import com.homs.demo.model.Staff;



@Controller
public class loginController {
    @Autowired
    private StaffDAO StaffDAO;
    @Autowired
    private PatientDAO PatientDAO;

    @PostMapping(value="/login")
    public String login(HttpServletRequest request, HttpSession session, Staff staff, Patient patient) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            staff = StaffDAO.authenticate(email, password);
            System.out.println(staff.getStaffEmail());
            session.setAttribute("staff", staff);
            return "redirect:/staff/staffDashboard";
        } catch (NullPointerException e1) {
            try {
                patient = PatientDAO.authenticate(email, password);
                session.setAttribute("patient", patient);
                return "redirect:/mainpage#!/homepage";
            } catch (NullPointerException e2) {
                return "redirect:/login";
            } 
        }  
        }
    }
