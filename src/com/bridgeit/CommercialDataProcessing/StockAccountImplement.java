package com.bridgeit.CommercialDataProcessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.utility.Utility;

public class StockAccountImplement implements StockAccount {

	ObjectMapper mapper = new ObjectMapper();

	public static List<Company> companyList = new ArrayList<>();
	public static List<Customer> customerList = new ArrayList<>();
	public static List<Transaction> transactionList = new ArrayList<>();

	long increaseDecreaseShare;
	long currentAmount;
	Date date = new Date();

	public void create() throws IOException {
		System.out.println("Enter the name of your Account");
		String name = Utility.inputString();
		File file = new File("CommercialData/" + name + ".json");
		if (file.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.out.println("File is already created");
		}
	}

	@Override
	public void buy() {
		System.out.println("Enter the customer name");
		String name = Utility.inputString();
		System.out.println("User Enter the Symbol");
		String symbol = Utility.inputString();
		System.out.println("User enter the Amount");
		long amount = Utility.inputLong();
		Transaction transaction = new Transaction();
		increaseDecreaseShare = 0;

		int equalSymbol = 0;
		int smallAmount = 0;

		for (Company company : companyList) {
			if (company.getCompanySymbol().equals(symbol)) {
				if (amount >= company.getCompanyPricePerShare()) {
					smallAmount++;
					if (!customerList.isEmpty()) {
						for (Customer customerLoop : customerList) {
							currentAmount = customerLoop.getCustomerAmount();

							if (customerLoop.getCustomerSymbol().equals(symbol)) {
								equalSymbol++;
								smallAmount++;

								customerLoop.setCustomerName(name);
								customerLoop.setCustomerAmount(customerLoop.getCustomerAmount() - amount);
								customerLoop.setCustomerShare(
										customerLoop.getCustomerShare() + (amount / company.getCompanyPricePerShare()));
							}
						}
					}
					if (equalSymbol == 0) {
						smallAmount++;
						Customer customer = new Customer();
						customer.setCustomerAmount(currentAmount - amount);
						customer.setCustomerSymbol(symbol);
						customer.setCustomerShare(amount / company.getCompanyPricePerShare());
						customerList.add(customer);

					}
					LinkedQueue<String> linkedQueue = new LinkedQueue<String>();
					increaseDecreaseShare = amount / company.getCompanyPricePerShare();
					company.setCompanySharesAvailable(company.getCompanySharesAvailable() - increaseDecreaseShare);

					linkedQueue.add(date.toString());
					System.out.println("Transaction Started");
					transaction.setBuySell("Buy");
					transaction.setSymbol(symbol);
					transaction.setDate(date.toString());
					transactionList.add(transaction);
					linkedQueue.remove();
					System.out.println("Transaction Stop");
				}
			}
		}

		if (smallAmount == 0) {
			System.out.println("Your Balance is low....Please add Money");
		}
	}

	@Override
	public void sell() {
		Customer customer1 = new Customer();
		System.out.println("enter the customer name");
		String customerName=Utility.inputString();
		customer1.setCustomerName(Utility.inputString());
		System.out.println("User enter the Symbol");
		String symbol = Utility.inputString();
		System.out.println("User Enter the Amount");
		long amount = Utility.inputLong();
		increaseDecreaseShare = 0;

		Transaction transaction = new Transaction();
		for (Customer customer : customerList) {
			if (customer.getCustomerSymbol().equals(symbol)) {
				if (customer.getCustomerAmount() >= amount) {
					for (Company company : companyList) {
						if (company.getCompanySymbol().equals(symbol)) {
							company.setCompanySharesAvailable(
									company.getCompanySharesAvailable() + (amount / company.getCompanyPricePerShare()));
							customer.setCustomerAmount(customer.getCustomerAmount() + amount);
							customer.setCustomerShare(
									customer.getCustomerShare() - (amount / company.getCompanyPricePerShare()));

							transaction.setCustomerName(customerName);
							LinkedQueue<String> linkedQueue = new LinkedQueue<String>();
							linkedQueue.add(date.toString());
							System.out.println("Transaction started");
							transaction.setCustomerName(customerName);
							transaction.setBuySell("Sell");
							transaction.setSymbol(symbol);
							transaction.setDate(date.toString());
							transactionList.add(transaction);
							linkedQueue.remove();
							System.out.println("transaction Stop");

						}
					}
				} else {
					System.out.println("entered amount is greater than your balance amount");
				}

			} else {
				System.out.println("Company Not Found");
			}
		}
	}

	@Override
	public long valueOf(List<Company> company) {

		return 0;
	}

