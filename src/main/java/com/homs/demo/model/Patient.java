package com.homs.demo.model;

public class Patient {
    private String patientIC;
    private String patientPhoneNo;
    private String patientName;
    private String patientEmail;
    private String patientPassword;

    //Private Queue queue;

    public String getPatientIC() {
        return patientIC;
    }

    public String getPatientPhoneNO() {
        return patientPhoneNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientIC(String patientIC) {
        this.patientIC = patientIC;
    }
    
    public void setPatientPhoneNO(String patientPhoneNo) {
        this.patientPhoneNo = patientPhoneNo;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

}