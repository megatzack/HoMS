package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homs.demo.dbutil.paymentCCDAO;
import com.homs.demo.model.paymentPageCC;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/payment")
public class paymentController {

    @RequestMapping(value="/paymentPage")
    public String choosePaymentCC(HttpServletRequest request) {

        String paymentopt = request.getParameter("paymentopt");
        String page = null;

        if(paymentopt == "Online Banking"){
            page = "paymentOnlineBanking";
        }

        else if(paymentopt == "Credit Card"){
            page = "paymentCC";
        }

        else if(paymentopt == "Cash"){
            page = "paymentCash";
        }

        return page;
    }

    @GetMapping(value="/paymentOnlineBanking")
    public String choosePaymentOnlineBanking() {
        return "paymentOnlineBanking";
    }

    @GetMapping(value="/paymentCash")
    public String choosePaymentCash() {
        return "paymentCash";
    }

    @GetMapping(value="/paymentCC")
    public String choosePaymentCC() {
        return "paymentCC";
    }
    

    @PostMapping(value="/paymentCC")
    public String paymentDetails(HttpServletRequest request)
    {

        HttpSession session = request.getSession();
        String cardNo = request.getParameter("cardNo");
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
        return "redirect:/mainpage#!/homepage";

    }

    
    
}
