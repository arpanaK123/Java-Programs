package com.bridgeit.CommercialDataProcessing;

import java.util.List;

public interface StockAccount {

	public void buy(String name);

	public void sell(String name);

	public void savetofile(String fileName, String name);

	public void printReport();

	public long valueOf(List<Company> company);

}
