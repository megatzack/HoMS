package com.homs.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;

import com.homs.demo.dbutil.loginDAO;
import com.homs.demo.model.Auth;



@Controller
public class loginController {
    @Autowired
    private loginDAO loginDAO;

    @PostMapping(value="/loginController")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        Auth auth = loginDAO.validate(email, password);
        if (auth != null) {
            model.addAttribute("user", auth);
            session.setAttribute("user", auth);

            return "redirect:/page#!/homepage";
        }
        else {
            model.addAttribute("message", "Invalid email or password");
            return "redirect:/login";
        }
    
    }
}
