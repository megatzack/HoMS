package com.homs.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.homs.demo.dbutil.RecordDAO;
import com.homs.demo.model.Record;



@Controller
public class reportController {

    @GetMapping("medicalReportController")
    public String report() {
        // RecordDAO recordDAO = new RecordDAO();
        // java.util.List<Map<String, Object>> record = recordDAO.getAllRecord();
        // model.addAttribute("record", record);
        return "patientMedicalReport";
    }

}
