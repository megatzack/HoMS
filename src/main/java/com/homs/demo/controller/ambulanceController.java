package com.homs.demo.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homs.demo.dbutil.AmbulanceDAO;
import com.homs.demo.model.Ambulance;
import com.homs.demo.model.Staff;

import jakarta.servlet.http.HttpSession;


@Controller
public class ambulanceController {
    
    @GetMapping(value="/choosePlate")
    public String choosePlate() {
        return "ambulance";
    }

    @PostMapping(value="/checkAmbulance")
    public String check(@RequestParam("select_ambulance")String plateNum, Model model){
        Ambulance ambulance = null;
        AmbulanceDAO ambulanceDAO = new AmbulanceDAO();
        ambulance = ambulanceDAO.getByPlate(plateNum);
        System.out.println(ambulance.getName());
        model.addAttribute("ambulance",ambulance);
        
        return "ambulanceRespond";
    }

    @GetMapping(value="/myProfile")
    public String myProfile(HttpSession session, Model model){
        Ambulance ambulance = null;
        AmbulanceDAO ambulanceDAO = new AmbulanceDAO();

        Staff staff = (Staff)session.getAttribute("staff");

        //ambulance = ambulanceDAO.getByName("yasir");
        ambulance = ambulanceDAO.getByName(staff.getStaffName());
        model.addAttribute("ambulance", ambulance);

        return "ambulance_profile";
    }

    @PostMapping(value="/updateMyProfile")
    public String updateProfile(@RequestParam("name")String name, @RequestParam("contact")String contact, @RequestParam("status")String status, @RequestParam("location")String location, @RequestParam("ambulancePlate")String ambulancePlate){
        AmbulanceDAO ambulanceDAO = new AmbulanceDAO();
        int row = ambulanceDAO.getNewProfile(name, contact, location, status, ambulancePlate);

        return "redirect:/mainpage#!/homepage";
    }
    
}
