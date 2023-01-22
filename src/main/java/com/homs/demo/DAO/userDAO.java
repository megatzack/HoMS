package com.homs.demo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import com.homs.demo.model.user;

import javax.sql.DataSource;

public class userDAO {
    @Autowired
    private DataSource DataSource;

    public user validate(String email, String password) {
        user user = null;
        try {
            Connection connection = DataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM auth WHERE email = ? AND password = ?");
            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user = new user(rs.getString("name"), rs.getString("email"), rs.getString("password"), rs.getString("department"), rs.getString("role"));

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
}
