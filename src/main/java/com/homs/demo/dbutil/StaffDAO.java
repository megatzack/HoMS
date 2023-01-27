package com.homs.demo.dbutil;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.homs.demo.model.Staff;

import javax.sql.DataSource;

@Repository
public class StaffDAO {
    private Staff staff;

    public int create(Staff staff) {
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "INSERT INTO staff (staffName, staffEmail, staffPassword, staffDepartment) VALUES (?,?,?,?)";
        Object args[] = { staff.getStaffName(), staff.getStaffEmail(), staff.getStaffPassword(), staff.getStaffDepartment()};
        int rowAffected = jbdct.update(sql, args);

        return rowAffected;
    }

    public Staff authenticate(String email, String password) {
        JdbcTemplate jbdct = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM staff WHERE staffEmail = ? AND staffPassword = ?";
        try{
            staff = jbdct.queryForObject(sql, new BeanPropertyRowMapper<Staff>(Staff.class), email, password);
            System.out.println(staff.getStaffName());
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