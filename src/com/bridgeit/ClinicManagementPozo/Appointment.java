package com.bridgeit.ClinicManagementPozo;

public class Appointment {
	private String appointmentTime;
	private String appointmentDate;
	private Doctor doctor;
	private Patient patient;

	public String getAppintmentTime() {
		return appointmentTime;
	}

	public void setAppintmentTime(String appintmentTime) {
		this.appointmentTime = appintmentTime;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
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

	public String toString()

	{
		return "\n\tDoctor Name: " + doctor + "\n\tPatient Name: " + patient + "\n\tAppointment \n\tTime    :"
				+ appointmentTime + "\n\tAppointment \n\tDate   :" + appointmentDate;
	}
}
