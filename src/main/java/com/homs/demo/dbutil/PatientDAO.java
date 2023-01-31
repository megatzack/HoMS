package com.homs.demo.dbutil;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.homs.demo.model.Patient;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


import javax.sql.DataSource;

@Repository
public class PatientDAO {
    
    public int register(Patient patient) {
        
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "insert into `Patient` (`patientName`,`patientEmail`,`patientPassword`,`patientIC`, `patientPhoneNO`) values (?,?,?,?,?)";
        Object args[] = {patient.getName(), patient.getPatientEmail(), patient.getPatientPassword() ,patient.getUserIC(), patient.getPhoneNO()};

        int rowAffected = jbdct.update(sql, args);
        return rowAffected;
    }

    public static Patient authenticate(String email, String password) {
        Patient patient = null;
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM patient WHERE patientEmail = ? AND patientPassword = ?";
        
        try{
            patient = jbdct.queryForObject(sql, new BeanPropertyRowMapper<Patient>(Patient.class), email, password);
            return patient;
        }
        catch (Exception e) {
            return null;
        }
    }

    public int updateProfile(String name,String email,String phoneNo){
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "UPDATE patient SET patientName= ?, patientEmail= ?,patientPhoneNO= ? WHERE patientName= ?";
        int rowAffected = jbdct.update(sql,name,email,phoneNo,name);
        
        return rowAffected;
    }

    public static DataSource getDataSource() {
        DataSource dataSource = null;

        String url = "jdbc:mysql://localhost:3306/homs";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            dataSource = new DriverManagerDataSource(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    public static int getPatientID(Patient patient) {
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT patientID FROM patient WHERE patientEmail = ?";
        try {
            int patientID = jbdct.queryForObject(sql, Integer.class, patient.getPatientEmail());
            return patientID;
        } catch (Exception e) {
            return 0;
        }
    }

    public Patient getByname(String name){
        Patient patient = null;
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM `patient` WHERE `patientName` = ?";
        try{
            patient = jbdct.queryForObject(sql,new BeanPropertyRowMapper<Patient>(Patient.class),name);
            
            return patient;
        }
        catch (Exception e) {
            return null;
        }
        
    }
}