package com.homs.demo.model;

public class user {
    String name;
    String email;
    String password;
    String department;
    String role;

    public user(String name, String email, String password, String department, String role) {
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getDepartment() {
        return department;
    }
    public String getRole() {
        return role;
    }
}
