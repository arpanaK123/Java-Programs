package com.bridgeit.InventoryManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.utility.Utility;

public class InventoryMethodImplement implements InventoryMethod {

	@Override
	public Inventory addInventory() {
		Inventory inventory = new Inventory();
		System.out.println("Enter the Product Name");
		inventory.setName(Utility.inputString());
		System.out.println("Enter the Price /kg");
		inventory.setPricePerKg(Utility.inputLong());
		System.out.println("Enter weight");
		inventory.setWeight(Utility.inputLong());

		return inventory;
	}

	@Override
	public long totalWeight(List<Inventory> inventoryList) {
		long totalWeight = 0;
		for (Inventory inventory : inventoryList) {
			totalWeight = totalWeight + inventory.getWeight();
		}
		System.out.println();
		return totalWeight;
	}

	@Override
	public long totalPrice(List<Inventory> inventoryList) {
		long totalPrice = 0;
		for (Inventory inventory : inventoryList) {
			
			totalPrice = totalPrice + (inventory.getPricePerKg()*inventory.getWeight());
		}
		System.out.println();
		return totalPrice;
	}

	@Override
	public void displayInventory(List<Inventory> inventoryList) {
		for (Inventory inventory : inventoryList) {
			System.out.println(inventory.toString());
		}

	}

	@Override
	public List<Inventory> removeInventory(List<Inventory> inventoryList) {
		System.out.println("Enter the name ,which you want to remove");
		String name = Utility.inputString();
		int count = 0;
		List<Inventory> list = new ArrayList<>();
		for (Inventory inventory : inventoryList) {
			if (name.equals(inventory.getName())) {
				list.add(inventory);
				count++;
				System.out.println("Data Removed");
			}
		}
		inventoryList.removeAll(list);
		if (count == 0) {
			System.out.println("Data Not Found");
		}

		return inventoryList;
	}

	public <T> void save(List<T> T, String file) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("Json/" + file + ".json"), T);
			System.out.println("Data Saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Inventory> readData(String file, List<Inventory> list) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Json/" + file + ".json"));
			String arrayInventoryFile;
			if ((arrayInventoryFile = reader.readLine()) != null)

			{
				TypeReference<ArrayList<Inventory>> type = new TypeReference<ArrayList<Inventory>>() {
				};
				list = mapper.readValue(arrayInventoryFile, type);
				reader.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
