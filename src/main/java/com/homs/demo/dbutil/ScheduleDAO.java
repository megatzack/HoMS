package com.homs.demo.dbutil;



import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.homs.demo.model.Schedule;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Repository
public class ScheduleDAO {

    public int create(Schedule schedule){
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "INSERT INTO `schedule` (`name`, `ocInTime`, `ocOutTime`, `tcInTime`,`tcOutTime`,`notes`) VALUES (?,?,?,?,?,?)";
        Object args[] = {schedule.getName(),schedule.getOcInTime(),schedule.getOcOutTime(),schedule.getTcInTime(),schedule.getTcOutTime(),schedule.getNotes()};
        int rowAffected = jbdct.update(sql, args);

        return rowAffected;
    }

    public int delete(String name){
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "DELETE FROM `schedule` WHERE  `name` = ?";
        
        int rowAffected = jbdct.update(sql, name);

        return rowAffected;
    }


    public Schedule getByName(String name){
        Schedule schedule = null;
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM `schedule` WHERE `name` = ?";
        try{
            schedule = jbdct.queryForObject(sql, new BeanPropertyRowMapper<Schedule>(Schedule.class), name);
            return schedule;
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
