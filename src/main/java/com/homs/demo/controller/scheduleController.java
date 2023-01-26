package com.homs.demo.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class scheduleController {

    @GetMapping(value="/setSchedule")
    public String setSchedule() {

        return "adminSetSchedule";
    }
}
