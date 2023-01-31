package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homs.demo.dbutil.appointmentDAO;

import com.homs.demo.model.appointment;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/appointment")
public class appointmentController {

    @PostMapping("/bookAppointment")
    public String bookAppointment(HttpServletRequest request)
    {

        HttpSession session = request.getSession();
        String date = request.getParameter("date");
        String medicalSpeciality = request.getParameter("medicalSpeciality");
        String treatmentInquiry = request.getParameter("treatmentInquiry");

        appointment a = new appointment(date, medicalSpeciality, treatmentInquiry);

        session.setAttribute("a", a);

        appointmentDAO appointDAO = new appointmentDAO();
        int row = appointDAO.insertBookingDetails(a);
        System.out.println("row affected: " + row);
        return "redirect:/payment/paymentPage";

    }
}
