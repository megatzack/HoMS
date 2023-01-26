package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ambulanceController {
    
    @GetMapping(value="/choosePlate")
    public String choosePlate() {
        return "ambulance";
    }

    @PostMapping(value="/checkAmbulance")
    public String check(@RequestParam("select_ambulance")String plateNum){

        return "ambulanceRespond";
    }
    
}
