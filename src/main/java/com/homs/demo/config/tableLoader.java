package com.homs.demo.config;

import java.util.List;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class tableLoader {
    private final JdbcTemplate jdbcTemplate;

    public tableLoader(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        createTable();
    }

    public void createTable() {
        List<String> tables = null;
        tables = jdbcTemplate.queryForList("SHOW TABLES", String.class);
        if (!tables.contains("review")) {
            jdbcTemplate.execute("CREATE TABLE review ("
                    + "idreview INT NOT NULL AUTO_INCREMENT,"
                    + "name MEDIUMTEXT NOT NULL,"
                    + "email MEDIUMTEXT,"
                    + "review LONGTEXT NOT NULL,"
                    + "PRIMARY KEY (idreview)"
                    + ")");
            System.out.println("Table 'review' created");
        }
        if (!tables.contains("product")) {
            jdbcTemplate.execute("CREATE TABLE product ("
                    + "idproduct INT NOT NULL AUTO_INCREMENT,"
                    + "name VARCHAR(45) NOT NULL,"
                    + "description LONGTEXT NOT NULL,"
                    + "price DOUBLE NOT NULL,"
                    + "picture BLOB NOT NULL,"
                    + "type VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (idproduct)"
                    + ")");
            System.out.println("Table 'product' created");
        }
        if (!tables.contains("staff")){
            jdbcTemplate.execute("CREATE TABLE staff ("
                    + "staffID INT NOT NULL AUTO_INCREMENT,"
                    + "staffName VARCHAR(45) NOT NULL,"
                    + "staffEmail VARCHAR(45) NOT NULL,"
                    + "staffPassword VARCHAR(45) NOT NULL,"
                    + "staffDepartment VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (staffID)"
                    + ")");
            System.out.println("Table 'staff' created");
        }
        if (!tables.contains("patient")){
            jdbcTemplate.execute("CREATE TABLE patient ("
                    + "patientID INT NOT NULL AUTO_INCREMENT,"
                    + "patientName VARCHAR(45) NOT NULL,"
                    + "patientEmail VARCHAR(45) NOT NULL,"
                    + "patientPassword VARCHAR(45) NOT NULL,"
                    + "patientIC VARCHAR(45) NOT NULL,"
                    + "patientPhoneNo VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (patientID)"
                    + ")");
            System.out.println("Table 'patient' created");
        }
        if (!tables.contains("auth")) {
            jdbcTemplate.execute("CREATE TABLE auth ("
                    + "authID INT NOT NULL AUTO_INCREMENT,"
                    + "patientID INT,"
                    + "staffID INT,"
                    + "name VARCHAR(45) NOT NULL,"
                    + "email VARCHAR(45) NOT NULL,"
                    + "password VARCHAR(45) NOT NULL,"
                    + "userType VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (authID),"
                    + "FOREIGN KEY (patientID) REFERENCES patient(patientID),"
                    + "FOREIGN KEY (staffID) REFERENCES staff(staffID)"
                    + ")");
            System.out.println("Table 'auth' created");
        }
    }
    
}
