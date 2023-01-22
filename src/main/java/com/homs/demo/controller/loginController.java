package com.homs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homs.demo.DAO.userDAO;
import com.homs.demo.model.user;

import jakarta.servlet.http.HttpSession;

@Controller
public class loginController {
    @Autowired
    private userDAO userDAO;

    @PostMapping("/loginController")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        user user = userDAO.validate(email, password);
        if (user != null) {
            model.addAttribute("user", user);
            session.setAttribute("user", user);
            return "redirect:/page#!/homepage";
        }
        else {
            model.addAttribute("message", "Invalid email or password");
            return "redirect:/page#!/error";
        }
    }
   
}

