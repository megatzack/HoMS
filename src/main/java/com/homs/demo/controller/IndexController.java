package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homs.demo.dbutil.PatientDAO;
import com.homs.demo.dbutil.StaffDAO;
import com.homs.demo.model.Patient;
import com.homs.demo.model.Staff;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class IndexController{
    
    @RequestMapping(value = "/register")
    public String getregisterPage() {
        return "registerPage";
    }
    
    @GetMapping(value = "/login")
    public String getLoginPage() {
        return "loginPage";
    }

    @PostMapping(value="welcomeBack")
    public String loginController(HttpServletRequest request, HttpSession session,Staff staff, Patient patient, Model model) {
        // Here Implement the logic to check the user credentials
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        staff = StaffDAO.authenticate(email,password);
        try{
            session.setAttribute("staff", staff);
            Staff test = (Staff) session.getAttribute("staff");
            System.out.println(test.getStaffDepartment());
            return "redirect:/staffpage#!/homepage";
        }catch(NullPointerException e1){
            //Patient Session
            patient = PatientDAO.authenticate(email,password);
            try {
                session.setAttribute("patient", patient);
                model.addAttribute("patient", patient);
                patient = (Patient) session.getAttribute("patient");
                System.out.println(patient.getName());
                return "redirect:/mainpage#!/homepage";
            } catch (NullPointerException e2) {
                return "redirect:/login";
            }
        }
    }
    
    @RequestMapping(value = "/logout")
    public String getLogoutPage(HttpSession session) {
        session.removeAttribute("staff");
        session.removeAttribute("patient");
        return "redirect:/login";
    }

}
