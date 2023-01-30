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
import com.homs.demo.model.Record;
import com.homs.demo.model.Queue;

@Repository
public class RecordDAO {
    public int enterRecord(Record record) {
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "INSERT INTO record (patientID, medicalHistory) VALUES (?,?)";
        Object args[] = { record.getPatientID(), record.getMedicalHistory()};
        int rowAffected = jbdct.update(sql, args);
        return rowAffected;
    }

    public List<Map<String, Object>> getAllRecord() {
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM record";
        try {
            List<Map<String, Object>> record = jbdct.queryForList(sql);
            return record;
        } catch (EmptyResultDataAccessException e) {
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