package com.homs.demo.model;

import java.sql.Timestamp;

public class Queue {
    private int queueID;
    private int patientID;
    private String queueStatus; // "next in line", "Currently served", "served"
    private Timestamp queueTime;
    

    public Queue(int queueID, int patientID, String queueStatus, Timestamp timestamp) {
        this.queueID = queueID;
        this.patientID = patientID;
        this.queueStatus = queueStatus;
        this.queueTime = timestamp;
    }

    public Queue(int patientID, String queueStatus, Timestamp timestamp) {
        this.patientID = patientID;
        this.queueStatus = queueStatus;
        this.queueTime = timestamp;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatient(int patientID) {
        this.patientID = patientID;
    }

    public String getQueueStatus() {
        return queueStatus;
    }

    public void setQueueStatus(String queueStatus) {
        this.queueStatus = queueStatus;
    }
    
    @Override
    public String toString() {
        return "Queue [patient=" + patientID + ", queueStatus=" + queueStatus + "]";
    }

    public Timestamp getQueueTime() {
        return queueTime;
    }

    public void Time(Timestamp queueTime) {
        this.queueTime = queueTime;
    }





}
