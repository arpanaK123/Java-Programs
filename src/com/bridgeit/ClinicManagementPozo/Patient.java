package com.bridgeit.ClinicManagementPozo;

public class Patient {
	private String patientName;
	private String patientId;
	private String patientMobNum;
	private int patientAge;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientMobNum() {
		return patientMobNum;
	}

	public void setPatientMobNum(String patientMobNum) {
		this.patientMobNum = patientMobNum;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String toString()

	{
		return "\n\t Patient Name: " + patientName + "\n\t Patient ID: " + patientId + "\n\t Patient MobNum: "
				+ patientMobNum + "\n\t Patient Age: " + patientAge;
	}
}
