package com.bridgeit.AddressBook;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeit.utility.Utility;

public class MainClassOfAddressBook {
	public static void main(String[] args) throws Exception {
		System.out.println("\t\t\tADDRESS  BOOK");
		System.out.println("\t\t\t~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\t1. create  new Addreess Book    ");
		System.out.println("\t2. Open Address Book            ");
		System.out.println("\t3. Save Address Book            ");
		System.out.println("\t4. Save As                      ");
		System.out.println("\t5. Close                        ");
		System.out.println("\t6. exit                         ");
		System.out.println("\t   Enter your choice               ");
		System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		CreateAdressBookImplement createObject=new CreateAdressBookImplement();

		int choice = Utility.inputInteger();
		
		switch(choice) {
		
		case 1: {
			createObject.create();
			break;
		}
		}
		// JSONObject obj1 = new JSONObject();
		// JSONArray list = new JSONArray();
		// list.add(obj1);
		AddressBookImplement address = new AddressBookImplement();
		// switch (choice) {
		// case 1: {
		// System.out.println("\twhat you want to do in your address book");
		// System.out.println(" 1. you want to add your address book");
		// System.out.println(" 2. you want to edit your address book");
		// System.out.println(" 3. you want to remove your address book");
		// System.out.println("*enter your chooice");
		// int choice1 = Utility.inputInteger();
		//
		// switch (choice1) {
		// case 1:
		// address.addUser();
		//
		// try (FileWriter file = new FileWriter("AddressBook.json")) {
		// file.write(obj1.toJSONString());
		// System.out.println("Successfully Copied JSON Object to File...");
		// System.out.println("\nJSON Object: " + obj1);
		// }
		// break;
		//
		// case 2:
		// address.editPerson();
		// break;
		//
		// case 3:
		// address.remove();
		// break;
		// default:
		// System.out.println("choose the correct option");
		// }
		//
		// System.out.println("1. To save");
		// System.out.println("enter your choice");
		// int choice2 = Utility.inputInteger();
		// switch (choice2) {
		// case 1:
		// // address.save(file);
		// break;
		// default:
		// System.out.println("choose correct option");
		// }

		System.out.println("what you want to d0 with your address book");
		System.out.println("1. Add");
		System.out.println("2. Edit");
		System.out.println("3. Remove");
		System.out.println("4. sort by name");
		System.out.println("5. sort by zip");
		System.out.println("enter your choice");
		int option3 = Utility.inputInteger();
		switch (option3) {
		case 1:
			address.add();
			break;
		case 2:
			address.editPerson();
			break;
		case 3:
			address.remove();
			break;
		case 4:
			address.sortByName();
			break;
		case 5:
			address.sortByZip();
			break;
		default:
			System.out.println("enter correct option");
		}

	}
}
