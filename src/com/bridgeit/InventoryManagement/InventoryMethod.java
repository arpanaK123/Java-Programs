package com.bridgeit.InventoryManagement;

import java.util.List;

public interface InventoryMethod {
	public Inventory addInventory();

	public long totalWeight(List<Inventory> inventoryList);

	public long totalPrice(List<Inventory> inventoryList);

	public void displayInventory(List<Inventory> inventoryList);

	public List<Inventory> removeInventory(List<Inventory> inventoryList);
}
