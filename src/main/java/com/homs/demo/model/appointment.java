package com.homs.demo.model;

public class appointment {
    String date;
    String medicalSpeciality;
    String treatmentInquiry;

    public appointment(String date, String medicalSpeciality, String treatmentInquiry){
        this.date = date;
        this.medicalSpeciality = medicalSpeciality;
        this.treatmentInquiry = treatmentInquiry;
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