	public void read(String file) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("CommercialData/" + file + ".json"));
			String arrayFile;
			if ((arrayFile = bufferedReader.readLine()) != null) {
				if (file.equals("Company")) {
					companyList = mapper.readValue(arrayFile, new TypeReference<ArrayList<Company>>() {
					});
				} else if (file.equals("Transaction")) {
					transactionList = mapper.readValue(arrayFile, new TypeReference<ArrayList<Transaction>>() {
					});
				} else {
					customerList = mapper.readValue(arrayFile, new TypeReference<ArrayList<Customer>>() {
					});

				}
				bufferedReader.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean checkAddressBook(String stockFile) {
		File fileName = new File("CommercialData");
		for (File file : fileName.listFiles()) {
			if (file.isFile()) {

				if (file.getName().equals(stockFile + ".json")) {

					return true;
				}
			}
		}

		return false;
	}

	public <T> void saveInFile(String file, List<T> T) {
		try {
			mapper.writeValue(new File("CommercialData/" + file + ".json"), T);
			System.out.println("\n\tData saved");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void save(String fileName, String name) {

		int i = 0;
		while (i == 0) {
			System.out.println("\n\t1. Save Company \n\t2. Save User \n\t3. Save Transaction \n\t4. Exit");
			System.out.println("\n User Enter your choice");
			int choice = Utility.inputInteger();
			{
				switch (choice) {
				case 1:

					saveInFile(fileName, companyList);
					break;
				case 2:

					saveInFile(name, customerList);
					break;
				case 3:
					saveInFile("Transaction", transactionList);
					break;
				case 4:
					i = 1;
					System.out.println("save service close");
				default:
					// System.out.println("Something Wrong.....");
				}
			}
		}
	}

	@Override
	public void printReport() {

		for (Company company : companyList) {
			System.out.println(company.toString());
			break;
		}
	}

	public void printCustomer()

	{
		for (Customer customer : customerList) {
			System.out.println(customer.toString());
		}
		long amount = 0;
		for (Customer customer1 : customerList) {
			amount = amount + customer1.getCustomerAmount();
		}
		System.out.println("\n\tBalance:-" + amount);

	}

	public void printTransaction()

	{
		LinkedStack<String> stack = new LinkedStack<String>();
		for (Transaction transaction : transactionList) {
			stack.add(transaction.toString());
		}
		stack.display();
	}

	public void addMoney()

	{
		System.out.println("User Enter the Amount");
		currentAmount = Utility.inputInteger();

	}

	public void addRemoveCompany() {
		LinkedList<Company> list = new LinkedList<Company>();

		for (Company company : companyList) {
			list.add(company);
		}
		list.display();

		int addLoop = 0;
		while (addLoop == 0) {
			System.out.println("\n\t1. Add Company \n\t2. Remove Company \n\t3. Save Company \n\t4. Exit");
			System.out.println("User Enter Your Choice");
			int choice = Utility.inputInteger();
			switch (choice)

			{
			case 1:
				Company company = new Company();
				System.out.println("\nEnter the company name");
				String name = Utility.inputString();
				company.setCompanySymbol(name);
				System.out.println("Enter the Share Available");
				long shares = Utility.inputLong();
				company.setCompanySharesAvailable(shares);
				System.out.println("Enter Price per share");
				long price = Utility.inputLong();
				company.setCompanyPricePerShare(price);
				list.add(company);
				companyList.add(company);
				System.out.println();
				list.display();
				break;

			case 2:
				System.out.println("Enter the company name to remove");
				String name1 = Utility.inputString();
				int i = 1;
				for (Company company1 : companyList) {
					System.out.println("\n" + i + " for " + company1.getCompanySymbol());
					i++;
				}
				System.out.println("Enter choice to remove Company");
				int choiceRemove = Utility.inputInteger();
				list.remove(choiceRemove);
				companyList.remove(choiceRemove - 1);
				list.display();
				break;
			case 3:
				saveInFile("Company", companyList);
				break;
			case 4:
				addLoop = 1;
				System.out.println("Add And remove service closed ");
			default:
				addLoop = 1;
				// System.out.println("Something Wrong......");
				break;
			}
		}
	}

	public void close() {
		customerList.clear();
	}

	public void printFunction() {
		System.out.println("\n\t1.Display company \n\t2.Display Customer \n\t3.Display Transaction \n\t4.Exit");
		System.out.println("\nUser Enter your Choice");
		int choice = Utility.inputInteger();

		int printLoop = 0;
		while (printLoop == 0) {
			switch (choice) {
			case 1:

				printReport();
				break;
			case 2:
				printCustomer();
				break;
			case 3:
				printTransaction();
				break;
			case 4:
				printLoop = 1;
				System.out.println("User Choose correct option");
				break;
			default:
				System.out.println("Service closed");
			}
		}
	}
}
