package com.bridgeit.ClinicManagement;

public class Patient {
	private String name;
	private String id;
	private String mobileNumber;
	private int age;

	public Patient(String name, String id, String mobileNumber, int age) {
		this.name = name;
		this.id = id;
		this.mobileNumber = mobileNumber;
		this.age = age;

	}

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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString()

	{
		return "\n Name: " + getName() + "\n ID: " + getId() + "\n Mobile Number: " + getMobileNumber() + "\n Age: "
				+ getAge();
	}

}
