package com.bridgeit.CommercialDataProcessing;

import java.io.IOException;

import com.bridgeit.utility.Utility;

public class StockManager {
	public static void main(String[] args) throws IOException {

		StockAccountImplement stockImplement = new StockAccountImplement();

		System.out.println("\n\t\tWelcome to");
		System.out.println("\n\tCommercial Data Processing");

		System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println(
				"\n\t1. Create A New File \n\t2. Open exit File \n\t3. Save File \n\t4. Dispaly file \n\t5. Exit");
		System.out.println("\nUser Enter your Choice");
		int choice = Utility.inputInteger();
		int createloop = 0;
		while (createloop == 0) {
			switch (choice) {
			case 1:
				stockImplement.create();
				break;
			case 2:
				// stockImplement.read();
			}
		}

	}
}
