package com.homs.demo.dbutil;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.homs.demo.model.appointment;

@Repository
public class appointmentDAO {

    public int insertBookingDetails(appointment a) {
        
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "insert into `appointment` (`date`,`medicalSpeciality`,`treatmentInquiry`) values (?,?,?)";
        Object appoint[] = {a.getDate(), a.getMedicalSpeciality(), a.getTreatmentInquiry()};

        int rowAffected = jbdct.update(sql, appoint);
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
    
}
