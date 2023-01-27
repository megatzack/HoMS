package com.homs.demo.dbutil;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.homs.demo.model.Patient;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


import javax.sql.DataSource;

@Repository
public class PatientDAO {
    private Patient patient;

    public int register(Patient patient) {
        
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "insert into `Patient` (`patientName`,`patientEmail`,`patientPassword`,`patientIC`, `patientPhoneNO`) values (?,?,?,?,?)";
        Object args[] = {patient.getName(), patient.getPatientEmail(), patient.getPatientPassword() ,patient.getUserIC(), patient.getPhoneNO()};

        int rowAffected = jbdct.update(sql, args);
        return rowAffected;
    }

    public Patient authenticate(String email, String password) {
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM patient WHERE patientEmail = ? AND patientPassword = ?";
        Object args[] = {email, password};
        try{
            patient = jbdct.queryForObject(sql, new BeanPropertyRowMapper<Patient>(Patient.class), email, password);
            System.out.println("Patient is " + patient.getName());
            return patient;
        }
        catch (Exception e) {
            return null;
        }
    }

    public static DataSource getDataSource() {
        DataSource dataSource = null;

        String url = "jdbc:mysql://localhost:3306/homs";
        String username = "root";
        String password = "HawbAndFj6";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            dataSource = new DriverManagerDataSource(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}