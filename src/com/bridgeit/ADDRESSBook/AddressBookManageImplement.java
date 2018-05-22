package com.bridgeit.ADDRESSBook;

import java.io.File;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class AddressBookManageImplement implements AddressBookManage {

	/*
	 * Function to Create the create Folder
	 */
	public void create() throws IOException {
		System.out.println("Enter name of address book");
		String addressBookName = Utility.inputString();
		File file = new File("AddressBook/" + addressBookName + ".json");
		if (file.createNewFile()) {
			System.out.println("File is created");

		} else {
			System.out.println("File Already Created");
		}
	}

	/*
	 * Function to save the file
	 */
	public void save(String file) {
		
		AddressBookImplement addressImplement = new AddressBookImplement();
		
		addressImplement.save(file);
	}

	/*
	 * Function to read the file
	 */
	public void read(String addressBook) {
		AddressBookImplement addressImplement = new AddressBookImplement();
		addressImplement.read(addressBook);

	}

	/**
	 * Function to read the file with Address
	 */
	public void readAddress() {
		File filename = new File("AddressBook");
		int count = 0;
		for (File file : filename.listFiles()) {
			if (file.isFile()) {
				System.out.println("File Name : " + file.getName());
				count++;
			}
		}
		System.out.println("Number of Files: " + count);
	}

	public boolean checkAddressBook(String addressBook) {
		File fileName = new File("AddressBook");
		//int count = 0;
		for (File file : fileName.listFiles()) {
			if (file.isFile()) {

				if (file.getName().equals(addressBook) + ".json" != null) {
					//count++;
					break;
				}
			}
		}
		//if (count == 1)
			return true;
	//	else
			//return false;
	}

	/*
	 * Function to close the Address book
	 */
	public void close(String addressBook) {
		AddressBookImplement addressImplement = new AddressBookImplement();
		addressImplement.close(addressBook);

	}

	/*
	 * Function to save the details in other file
	 */
	public void saveAs() {
		AddressBookImplement addressImplement = new AddressBookImplement();
		addressImplement.saveAs();
	}
}
