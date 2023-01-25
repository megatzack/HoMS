package com.homs.demo.dbutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.homs.demo.model.Staff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;

@Repository
public class StaffDAO {
    @Autowired
    private DataSource dataSource;

    public void create(Staff staff) {
        
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `staff` (`staffName`, `staffEmail`, `staffPassword`, `staffDepartment`) VALUES (?,?,?,?)");
            preparedStatement.setString(1, staff.getStaffName());
            preparedStatement.setString(2, staff.getStaffEmail());
            preparedStatement.setString(3, staff.getStaffPassword());
            preparedStatement.setString(4, staff.getStaffDepartment());

            preparedStatement.executeQuery();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Staff authenticate(String email, String password) {
        Staff staff = null;
        String sql = "SELECT * FROM `staff` WHERE `staffEmail` = ? AND `staffPassword` = ?";
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            staff = (Staff) preparedStatement.executeQuery();

            return staff;
        }
        catch (Exception e) {
            return null;
        }
    }

}