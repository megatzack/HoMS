package com.homs.demo.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.homs.demo.dbutil.QueueDAO;
import com.homs.demo.model.Patient;
import com.homs.demo.model.Queue;

import jakarta.servlet.http.HttpSession;

@Controller
public class queueController {

    @GetMapping("queueController")
    public String queue() {
        return "queueForm";
    }
    @RequestMapping("/EnterQueue")
    public String enterQueue(HttpSession session, Model model) {
        // Get the patient attribute from the session
        Patient patient = (Patient) session.getAttribute("patient");
        if(patient == null) {
            // If the patient attribute is null, return an error message
            model.addAttribute("error", "No patient found in session");
            return "error";
        }
        else{
            QueueDAO queueDAO = new QueueDAO();
            // Queue isFirst = queueDAO.getQueueID();
            // if (isFirst == null) {
            //     Queue queue = new Queue(patient.getPatientID(), "Currently served", Timestamp.valueOf(LocalDateTime.now()));
            //     int row = queueDAO.enterVirtualQueue(queue);
            //     if (row == 0) {
            //         model.addAttribute("error", "Error entering queue");
            //         return "error";
            //     }
            //     else {
            //         model.addAttribute("queue", queue);
            //         return "queue";
            //     }
            // }
            // else {
                Queue queue = new Queue(patient.getPatientID(), "Next line", Timestamp.valueOf(LocalDateTime.now()));
                int row = queueDAO.enterVirtualQueue(queue);
                if (row == 0) {
                    model.addAttribute("error", "Error entering queue");
                    return "error";
                }
                else {
                    model.addAttribute("queue", queue);
                    return "queue";
                }
            
        }


        
    }


    @GetMapping("estimate-serving-time")
    public String estimateServingTime(Model model) {
        LocalDateTime currentTime = LocalDateTime.now();
        int estimatedTimePerPatient = 5; // minutes
        int patientPosition = 3;
        LocalDateTime estimatedServingTime = currentTime.plusMinutes(estimatedTimePerPatient * patientPosition);
        model.addAttribute("estimatedServingTime", estimatedServingTime);
        return "estimate-serving-time";
    }



}
