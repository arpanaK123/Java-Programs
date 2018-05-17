/*
 * Purpose:-Create Book of the Address for the Address Book Management System
 * 
 * @Author:-Arpana kumari
 * Version:-1.0
 * @Since:-17 May,2018
 */
package com.bridgeit.ADDRESSBook;

public class Address {
	private String city;
	private String state;
	private String zip;

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

	public String toString()

	{
		return "\n\t City: " + city + "\n\tState: " + state + "\n\t Zip: " + zip;
	}
}
