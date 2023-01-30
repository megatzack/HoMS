package com.homs.demo.dbutil;


import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.homs.demo.model.Patient;
import com.homs.demo.model.Queue;

@Repository
public class QueueDAO {
    public int enterVirtualQueue(Queue queue) {
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "INSERT INTO queue (patientID, queueStatus, queueTime) VALUES (?,?,?)";
        Object args[] = { queue.getPatientID(), queue.getQueueStatus(), queue.getQueueTime()};
        int rowAffected = jbdct.update(sql, args);
        return rowAffected;
    }

    public Queue getQueueByPatient(Patient patient) {
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM queue WHERE patientID = ? LIMIT 1";
        try {
            Queue queue = jbdct.queryForObject(sql, new BeanPropertyRowMapper<Queue>(Queue.class), patient.getPatientID());
            return queue;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public int updateQueueStatus(Queue queue) {
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "UPDATE queue SET queueStatus = ? WHERE patientID = ?";
        Object args[] = { queue.getQueueStatus(), queue.getPatientID()};
        int rowAffected = jbdct.update(sql, args);

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

    public List<Map<String, Object>> getAllQueue() {
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM queue";
        try {
            List<Map<String, Object>> queue = jbdct.queryForList(sql);
            return queue;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }


}