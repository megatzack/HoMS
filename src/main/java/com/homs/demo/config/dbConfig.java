package com.homs.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.homs.demo.dbutil.AmbulanceDAO;
import com.homs.demo.dbutil.PatientDAO;
import com.homs.demo.dbutil.QueueDAO;
import com.homs.demo.dbutil.StaffDAO;
import com.homs.demo.dbutil.reviewDAO;
import com.homs.demo.dbutil.inventoryDAO;
import com.homs.demo.dbutil.paymentCCDAO;
import com.homs.demo.dbutil.appointmentDAO;

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
    public QueueDAO queueDAO() {
        return new QueueDAO();
    }

    @Bean
    public paymentCCDAO paymentCCDAO() {
        return new paymentCCDAO();
    }

    @Bean
    public appointmentDAO appointmentDAO() {
        return new appointmentDAO();
    }
}
