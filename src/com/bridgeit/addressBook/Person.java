package com.bridgeit.addressBook;

public class Person {
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;

	public Person() {

	}

	public Person(String firstname, String lastName, String city, String state, String zip, String phoneNumber) {
		this.firstName = firstname;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return "\t firstName " + getFirstName() + "\t lastName " + getLastName() + "\nphonenumber " + getPhoneNumber()
				+ "\nstate " + getCity() + "\n state " + getState() + "\nzip " + getZip();
	}

	public int compareTo(Object other) {
		return this.lastName.compareToIgnoreCase(((Person) other).lastName);
	}

}
