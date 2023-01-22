package com.homs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homs.demo.DAO.reviewDAO;
import com.homs.demo.model.review;

import jakarta.servlet.http.HttpSession;

@Controller
public class reviewController {
    @Autowired
    private reviewDAO reviewDAO;

    @PostMapping("/reviewController")
    public String review(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("review") String review, HttpSession session, Model Model) {
        review cust_review = reviewDAO.submit(name, email, review);
        Model.addAttribute("review", cust_review);
        session.setAttribute("review", cust_review);
        return "redirect:/page#!/homepage";
    }
}
