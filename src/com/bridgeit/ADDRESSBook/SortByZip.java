package com.bridgeit.ADDRESSBook;

import java.util.Comparator;


public class SortByZip implements Comparator<Person> {
	public int compare(Person personFirst, Person personSecond) {
		return personFirst.address.getZip().compareTo(personSecond.address.getZip());

	}

}
