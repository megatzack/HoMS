package com.homs.demo.dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import com.homs.demo.model.Auth;

import javax.sql.DataSource;

public class loginDAO {
    @Autowired
    private DataSource DataSource;

    public Auth validate(String email, String password) {
        Auth auth = null;
        try {
            Connection connection = DataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM auth WHERE email = ? AND password = ?");
            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            if (rs.next())
                auth = new Auth(rs.getString("name"), rs.getString("email"), rs.getString("password"), rs.getString("role"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return auth;
    }
}