package com.homs.demo.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @PostMapping(value = "staffupdate")
    public String staff_update(HttpSession session, HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        StaffDAO staffDAO = new StaffDAO();
        Staff staff = staffDAO.updateStaff(name, email);
        if (staff != null) {
            // Change Session Data
            session.setAttribute("staff", staff);
            // Change Model Data
            model.addAttribute("staff", staff);

        }
        // 
        return "redirect:/staffpage#!/about";
    }
}