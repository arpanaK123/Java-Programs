package com.bridgeit.InventoryManagement;

import java.util.ArrayList;
import java.util.List;

import com.bridgeit.utility.Utility;

public class InventoryManagements {
	public static List<Inventory> inventoryList = new ArrayList<Inventory>();

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		InventoryMethodImplement methodImplement = new InventoryMethodImplement();
		inventoryList = methodImplement.readData("Inventory", inventoryList);
		long totalWeight = 0;
		long totalPrice = 0;

		int i = 0;
		while (i == 0) {
			System.out.println("\t\tINVENTORY MANAGEMENT SYSTEM");
			System.out.println(
					"\t1. Add Inventory \n\t2.Remove Inventory \n\t3.Calculate Total Weight \n\t4. Calculate Total Price \n\t5. Display Inventory\n\t6. Save Inventory \n\t7. Close Inventory");
			System.out.println("\t  User Enter your Choice");
			int choice = Utility.inputInteger();
			switch (choice) {
			case 1:
				inventory = methodImplement.addInventory();
				inventoryList.add(inventory);
				break;
			case 2:
				inventoryList = methodImplement.removeInventory(inventoryList);
				break;
			case 3:
				totalWeight = methodImplement.totalWeight(inventoryList);
				System.out.println("Total weight of All Product: " + totalWeight);
				break;
			case 4:
				totalPrice = methodImplement.totalPrice(inventoryList);
				System.out.println("Total Price of All Product: " + totalPrice);
				break;
			case 5:
				methodImplement.displayInventory(inventoryList);
				break;
			case 6:
				methodImplement.save(inventoryList, "Inventory");
				break;
			case 7:
				i = 1;
				System.out.println("Inventory Management System Closed");
				break;
			default:
				i = 1;
				System.out.println(" wrong choice....Inventory closed");
				break;

			}
		}
	}
}
