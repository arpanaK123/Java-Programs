/*
 * Purpose:-Create the Adddress Book Management Class
 * 
 * @Author:-Arpana Kumari
 * Version:1.0
 * @Since:17 May, 2018
 */
package com.bridgeit.ADDRESSBook;

import java.io.IOException;

import com.bridgeit.utility.Utility;

public class MainClassAddressBook {

	public static void main(String[] args) throws IOException {
		System.out.println("\t   Welcome to Address Book");
		System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		AddressBookManageImplement manageImplement = new AddressBookManageImplement();
		AddressBookImplement addressBookImplement = new AddressBookImplement();

		String addressBook = "";
		int i = 0;
		while (i == 0) {
			System.out.println("\t 1. Create Your New Address BOok");
			System.out.println("\t 2. Open existing Address Book");
			System.out.println("\t 3. Save Your Address Book");
			System.out.println("\t 4. Save As Your Address Book");
			System.out.println("\t 5. Close Your Address Book");
			System.out.println();
			System.out.println("\t User Enter Your Choice");
			int choice = Utility.inputInteger();
			switch (choice) {
			case 1:
				manageImplement.create();
				manageImplement.close(addressBook);
				break;
			case 2:
				addressBookImplement.close(addressBook);
				
				manageImplement.readAddress();
				System.out.println("User Enter the name of Your Address Book");
				addressBook = Utility.inputString();

				if (manageImplement.checkAddressBook(addressBook)) {
					int j = 0;
					manageImplement.read(addressBook);
					while (j == 0) {
						
						System.out.println();
						System.out.println("\t1. Add Your Address Book ");
						System.out.println("\t2. Edit Your Address Book");
						System.out.println("\t3. Remove Your Address Book");
						System.out.println("\t4. Sort By Name");
						System.out.println("\t5. Sort By zip Code");
						System.out.println("\t6. Display Your Address Book");
						System.out.println("\t7. Exit Your Address Book");
						System.out.println("\t User Enter Your Choice");
						int choice1 = Utility.inputInteger();
						switch (choice1) {
						case 1:
							addressBookImplement.add();
							break;
						case 2:
							addressBookImplement.editPerson();
							break;
						case 3:
							addressBookImplement.remove();
							break;
						case 4:
							addressBookImplement.sortByName();
							break;
						case 5:
							addressBookImplement.sortByZip();
							break;
						case 6:
							addressBookImplement.printAll();
							break;
						case 7:
							System.out.println("Traverse to Address Book");
							j = 1;
							break;
						default:
							System.out.println(
									"You enter wrong data " + "\n\t Address Book Name " + addressBook + " closed\n");
							addressBookImplement.close(addressBook);
							j = 1;
							break;
						}
					}
				} else {
					System.out.println("File Name does not exit");
					break;
				}
			case 3:
				manageImplement.save(addressBook);
				break;
			case 4:
				manageImplement.saveAs();
				break;
			case 5:
				System.out.println("close Your Address Book");
				i = 1;
				break;
			default:
				System.out.println("Something Wrong...Address Book closed");
				i = 1;
				break;

			}
		}
	}
}
