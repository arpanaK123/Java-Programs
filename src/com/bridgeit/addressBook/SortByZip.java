package com.bridgeit.addressBook;

import java.util.Comparator;

import com.bridgeit.AddressBook.Person;

public class SortByZip implements Comparator<Person>{
	public int compare(Person personFirst, Person personSecond) {

		return personFirst.getZip().compareTo(personSecond.getZip());

	}
}
