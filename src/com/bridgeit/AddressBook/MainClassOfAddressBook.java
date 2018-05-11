package com.bridgeit.AddressBook;

import com.bridgeit.utility.Utility;

public class MainClassOfAddressBook {
	public static void main(String[] args) {
		System.out.println("\t\t\tADDRESS  BOOK");
		System.out.println("\t\t\t~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\t!\t1. create  new Addreess Book    !");
		System.out.println("\t!\t2. Open Address Book            !");
		System.out.println("\t!\t3. Save Address Book            !");
		System.out.println("\t!\t4. Save As                      !");
		System.out.println("\t!\t5. Close                        !");
		System.out.println("\t!\t6. exit                         !");
		System.out.println("\t!\tenter your choice               !");
		System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int choice = Utility.inputInteger();

	}
}
