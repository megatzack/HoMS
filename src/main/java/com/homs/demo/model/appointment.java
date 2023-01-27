package com.homs.demo.model;

public class appointment {
    String patientName;
    String email;
    String phoneNo;
    String date;
    String medicalSpeciality;
    String treatmentInquiry;

    public appointment(String patientName, String email, String phoneNo, String date, String medicalSpeciality, String treatmentInquiry){
        this.patientName = patientName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.date = date;
        this.medicalSpeciality = medicalSpeciality;
        this.treatmentInquiry = treatmentInquiry;
    }

    public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMedicalSpeciality() {
		return medicalSpeciality;
	}
	public void setMedicalSpeciality(String medicalSpeciality) {
		this.medicalSpeciality = medicalSpeciality;
	}
	public String getTreatmentInquiry() {
		return treatmentInquiry;
	}
	public void setTreatmentInquiry(String treatmentInquiry) {
		this.treatmentInquiry = treatmentInquiry;
	}

}
