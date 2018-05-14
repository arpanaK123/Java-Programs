package com.bridgeit.AddressBook;

public class Person {
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String zip;
	private String phonenumber;

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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

	public String toString() {
		return "\nfirst  Name: " + firstName + "\n Last name: " + lastName + "\n City: " + city + "\nState: " + state
				+ "\nZip: " + zip + "\n Mob. Num.: " + phonenumber;
	}

}
