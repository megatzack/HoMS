package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/appointment")
public class appointmentController {
    
    @GetMapping(value="/bookAppointment")
    public String bookAppointment() {
        return "appointment";
    }

    @PostMapping("/paymentCCDetails")
    public String register(HttpServletRequest request)
    {

        HttpSession session = request.getSession();
        String expiryDate = request.getParameter("expiryDate");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        paymentPageCC p = new paymentPageCC(cardNo,cvvNo,expiryDate,firstName,lastName,country,state,city,postalCode,email,phoneNo);

        session.setAttribute("p", p);

        paymentCCDAO paymentCCDAO = new paymentCCDAO();
        int row = paymentCCDAO.fillDetails(p);
        System.out.println("row affected: " + row);
        return "homePage";

    }
}
