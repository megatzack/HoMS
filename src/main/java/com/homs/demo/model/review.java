package com.homs.demo.model;

public class review {
    String name;
    String email;
    String reviewContent;

    review(String name, String email, String reviewContent){
        this.name = name;
        this.email = email;
        this.reviewContent = reviewContent;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getReviewContent() {
        return reviewContent;
    }
}