package com.bridgeit.ClinicManagementPozo;

public class Doctor {
	private String doctorName;;
	private String doctorId;
	private String doctorSpecialization;
	private String doctorAvailability;

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}

	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}

	public String getDoctorAvailability() {
		return doctorAvailability;
	}

	public void setDoctorAvailability(String doctorAvailability) {
		this.doctorAvailability = doctorAvailability;
	}

	public String toString() {
		return "\n\tDoctor Name: " + doctorName + "\n\tDoctor Id: " + doctorId + "\n\tDoctor \n\tSpecialization: "
				+ doctorSpecialization + "\n\tDoctor \n\tAvailable: " + doctorAvailability;
	}
}
