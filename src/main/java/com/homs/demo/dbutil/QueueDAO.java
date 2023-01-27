package com.homs.demo.dbutil;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.homs.demo.model.Patient;
import com.homs.demo.model.Queue;

public class QueueDAO {
    public int enterVirtualQueue(Patient patient) {
        Queue queue = new Queue(patient, "next in line");
        
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "INSERT INTO `Queue` (`patientID`, `queueStatus`) VALUES (?,?)";
        Object args[] = { queue.getPatient(), queue.getQueueStatus()};
        int rowAffected = jbdct.update(sql, args);

        return rowAffected;
    }

    public Queue refresh(Patient patient) {
        Queue queue = null;
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM `Queue` WHERE `patientID` = ?";
        try{
            queue = jbdct.queryForObject(sql, new BeanPropertyRowMapper<Queue>(Queue.class), patient);
            return queue;
        }
        catch (Exception e) {
            return null;
        }
        
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
