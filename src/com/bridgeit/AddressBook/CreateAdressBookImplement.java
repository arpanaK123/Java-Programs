package com.bridgeit.AddressBook;

import java.io.File;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class CreateAdressBookImplement implements CreateAddressBook {
	public void create() throws Exception {
		System.out.println("enter the address book name");
		String addressBook = Utility.inputString();

		File file = new File("address//" + addressBook + ".json");
		if (file.createNewFile()) {
			System.out.println("File Created");
		} else {
			System.out.println("File not Created");
		}
	}

	AddressBookImplement implement=new AddressBookImplement();
	@Override
	public void save(String file) {
		implement.save(file);
		
	}

	@Override
	public void remove(String file) {

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveAs() {
		// TODO Auto-generated method stub
		
	}
}
