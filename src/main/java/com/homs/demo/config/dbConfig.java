package com.homs.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.homs.demo.dbutil.loginDAO;

@Controller
public class dbConfig {
    @Bean
    public loginDAO loginDAO() {
        return new loginDAO();
    }
}
