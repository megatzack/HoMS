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
    public String login(HttpServletRequest request, Model model, HttpSession session) {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
    
        String userIC = request.getParameter("userIC");
        String phoneNo = request.getParameter("phoneNo");

        //Detect userType (radio button)
        String userType = request.getParameter("userType");

        Staff staff = null;
        Patient patient = null;
        
        if (userType == "staff"){
            staff = StaffDAO.authenticate(email, password);
            //Redirect to staff dashboard. May change later
            return "redirect:/staff/staffDashboard";
        }
        else if (userType == "patient"){
            patient = PatientDAO.authenticate(userIC, phoneNo);
            //Redirect to patient dashboard. May change later
            model.addAttribute("patient", patient);
            return "redirect:/mainpage#!/homepage";
        }
        else{
            return "redirect:/login";
        }
    }
}
