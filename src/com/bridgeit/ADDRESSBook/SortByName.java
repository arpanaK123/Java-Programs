package com.bridgeit.ADDRESSBook;

import java.util.Comparator;


public class SortByName implements Comparator<Person> {
	public int compare(Person personFirst, Person personSecond) {
		return personFirst.getFierstName().compareTo(personSecond.getFierstName());
	}
}
