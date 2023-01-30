package com.homs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homs.demo.dbutil.reviewDAO;
import com.homs.demo.model.review;


@Controller
public class reviewController {
    @Autowired
    private reviewDAO reviewDAO;
    
    @PostMapping(value="reviewController")
    public String submitReview(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("review") String review, Model model) {
        if (name == null || name.isEmpty() || email == null || email.isEmpty() || review == null || review.isEmpty()) {
            
        }
        else {
            review cust_review = reviewDAO.submit(name, email, review);
        }
        return "redirect:/mainpage#!/homepage";
    }
    
    @GetMapping(value="reviewlist")
    public String reviewList(Model model) {
        model.addAttribute("review", reviewDAO.getReviewList());
        return "reviewList";
    }
}