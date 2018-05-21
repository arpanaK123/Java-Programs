package com.bridgeit.CommercialDataProcessing;

import java.util.List;

public interface StockAccount {

	public void buy();

	public void sell();

	public void save(String fileName, String name);

	public void printReport();

	public long valueOf(List<Company> company);

}
