package com.bridgeit.addressBook;

import java.util.Comparator;

import com.bridgeit.AddressBook.Person;

public class SortByLastName implements Comparator<Person> {
	public int compare(Person personFirst, Person personSecond) {

		return personFirst.getFirstName().compareTo(personSecond.getFirstName());

	}

}
