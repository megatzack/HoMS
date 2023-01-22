package com.homs.demo.model;

public class review {
    String name;
    String email;
    String review;

    public review(String name, String email, String review) {
        this.name = name;
        this.email = email;
        this.review = review;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getReview() {
        return review;
    }
}
