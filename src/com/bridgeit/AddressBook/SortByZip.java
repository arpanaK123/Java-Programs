package com.bridgeit.AddressBook;

import java.util.Comparator;

public class SortByZip implements Comparator<Person> {

	public int compare(Person personFirst, Person personSecond) {

		// if (personFirst.address.getZip() == personSecond.address.getZip()) {
		// return 0;
		// } else {
		// if (personFirst.address.getZip() == personSecond.address.getZip()) {
		// return 1;
		// } else {
		// return -1;
		// }

		return personFirst.getZip().compareTo(personSecond.getZip());
	}

}
