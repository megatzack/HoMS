package com.homs.demo.dbutil;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.homs.demo.model.Patient;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

@Repository
public class PatientDAO {

    public void register(Patient patient) {
        
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "insert into `Patient` (`userIC`, `phoneNO`) values (?,?)";
        Object args[] = { patient.getUserIC(), patient.getPhoneNO()};

    }

    public static Patient authenticate(String email, String password) {
        Patient Patient = null;
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM `Patient` WHERE `PatientEmail` = ? AND `PatientPassword` = ?";
        return Patient;
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

    public static Patient login(String userIC, String phoneNo) {
        return null;
    }
}