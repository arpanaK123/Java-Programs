package com.bridgeit.AddressBook;

import java.util.List;

public interface  AddressBook {
	
public  List<Person>add();
public void remove();
public void sortByName();
public void sortByZip();
public void printAll();

}
