package com.homs.demo.dbutil;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.homs.demo.model.Auth;

@Repository
public class loginDAO {
    JdbcTemplate jbdct = new JdbcTemplate(getDataSource());

    public DataSource getDataSource() {
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

    public Auth validate(Auth auth) {
        //String sql = "insert into `auth` (`email`, `password`) values (?,?)";
        PreparedStatement stmt = connection.prepareStatement("SELECT * FROM auth WHERE email = ? AND password = ?");
        Object args[] = { auth.getEmail(), auth.getPassword()};
        int rowAffected = jbdct.update(sql, args);
        return auth;
    }
}