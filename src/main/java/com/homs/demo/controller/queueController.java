package com.homs.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.homs.demo.dbutil.QueueDAO;
import com.homs.demo.model.Patient;
import com.homs.demo.model.Queue;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/queue")
public class queueController {

    public String queue(HttpSession session) {
        // Get the patient attribute from the session
        Patient patient = (Patient) session.getAttribute("patient");
        // Queue queue = new Queue(patient, "");
        QueueDAO queueDAO = new QueueDAO();
        int row = queueDAO.enterVirtualQueue(patient);
        if (row == 1) {
            return "queue";
        }
        else {
            return "error";
        }
        
    }

    @RequestMapping("/virtual")
    public ModelAndView viewQueue(HttpSession session) {
        // Get the patient attribute from the session
        Patient patient = (Patient) session.getAttribute("patient");
        QueueDAO queueDAO = new QueueDAO();
        Queue queue = queueDAO.refresh(patient);
        return new ModelAndView("virtualQueue", "queue", queue);
    }

}