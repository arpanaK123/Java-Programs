package com.bridgeit.AddressBook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgeit.utility.Utility;

public class AddressBookImplement implements AddressBook {
	public static List<Person> list = new ArrayList<Person>();
	ObjectMapper objectMapper = new ObjectMapper();
	public List<Person> add() {
		list.add(addUser());
		for (Person p : list) {
			System.out.println(p.toString());
		}
		return list;
	}

	static int count = 0;

	public void editPerson() {
		System.out.println("\tEnter First Name");
		String firstName = Utility.inputString();
		for (Person P : list)

		{
			if (firstName.equals(P.getFirstName())) {
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
					editPhoneNumber(P, 2);
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

	public void remove() {
		System.out.println("enter the First Name, Whose data you wants to removed ");
		String firstname = Utility.inputString();
		int count = 0;
		List<Person> toRemove = new ArrayList<>();
		for (Person P : list) {
			if (firstname.equals(P.getFirstName())) {
				System.out.println("\n\t Data Found\n\t");
				toRemove.add(P);
				count++;
			}
		}
		list.removeAll(toRemove);
		if (count == 0) {
			System.out.println("Sorry...no data found");
		}
	}

	public void sortByName() {
		Collections.sort(list, new SortByName());
		for (Person person : list) {
			System.out.println(person.toString());
		}

	}

	public void sortByZip() {
		Collections.sort(list, new SortByZip());
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

	public void printAll() {
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

	public static Person addUser() {
		Person person = new Person();
		Address address = new Address();
		System.out.println("\tenter the First name");
		String firstName = Utility.inputString();
		person.setFirstName(firstName);
		System.out.println("\tEnter last name");
		String lastName = Utility.inputString();
		person.setLastName(lastName);
		System.out.println("\tEnter Address");
		String adress = Utility.inputString();
		person.setAddress(address);
		System.out.println("\tEnter mobile number");
		String mob = Utility.inputString();
		person.setMobileNumber(mob);
		System.out.println("\tEnter city");
		String city = Utility.inputString();
		address.setCity(city);
		System.out.println("\tEnter State");
		String state = Utility.inputString();
		address.setState(state);
		System.out.println("\tEnter ZIP");
		String zip = Utility.inputString();
		address.setZip(zip);
		System.out.println("\tEnter Phone Number");
		String mobnum = Utility.inputString();
		address.setPhoneNumber(mobnum);
		return person;
	}

	public static void editAddress(Person p, int i) {
		Address adres = new Address();

		System.out.println("\tEnter new State");
		String state = Utility.inputString();
		adres.setState(state);
		System.out.println("\tEnter new City");
		String city = Utility.inputString();
		adres.setCity(state);
		System.out.println("\tEnter new zip code");
		String zip = Utility.inputString();
		adres.setZip(zip);

	}

	public static void editPhoneNumber(Person p, int i) {
		Address adres = new Address();
		System.out.println("\tEnter new phone number");
		String mob = Utility.inputString();
		adres.setPhoneNumber(mob); 
	}
	
	
	public void save(String file)
	{
		try
		{
			objectMapper.writeValue(new File("address/"+file+".json"), list);
			System.out.println("\n\tData saved");
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
