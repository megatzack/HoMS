package com.homs.demo.model;

public class review {
    String name;
    String email;
    String reviewContent;

    public review(String name, String email, String reviewContent){
        this.name = name;
        this.email = email;
        this.reviewContent = reviewContent;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getReviewContent() {
        return reviewContent;
    }
}