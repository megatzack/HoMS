package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homs.demo.dbutil.AmbulanceDAO;
import com.homs.demo.model.Ambulance;


@Controller
public class ambulanceController {
    
    @GetMapping(value="/choosePlate")
    public String choosePlate() {
        return "ambulance";
    }

    @PostMapping(value="/checkAmbulance")
    public String check(@RequestParam("select_ambulance")String plateNum){
        Ambulance ambulance = null;
        AmbulanceDAO ambulanceDAO = new AmbulanceDAO();
        ambulance = ambulanceDAO.getByPlate(plateNum);
        System.out.println(ambulance.getName());
        
        
        return "ambulanceRespond";
    }
    
}
