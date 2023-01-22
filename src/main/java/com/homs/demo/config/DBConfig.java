package com.homs.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.homs.demo.DAO.reviewDAO;
import com.homs.demo.DAO.userDAO;

@Controller
public class DBConfig {
    @Bean
    public userDAO userDAOSetup() {
        return new userDAO();
    }

    @Bean
    public reviewDAO adminDAOSetup() {
        return new reviewDAO();
    }
}
