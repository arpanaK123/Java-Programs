package com.bridgeit.ClinicManagementPozo;

public class Appointment {
	private String date;
	Doctor doctor;
	Patient patient;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String toString() {
		return "Appointment:- " + doctor + "\n\tPatient: " + patient + "\n\tDate: " + date;
	}
}
