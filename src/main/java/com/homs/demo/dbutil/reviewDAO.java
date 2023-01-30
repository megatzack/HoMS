package com.homs.demo.dbutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.homs.demo.model.review;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    public List<review> getReviewList() {
        List<review> reviewList = new ArrayList<review>();
        try {
            Connection connection = DataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM review");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                reviewList.add(new review(rs.getString("name"), rs.getString("email"), rs.getString("review")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reviewList;
    }
}