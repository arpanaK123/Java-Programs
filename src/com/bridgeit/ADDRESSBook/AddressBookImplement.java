
package com.bridgeit.ADDRESSBook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.utility.Utility;

public class AddressBookImplement implements AddressBook {
	public static List<Person> list = new ArrayList<Person>();
	ObjectMapper objectMapper = new ObjectMapper();
	static int count = 0;

	public List<Person> add() {
		list.add(addUser());
		for (Person p : list) {
			System.out.println(p.toString());
		}
		return list;
	}

	/**
	 * Function to Add the User Details
	 * 
	 * @return Person:Details of user
	 */
	public static Person addUser() {
		Person person = new Person();
		Address address = new Address();
		System.out.println("enter the First name");
		String firstName = Utility.inputString();
		person.setFierstName(firstName);
		System.out.println("Enter last name");
		String lastName = Utility.inputString();
		person.setLastName(lastName);

		System.out.println("Enter city");
		String city = Utility.inputString();
		address.setCity(city);
		System.out.println("Enter State");
		String state = Utility.inputString();
		address.setState(state);
		System.out.println("Enter ZIP");
		String zip = Utility.inputString();
		address.setZip(zip);
		System.out.println("Enter mobile number");
		String mob = Utility.inputString();
		person.setMobileNumber(mob);
		System.out.println();
		person.setAddress(address);
		return person;
	}

	/*
	 * Function to remove the Details of person from list
	 */
	public void remove() {
		System.out.println("enter the First Name, Whose data you wants to removed ");
		String firstname = Utility.inputString();
		int count = 0;
		List<Person> toRemove = new ArrayList<>();
		for (Person P : list) {
			if (firstname.equals(P.getFierstName())) {
				System.out.println("\n\t Data Found..... and Data Removed\n\t");
				toRemove.add(P);
				count++;
			}
		}
		list.removeAll(toRemove);
		if (count == 0) {
			System.out.println("Sorry...no data found");
		}
	}

	/*
	 * Function to sorting a list with respect to Name
	 */
	public void sortByName() {
		Collections.sort(list, new SortByName());
		for (Person person : list) {
			System.out.println(person.toString());
		}

	}

	/*
	 * Function to sorting a list with respect to Zip code
	 */
	public void sortByZip() {
		Collections.sort(list, new SortByZip());
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

	/*
	 * Function to Print the Details
	 */
	public void printAll() {
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

	/*
	 * Function to edit person with Address or with Phone Number
	 */
	public void editPerson() {
		System.out.println("\tEnter First Name");
		String firstName = Utility.inputString();
		for (Person P : list)

		{
			if (firstName.equals(P.getFierstName())) {
				count++;
				System.out.println("\n\tData Found\n");
				System.out.println("\t1. Edit Address" + "\t2. Edit Phone Number");
				System.out.println("enter your choice");
				int choice = Utility.inputInteger();
				switch (choice) {
				case 1:
					editAddress(P, 1);
					break;
				case 2:
					editAddress(P, 2);
					break;
				default:
					System.out.println("choose the correct option");
				}
			}
		}
		if (count == 0) {
			System.out.println("\tYour Data not Found");
		}
	}

	/**
	 * Function to edit the user Details with Address and phone number
	 * 
	 * @param p:Person
	 *            list
	 * @param i:
	 */
	public static void editAddress(Person p, int i) {

		switch (i) {

		case 1:

			System.out.println("\tEnter new State");
			String state = Utility.inputString();
			p.address.setState(state);
			System.out.println("\tEnter new City");
			String city = Utility.inputString();
			p.address.setCity(city);

			System.out.println("\tEnter new zip code");
			String zip = Utility.inputString();
			p.address.setZip(zip);

			System.out.println("your address book change with your new data");
			break;

		case 2:

			System.out.println("\tEnter new phone number");
			String mob = Utility.inputString();
			p.setMobileNumber(mob);
			System.out.println("your adddress book change with your new phone number");
			break;

		default:
			System.out.println("enter correct option");
		}

	}

	/**
	 * Function to save the User Details inside file
	 * 
	 * @param file
	 */
	public void save(String file) {
		try {
			objectMapper.writeValue(new File("AddressBook/" + file + ".json"), list);
			System.out.println(list);
			System.out.println("\n\tData saved");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Function to read the Details of person inside file
	 * 
	 * @param addressFile
	 */
	public void read(String addressFile) {
		ObjectMapper objectmapper = new ObjectMapper();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("AddressBook/" + addressFile + ".json"));
			String jsonRead;
			if ((jsonRead = bufferedReader.readLine()) != null) {
				TypeReference<ArrayList<Person>> typereference = new TypeReference<ArrayList<Person>>() {
				};
				list = objectmapper.readValue(jsonRead, typereference);
				bufferedReader.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Function to close the address book
	 * 
	 * @param adressBook
	 */
	public void close(String adressBook) {
		list.clear();
	}

	/*
	 * Function to save the User Details in another file
	 */
	public void saveAs() {
		System.out.println("enter the name of the new file");
		String newFileName = Utility.inputString();
		save(newFileName);
		System.out.println("Data saved in new file");
	}
}
