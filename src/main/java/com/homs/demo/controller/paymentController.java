package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.homs.demo.dbutil.paymentCCDAO;
import com.homs.demo.model.paymentPageCC;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class paymentController {

    @GetMapping(value="/paymentCC")
    public String choosePaymentCC() {
        return "paymentCC";
    }

    @GetMapping(value="/paymentOnlineBanking")
    public String choosePaymentOnlineBanking() {
        return "paymentOnlineBanking";
    }

    @GetMapping(value="/paymentCash")
    public String choosePaymentCash() {
        return "paymentCash";
    }

    @PostMapping("/paymentCCDetails")
    public String register(HttpServletRequest request)
    {

        HttpSession session = request.getSession();
        int cardNo = Integer.parseInt(request.getParameter("cardNo"));
        int cvvNo = Integer.parseInt(request.getParameter("cvvNo"));
        String expiryDate = request.getParameter("expiryDate");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String country = request.getParameter("country");
        String state = request.getParameter("state");
        String city = request.getParameter("city");
        int postalCode = Integer.parseInt(request.getParameter("postalCode"));
        String email = request.getParameter("email");
        String phoneNo = request.getParameter("phoneNo");

        paymentPageCC p = new paymentPageCC(cardNo,cvvNo,expiryDate,firstName,lastName,country,state,city,postalCode,email,phoneNo);

        session.setAttribute("p", p);

        paymentCCDAO paymentCCDAO = new paymentCCDAO();
        int row = paymentCCDAO.fillDetails(p);
        System.out.println("row affected: " + row);
        return "homePage";

    }

    
    
}
