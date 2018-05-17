/*
 * Purpose:-Create the Function of Address book
 * 
 * @Author:-Arpana kumari
 * Version:1.0
 * @Since:-17 may,2018
 */
package com.bridgeit.ADDRESSBook;

import java.util.List;

public interface AddressBook {
	public List<Person> add();

	public void remove() throws Exception;

	public void sortByName();

	public void sortByZip();

	public void printAll();

	public void editPerson();

}
