package com.homs.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import com.homs.demo.dbutil.PatientDAO;
import com.homs.demo.dbutil.StaffDAO;
import com.homs.demo.model.Patient;
import com.homs.demo.model.Staff;



@Controller
public class loginController {

    @PostMapping(value="/loginController")
    public String login(HttpServletRequest request, HttpSession session, Staff staff, Patient patient) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        staff = StaffDAO.authenticate(email, password);
        if (staff != null) {
            session.setAttribute("staff", staff);
            return "redirect:/staff/staffDashboard";
        }
        else {
            patient = PatientDAO.authenticate(email, password);
            if (patient != null) {
                session.setAttribute("patient", patient);
                return "redirect:/mainpage#!/homepage";
            }
            else {
                return "redirect:/login";
            }
        }
    }
}
