package com.homs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired

    @GetMapping(value = "/")
    public String firstpage() {
        return "Register";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "Register";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "loginPage";
    }

    @RequestMapping(value = "/registration")
    public String registration() {
        return "registration";
    }

    @RequestMapping(value = "/staff")
    public String staff() {
        return "staff";
    }

    @RequestMapping(value = "/patient")
    public String patient() {
        return "patient";
    }

    @RequestMapping(value = "/queue")
    public String queue() {
        return "queue";
    }

    @RequestMapping(value = "/medical-report")
    public String medicalReport() {
        return "medical-report";
    }

    @RequestMapping(value = "/appointment")
    public String appointment() {
        return "appointment";
    }

    @RequestMapping(value = "/payment")
    public String payment() {
        return "payment";
    }

    @RequestMapping(value = "/ambulance")
    public String ambulance() {
        return "ambulance";
    }

    @RequestMapping(value = "/inventory")
    public String inventory() {
        return "inventory";
    }

    @RequestMapping(value = "/satisfaction")
    public String satisfaction() {
        return "satisfaction";
    }

    @RequestMapping(value = "/schedule")
    public String schedule() {
        return "schedule";
    }
}
