package com.homs.demo.dbutil;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.homs.demo.model.Staff;
import javax.sql.DataSource;

@Repository
public class StaffDAO {

    public int create(Staff staff) {
        
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "insert into `Staff` (`staffName`, `staffEmail`, `staffPassword`, `staffDepartment`) values (?,?,?,?)";
        Object args[] = { staff.getStaffName(), staff.getStaffEmail(), staff.getStaffPassword(), staff.getStaffDepartment()};
        int rowAffected = jbdct.update(sql, args);
        return rowAffected;
    }

    public static Staff authenticate(String email, String password) {
        Staff staff = null;
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM `staff` WHERE `staffEmail` = ? AND `staffPassword` = ?";
        try{
            staff = jbdct.queryForObject(sql, new BeanPropertyRowMapper<Staff>(Staff.class), email, password);
            return staff;
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