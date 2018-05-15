package com.bridgeit.ClinicManagement;

public class Doctors {
	String name;
	String id;
	String specialization;
	String availability;
	String date;

	int numOfAppointment;

	public int getNumberofPatient() {
		return numberofPatient;
	}

	public void setNumberofPatient(int numberofPatient) {
		this.numberofPatient = numberofPatient;
	}

	int numberofPatient;

	public int getNumOfAppointment() {
		return numOfAppointment;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String toString() {
		return "\nDoctor Name: " + getName() + "\nDoctor ID: " + getId() + "\nDoctor Specialization: "
				+ getSpecialization() + "\nDoctor Availability: " + getAvailability() + "\n Date: " + date
				+ "\nAppointment: " + numOfAppointment;
	}

	public void setNumOfAppointment(int i) {
		// TODO Auto-generated method stub

	}
}
