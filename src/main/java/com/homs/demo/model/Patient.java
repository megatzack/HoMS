package com.homs.demo.model;

public class Patient {
    private String userIC;
    private String phoneNO;
    private String Name;

    //Private Queue queue;

    public String getUserIC() {
        return userIC;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public String getName() {
        return Name;
    }

    public void setUserIC(String userIC) {
        this.userIC = userIC;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    public void setName(String name) {
        Name = name;
    }

}
