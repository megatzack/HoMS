package com.homs.demo.dbutil;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.homs.demo.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

@Repository
public class StaffDAO {
    JdbcTemplate jbdct = new JdbcTemplate(getDataSource());

    public int add(Staff staff) {
        String sql = "insert into `Staff` (`staffName`, `staffEmail`, `staffPassword`, `staffDepartment`) values (?,?,?,?)";
        Object args[] = { staff.getStaffName(), staff.getStaffEmail(), staff.getStaffPassword(), staff.getStaffDepartment()};
        int rowAffected = jbdct.update(sql, args);
        return rowAffected;
    }

    public DataSource getDataSource() {
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