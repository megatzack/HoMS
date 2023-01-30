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
    private String crediential_status;
    @RequestMapping(value = "/register")
    public String getregisterPage() {
        return "registerPage";
    }
    
    @GetMapping(value = "/login")
    public String getLoginPage(Model model) {
        model.addAttribute("status", crediential_status);
        return "loginPage";
    }

    @PostMapping(value="welcomeBack")
    public String loginController(HttpServletRequest request, HttpSession session,Staff staff, Patient patient, Model model) {
        model.addAttribute("status", "Granted");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        staff = StaffDAO.authenticate(email,password);
        try{
            session.setAttribute("staff", staff);
            Staff test = (Staff) session.getAttribute("staff");
            System.out.println(test.getStaffDepartment());
            return "forward:/staff";
        }catch(NullPointerException e1){
            //Patient Session
            patient = PatientDAO.authenticate(email,password);
            try {
                session.setAttribute("patient", patient);
                Patient test2 = (Patient) session.getAttribute("patient");
                System.out.println(test2.getPatientName());
                return "forward:/patient";
            } catch (NullPointerException e2) {
                crediential_status = "Invalid Credientials";
                return "redirect:/login";
            }
        }
    }
    
    @RequestMapping(value = "/staff")
    public String getStaffPage(HttpServletRequest request) {
        if (request.getSession().getAttribute("staff") != null) {
            return "redirect:/staffpage#!/homepage";
        }
        else 
            return "errorPage";
        
    }
    @RequestMapping(value = "/patient")
    public String getPatientPage() {
        return "redirect:/mainpage#!/homepage";
    }
    @RequestMapping(value = "/logout")
    public String getLogoutPage(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

}
