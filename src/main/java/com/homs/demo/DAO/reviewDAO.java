package com.homs.demo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.homs.demo.model.review;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

@Controller
public class reviewDAO {
    @Autowired
    private DataSource DataSource;

    public review submit(String name, String email, String review) {
        review cust_review = null;
        try {
            Connection connection = DataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO review (name, email, review) VALUES (?, ?, ?);");
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, review);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                cust_review = new review(rs.getString("name"), rs.getString("email"), rs.getString("review"));

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cust_review;
    }
}
