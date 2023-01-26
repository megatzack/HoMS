package com.homs.demo.model;

public class Ambulance {
    String name;
    String contact;
    String location;
    String status;
    String ambulancePlate;
    String department;

    public Ambulance(){

    }

    public Ambulance(String name, String contact, String location, String status, String ambulancePlate, String department){
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.status = status;
        this.ambulancePlate = ambulancePlate;
        this.department = department;
    }

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAmbulancePlate() {
		return ambulancePlate;
	}
	public void setAmbulancePlate(String ambulancePlate) {
		this.ambulancePlate = ambulancePlate;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}


    
}
