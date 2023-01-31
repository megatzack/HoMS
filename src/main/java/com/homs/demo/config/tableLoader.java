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
        if (!tables.contains("queue")) {
            jdbcTemplate.execute("CREATE TABLE queue ("
                    + "queueID INT NOT NULL AUTO_INCREMENT,"
                    + "patientID INT NOT NULL,"
                    + "queueStatus VARCHAR(45),"
                    + "queueTime TIMESTAMP NULL,"
                    + "PRIMARY KEY (queueID),"
                    + "FOREIGN KEY (patientID) REFERENCES patient(patientID)"
                    + ")");
            System.out.println("Table 'queue' created");
        }
        if (!tables.contains("record")){
            jdbcTemplate.execute("CREATE TABLE record ("
                    + "recordID INT NOT NULL AUTO_INCREMENT,"
                    + "patientID INT NOT NULL,"
                    + "medicalHistory VARCHAR(50) NULL,"
                    + "PRIMARY KEY (recordID),"
                    + "FOREIGN KEY (patientID) REFERENCES patient(patientID)"
                    + ")");
            System.out.println("Table 'record' created");
        }
        if (!tables.contains("paymentCC")){
            jdbcTemplate.execute("CREATE TABLE paymentCC ("
                    + "id_paymentCC INT NOT NULL AUTO_INCREMENT,"
                    + "cardNo VARCHAR(45) NOT NULL,"
                    + "cvvNo INT NOT NULL,"
                    + "expiryDate VARCHAR(45) NOT NULL,"
                    + "firstName VARCHAR(45) NOT NULL,"
                    + "lastName VARCHAR(45) NOT NULL,"
                    + "country VARCHAR(45) NOT NULL,"
                    + "state VARCHAR(45) NOT NULL,"
                    + "city VARCHAR(45) NOT NULL,"
                    + "postalCode INT NOT NULL,"
                    + "email VARCHAR(45) NOT NULL,"
                    + "phoneNo VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (id_paymentCC)"
                    + ")");
            System.out.println("Table 'paymentCC' created");
        }
        if (!tables.contains("appointment")){
            jdbcTemplate.execute("CREATE TABLE appointment ("
                    + "id_appointment INT NOT NULL AUTO_INCREMENT,"
                    + "date VARCHAR(45) NOT NULL,"
                    + "medicalSpeciality VARCHAR(45) NOT NULL,"
                    + "treatmentInquiry VARCHAR(45) NOT NULL,"
                    + ")");
            System.out.println("Table 'appointment' created");
        }

    }
    
}
