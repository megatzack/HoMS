package com.homs.demo.model;

public class Patient {

    private String userIC;
    private String phoneNO;
    private String Name;
    private String patientEmail;
    private String patientPassword;

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

    public String getPatientEmail() {
        return patientEmail;
    }

    public String getPatientPassword() {
        return patientPassword;
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

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

}
