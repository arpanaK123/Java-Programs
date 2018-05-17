package com.bridgeit.InventoryManagement;

public class Inventory {
	private String name;
	private long pricePerKg;
	private long weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(long l) {
		this.pricePerKg = l;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public String toString() {
		return "\n\tName: " + name + "\n\tPrice Per Kg: " + pricePerKg + "\n\tWeight " + weight;
	}

}
