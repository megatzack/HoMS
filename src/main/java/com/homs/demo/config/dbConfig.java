package com.homs.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.homs.demo.dbutil.PatientDAO;
import com.homs.demo.dbutil.StaffDAO;

@Controller
public class dbConfig {
    @Bean
    public PatientDAO patientDAO() {
        return new PatientDAO();
    }
}
