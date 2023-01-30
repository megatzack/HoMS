package com.homs.demo.model;

public class Record {
    private int recordID;
    private int patientID;
    private String medicalHistory;

    public Record() {
    }

    public Record(int patientID, String medicalHistory) {
        this.patientID = patientID;
        this.medicalHistory = medicalHistory;
    }

    public int getRecordID() {
        return recordID;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    

}
