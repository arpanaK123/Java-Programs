package com.bridgeit.ADDRESSBook;

public class Person {
	String fierstName;
	String lastName;
	Address address;
	String mobileNumber;

	public String getFierstName() {
		return fierstName;
	}

	public void setFierstName(String fierstName) {
		this.fierstName = fierstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String toString() {
		return "\n\t First Name: " + fierstName + "\n\t Last Name: " + lastName + "\n\t Address: " + address
				+ "\n\t Mobile Num: " + mobileNumber;
	}
}
