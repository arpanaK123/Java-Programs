package com.bridgeit.AddressBook;

import java.util.Comparator;

public class SortByName implements Comparator<Person> {

	public int compare(Person personFirst, Person personSecond) {
		// if (personFirst.getFirstName().equals(personSecond.getFirstName()))
		//
		// return 0;
		//
		// else {
		// if (personFirst.getFirstName().compareTo(personSecond.getFirstName()) > 0) {
		// return 1;
		//
		// }
		//
		// else {
		// return -1;
		// }
		return personFirst.getFirstName().compareTo(personSecond.getFirstName());
	}
}
