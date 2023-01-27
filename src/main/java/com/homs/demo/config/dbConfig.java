package com.homs.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.homs.demo.dbutil.AmbulanceDAO;
import com.homs.demo.dbutil.PatientDAO;
import com.homs.demo.dbutil.StaffDAO;
import com.homs.demo.dbutil.reviewDAO;
import com.homs.demo.dbutil.inventoryDAO;

@Controller
public class dbConfig {
    @Bean
    public PatientDAO patientDAO() {
        return new PatientDAO();
    }

    @Bean
    public StaffDAO staffDAO() {
        return new StaffDAO();
    }

    @Bean
    public reviewDAO reviewDAO() {
        return new reviewDAO();
    }

    @Bean
    public inventoryDAO inventoryDAO() {
        return new inventoryDAO();
    }
    
    @Bean
    public AmbulanceDAO ambulanceDAO() {
        return new AmbulanceDAO();
    }

    @Bean
    public inventoryDAO inventoryDAO() {
        return new inventoryDAO();
    }
    
}
