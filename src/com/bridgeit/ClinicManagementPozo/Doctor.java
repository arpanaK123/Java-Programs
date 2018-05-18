package com.bridgeit.ClinicManagementPozo;

public class Doctor {
	private String doctorName;;
	private int doctorId;
	private String doctorSpecialization;
	private String doctorAvailability;
	private int numberOfPatient;

	public int getNumberOfPatient() {
		return numberOfPatient;
	}

	public void setNumberOfPatient(int numberOfPatient) {
		this.numberOfPatient = numberOfPatient;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
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
