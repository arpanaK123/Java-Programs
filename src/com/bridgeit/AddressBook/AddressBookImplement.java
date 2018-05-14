package com.bridgeit.AddressBook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

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
		System.out.println("enter the First name");
		String firstName = Utility.inputString();
		person.setFirstName(firstName);
		System.out.println("Enter last name");
		String lastName = Utility.inputString();
		person.setLastName(lastName);

		System.out.println("Enter mobile number");
		String mob = Utility.inputString();
		person.setPhonenumber(mob);
		 System.out.println("\tEnter Address");
		 String adres=Utility.inputString();
		// address.setAddress(address);
		System.out.println("Enter city");
		String city = Utility.inputString();
		person.setCity(city);
		System.out.println("Enter State");
		String state = Utility.inputString();
		person.setState(state);
		System.out.println("Enter ZIP");
		String zip = Utility.inputString();
		person.setZip(zip);

		return person;
	}

	public static void editAddress(Person p, int i) {
		Person person1 = new Person();

		switch (i) {
		
		case 1:

			System.out.println("\tEnter new State");
			String state = Utility.inputString();
			person1.setState(state);
			System.out.println("\tEnter new City");
			String city = Utility.inputString();
			person1.setCity(city);

			System.out.println("\tEnter new zip code");
			String zip = Utility.inputString();
			person1.setZip(zip);
			


			System.out.println("your address book change with your new data");
			break;

		case 2:
			
			System.out.println("\tEnter new phone number");
			String mob = Utility.inputString();
			person1.setPhonenumber(mob);
			System.out.println("your adddress book change with your new phone number");
			break;

		default:
			System.out.println("enter correct option");
		}

	}

	public void save(String file) {
		try {
			objectMapper.writeValue(new File("address/" + file + ".json"), list);
			System.out.println("\n\tData saved");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void read(String addressFile) {
		ObjectMapper objectmapper = new ObjectMapper();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("address/" + addressFile + ".json"));
		String jsonRead;
			if ((jsonRead = bufferedReader.readLine()) != null) {
TypeReference<ArrayList<Person>> typereference=new TypeReference<ArrayList<Person>>() {};
list=objectmapper.readValue(jsonRead,typereference);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close()

	{
		return;
	}

	public void saveAs() {
		Person person = new Person();

		System.out.println("enter your First name");
		String name = Utility.inputString();
		person.setFirstName(name);
		System.out.println("enter your last name");
		String lastname = Utility.inputString();
		person.setLastName(lastname);
		System.out.println("enter your mobile number");
		String number = Utility.inputString();
		person.setPhonenumber(number);
		System.out.println("your new data added to your address book");

	}
}
