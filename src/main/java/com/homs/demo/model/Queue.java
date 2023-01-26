package com.homs.demo.model;

public class Queue {
    private Patient patient;
    private String queueStatus; // "next in line", "Currently served", "served"
    // private queueController next;
    // private queueController previous;

    public Queue(Patient patient, String queueStatus) {
        this.patient = patient;
        this.queueStatus = queueStatus;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getQueueStatus() {
        return queueStatus;
    }

    public void setQueueStatus(String queueStatus) {
        this.queueStatus = queueStatus;
    }
    
    @Override
    public String toString() {
        return "Queue [patient=" + patient + ", queueStatus=" + queueStatus + "]";
    }

    // public queueController getNext() {
    //     return next;
    // }

    // public void setNext(queueController next) {
    //     this.next = next;
    // }

    // public queueController getPrevious() {
    //     return previous;
    // }

    // public void setPrevious(queueController previous) {
    //     this.previous = previous;
    // }





}
