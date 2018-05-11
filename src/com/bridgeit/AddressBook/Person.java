package com.bridgeit.AddressBook;

public class Person {
	String firstName;
	String lastName;
	Address address;
	String mobileNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
		return ("firstname: " + getFirstName() + " " + "lastName: " + getLastName() + " " + "mobile number "
				+ getMobileNumber() + " " + "Address " + getAddress());
	}
}
