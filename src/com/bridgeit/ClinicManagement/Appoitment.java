package com.bridgeit.ClinicManagement;

public class Appoitment {
	String doctorName;
	Patient patient;
	String date;
	String id;
	String appoitmnetTime;

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppoitmnetTime() {
		return appoitmnetTime;
	}

	public void setAppoitmnetTime(String appoitmnetTime) {
		this.appoitmnetTime = appoitmnetTime;
	}

	public String toString()

	{
		return "\n Doctor Name: " + doctorName + "\n Patient: " + patient + "\n Date: " + date + "\nID: " + id
				+ "\nappoitmnetTime: " + appoitmnetTime;

	}
}
