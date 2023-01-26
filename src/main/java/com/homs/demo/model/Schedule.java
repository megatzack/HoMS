package com.homs.demo.model;

public class Schedule {
    String name;
    String ocInTime;
    String ocOutTime;
    String tcInTime;
    String tcOutTime;
    String notes;

    public Schedule(){

    }

    public Schedule(String name, String ocInTime, String ocOutTime,String tcInTime,String tcOutTime,String notes){
        this.name = name;
        this.ocInTime = ocInTime;
        this.ocOutTime = ocOutTime;
        this.tcInTime = tcInTime;
        this.tcOutTime = tcOutTime;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOcInTime() {
        return ocInTime;
    }
    public void setOcInTime(String ocInTime) {
        this.ocInTime = ocInTime;
    }
    public String getOcOutTime() {
        return ocOutTime;
    }
    public void setOcOutTime(String ocOutTime) {
        this.ocOutTime = ocOutTime;
    }
    public String getTcInTime() {
        return tcInTime;
    }
    public void setTcInTime(String tcInTime) {
        this.tcInTime = tcInTime;
    }
    public String getTcOutTime() {
        return tcOutTime;
    }
    public void setTcOutTime(String tcOutTime) {
        this.tcOutTime = tcOutTime;
    }

    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
