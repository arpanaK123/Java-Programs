package com.bridgeit.CommercialDataProcessing;

import java.io.IOException;
import java.util.Date;

import com.bridgeit.utility.Utility;

public class StockManager {
	public static void main(String[] args) throws IOException {

		StockAccountImplement stockImplement = new StockAccountImplement();

		Date date = new Date();
		System.out.println(date.toString());

		String file = "Company";
		stockImplement.read(file);
		stockImplement.read("Transaction");

		System.out.println("\n\t\tWelcome to");
		System.out.println("\n\tCommercial Data Processing");

		System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int choiceLoop = 0;
		while (choiceLoop == 0) {
			System.out.println(
					"\n\t1. Create A New Account \n\t2. Open existing Account \n\t3. Add and Remove Company \n\t4. Exit");
			System.out.println("\nUser Enter your Choice");
			int choice = Utility.inputInteger();
			switch (choice) {
			case 1:
				stockImplement.create();
				stockImplement.close();
				break;
			case 2:
				stockImplement.close();
				int loop = 0;
				System.out.println("\n Enter the Name of your Account");
				String name = Utility.inputString();
				stockImplement.read(name);
				while (loop == 0) {
					if (stockImplement.checkAddressBook(name)) {
						System.out.println(
								"\n\t1. Add Amount \n\t2. Buy Shares\n\t3. Sell Shares \n\t4. Save Account \n\t5. Print Report\n\t6. Exit");
						System.out.println("User Enter your Choice");
						int choice1 = Utility.inputInteger();
						switch (choice1) {
						case 1:
							stockImplement.addMoney();
							break;
						case 2:
							stockImplement.buy();
							break;
						case 3:
							stockImplement.sell();
							break;
						case 4:
							stockImplement.save(file, name);
							break;
						case 5:
							int dispalyLoop = 0;
							while (dispalyLoop == 0) {
								System.out.println(
										"\n\t1.Display Company\n\t2.Display Current Customer\n\t3.Display Transaction\n\t4.Exit");
								System.out.println("User Enter Your choice");
								int choiceDisplay = Utility.inputInteger();
								switch (choiceDisplay) {
								case 1:
									stockImplement.printReport();
									//stockImplement.printFunction();
									break;
								case 2:
									stockImplement.printCustomer();
									break;
								case 3:
									stockImplement.printTransaction();
									break;

								case 4:
									dispalyLoop = 1;
									System.out.println("\n Service close....");
									break;
								}
							}
							break;
						case 6:
							System.out.println("\nService closed");
							loop = 1;
							break;

						default:
							System.out.println("Something Wrong......");
							loop = 1;
						}
					} else {
						System.out.println("\nYour Account is not registered...Please create Account");
						loop = 1;
					}

				}
				break;
			case 3:
				stockImplement.addRemoveCompany();
				break;
			case 4:
				System.out.println("Service close");
				choiceLoop = 1;
			default:
				//System.out.println("\nSomething Wrong......");
				choiceLoop = 1;
				break;

			}
		}
	}

}
