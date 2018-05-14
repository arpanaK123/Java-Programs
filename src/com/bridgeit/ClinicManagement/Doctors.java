package com.bridgeit.ClinicManagement;

public class Doctors {
	private String name;
	private String id;
	private String specialization;
	private String availability;
	
	public String getName() {
		return name;
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
		return "\n Name: " + getName() + "\n ID: " + getId() + "\n Specialization: " + getSpecialization()
				+ "\n Availability: " + getAvailability();
	}
}
