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
        List<String> tables = jdbcTemplate.queryForList("SHOW TABLES", String.class);
        if (!tables.contains("auth")) {
            jdbcTemplate.execute("CREATE TABLE auth ("
                    + "id_auth INT NOT NULL AUTO_INCREMENT,"
                    + "name MEDIUMTEXT NOT NULL,"
                    + "email VARCHAR(55) NOT NULL,"
                    + "password VARCHAR(55) NOT NULL,"
                    + "role VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (id_auth)"
                    + ")");
            System.out.println("Table 'auth' created");
        }
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
                    + "picture MEDIUMTEXT NOT NULL,"
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
        if (!tables.contains("product")){
            jdbcTemplate.execute("CREATE TABLE product ("
                    + "idproduct INT NOT NULL AUTO_INCREMENT,"
                    + "name VARCHAR(45) NOT NULL,"
                    + "description LONGTEXT NOT NULL,"
                    + "price DOUBLE NOT NULL,"
                    + "picture MEDIUMTEXT NOT NULL,"
                    + "type VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (idproduct)"
                    + ")");
            System.out.println("Table 'product' created");
        }
        if (!tables.contains("ambulance")){
            jdbcTemplate.execute("CREATE TABLE product ("
                    + "ambulanceID INT NOT NULL AUTO_INCREMENT,"
                    + "name TEXT UNIQUE NOT NULL,"
                    + "contact TEXT NOT NULL,"
                    + "location TEXT NOT NULL,"
                    + "status TEXT NOT NULL,"
                    + "ambulancePlate TEXT NOT NULL,"
                    + "department TEXT NOT NULL,"
                    + "dates TEXT,"
                    + "times TEXT,"
                    + "PRIMARY KEY (ambulanceID)"
                    + ")");
            System.out.println("Table 'ambulance' created");
        }
        if (!tables.contains("schedule")){
            jdbcTemplate.execute("CREATE TABLE product ("
                    + "scheduleID INT NOT NULL AUTO_INCREMENT,"
                    + "name TEXT UNIQUE NOT NULL,"
                    + "ocInTime TEXT NOT NULL,"
                    + "ocOutTime TEXT NOT NULL,"
                    + "tcInTime TEXT NOT NULL,"
                    + "tcOutTime TEXT NOT NULL,"
                    + "notes TEXT NOT NULL,"
                    + "PRIMARY KEY (scheduleID)"
                    + ")");
            System.out.println("Table 'schedule' created");
        }

    }
    
}
