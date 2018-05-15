package com.bridgeit.ClinicManagement;

public class Appointment {
	private String doctorName;
	Patient patient;
	private String date;
	private String id;
	private int appointmnetTime;

	public Appointment() {
	}

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

	public int getAppointmnetTime() {
		return appointmnetTime;
	}

	public void setAppointmnetTime(int appointmnetTime) {
		this.appointmnetTime = appointmnetTime;
	}

	public String toString()

	{
		return "\n Doctor Name: " + doctorName + "\n Patient: " + patient + "\n Date: " + date + "\nID: " + id
				+ "\nappointmnetTime: " + appointmnetTime;

	}

}
