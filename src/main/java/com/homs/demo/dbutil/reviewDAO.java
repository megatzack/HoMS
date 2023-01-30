package com.homs.demo.dbutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.homs.demo.model.review;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

@Controller
public class reviewDAO {
    @Autowired
    private DataSource DataSource;

    public review submit(String name, String email, String review) {
        review cust_review = null;
        try {
            Connection connection = DataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO review (name, email, review) VALUES (?, ?, ?)");
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, review);

            int status = stmt.executeUpdate();
            if (status > 0) {
                System.out.println("Review submitted successfully");
            } else {
                System.out.println("Review submission failed");
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cust_review;
    }
}