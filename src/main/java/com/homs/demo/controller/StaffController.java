package com.homs.demo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.homs.demo.dbutil.AmbulanceDAO;
import com.homs.demo.dbutil.StaffDAO;
import com.homs.demo.model.Ambulance;
import com.homs.demo.model.Staff;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/staff")
public class StaffController {
    
    @GetMapping("/create")
    public String staff_register() {
        return "registerStaff";
    }

    @PostMapping("/createStaff")
    public String register(HttpServletRequest request) throws SQLException
    {
        String staffName = request.getParameter("staffName");
        String staffEmail = request.getParameter("staffEmail");
        String staffPassword = request.getParameter("staffPassword");
        String staffDepartment = request.getParameter("staffDepartment");
        System.out.println("meh");
        Staff staff = new Staff();
        staff.setStaffName(staffName);
        staff.setStaffEmail(staffEmail);
        staff.setStaffPassword(staffPassword);
        staff.setStaffDepartment(staffDepartment);

        StaffDAO staffDAO = new StaffDAO();
        int row = staffDAO.create(staff);
        System.out.println("row affected: " + row);

        if(staff.getStaffDepartment().equals("Ambulance Department")){
            Ambulance ambulance = new Ambulance(staff.getStaffName(),"-","-","available","-",staff.getStaffDepartment());
            AmbulanceDAO ambulanceDAO = new AmbulanceDAO();
            int rowss = ambulanceDAO.createAmbulance(ambulance);
            System.out.println("ambulance table affected: " + rowss);
        }
        
        return "staffHomePage";
    }
    
    @GetMapping(value="/login")
    public String login(){
        return "loginPage";
    }

    @PostMapping(value="/welcomeBack")
    public String loginController(HttpServletRequest request, HttpSession session,Staff staff) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        //StaffDAO staffDAO = new StaffDAO();
        staff = StaffDAO.authenticate(email,password);
        try{

            session.setAttribute("staff", staff);
            return "redirect:/mainpage#!/homepage";
        }catch(Exception e){
            return "redirect:/staff/login";
        }
    }

    @GetMapping(value="/login")
    public String login(){
        return "loginPage";
    }

    @PostMapping(value="/welcomeBack")
    public String loginController(HttpServletRequest request, HttpSession session,Staff staff) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        //StaffDAO staffDAO = new StaffDAO();
        staff = StaffDAO.authenticate(email,password);

        try{

            session.setAttribute("staff", staff);
            return "redirect:/mainpage#!/homepage";
        }catch(Exception e){
            return "redirect:/staff/login";
        }
    }
}
