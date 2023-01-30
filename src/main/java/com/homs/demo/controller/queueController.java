package com.homs.demo.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homs.demo.dbutil.QueueDAO;
import com.homs.demo.dbutil.RecordDAO;
import com.homs.demo.model.Patient;
import com.homs.demo.model.Queue;
import com.homs.demo.model.Record;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;


@Controller
public class queueController {

    @GetMapping("queueController")
    public String queue(HttpSession session) {
        //check if the patient is logged in
        Patient patient = (Patient) session.getAttribute("patient");
        if (patient == null) {
            return "redirected:/login";
        }
        return "queueForm";
    }
    @RequestMapping("/EnterQueue")
    public String enterQueue(HttpSession session, Model model, HttpServletRequest request) {
        //initialize the queueDAO and patient object
        QueueDAO queueDAO = new QueueDAO();
        Patient patient = null;
        
        // Get the patient attribute from the session
        patient = (Patient) session.getAttribute("patient");
        //check if the patient is logged in
        if (patient == null) {
            return "redirect:/login";
        } 
        else{
            //check if the patient is already in the queue
            Queue queue = queueDAO.getQueueByPatient(patient);
            //if not, add the patient to the queue
            if (queue == null) {
                //create a new queue object and add it to the database
                queue = new Queue(patient.getPatientID(), "Waiting...", Timestamp.valueOf(LocalDateTime.now()));
                int row = queueDAO.enterVirtualQueue(queue);
                model.addAttribute("queue", queue);

            }
            // if the patient is already in the queue, return the queue
            else{
                model.addAttribute("queue", queue);

            }

        }
        //get the medical history from the form
        String medicalHistory = request.getParameter("medicalHistory");
        Record record = new Record(patient.getPatientID(), medicalHistory);
        //add the medical history to the database
        RecordDAO recordDAO = new RecordDAO();
        int row = recordDAO.enterRecord(record);
        
        //get all the queue objects into a lists from the database
        java.util.List<Map<String, Object>> queues = queueDAO.getAllQueue();
        model.addAttribute("queues", queues);
        return "queue";        
    }
}
