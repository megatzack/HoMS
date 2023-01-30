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
        Patient patient = (Patient) session.getAttribute("patient");
        if (patient == null) {
            return "redirect:/login";
        }
        return "queueForm";
    }
    @RequestMapping("/EnterQueue")
    public String enterQueue(HttpSession session, Model model, HttpServletRequest request) {
        
        // Get the patient attribute from the session
        QueueDAO queueDAO = new QueueDAO();
        Patient patient = null;
        patient = (Patient) session.getAttribute("patient");
        if (patient == null) {
            return "redirect:/login";
        } 
        else{
            Queue queue = queueDAO.getQueueByPatient(patient);
            if (queue == null) {
                queue = new Queue(patient.getPatientID(), "Waiting...", Timestamp.valueOf(LocalDateTime.now()));
                int row = queueDAO.enterVirtualQueue(queue);
                model.addAttribute("queue", queue);

            }
            else{
                model.addAttribute("queue", queue);

            }

        }
        String medicalHistory = request.getParameter("medicalHistory");
        Record record = new Record(patient.getPatientID(), medicalHistory);
        RecordDAO recordDAO = new RecordDAO();
        int row = recordDAO.enterRecord(record);

        java.util.List<Map<String, Object>> queues = queueDAO.getAllQueue();
        model.addAttribute("queues", queues);
        return "queue";        
    }
}
