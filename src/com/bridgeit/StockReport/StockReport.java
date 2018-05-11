/*
 * Purpose:Write a program to read in Stock Names, Number of Share, Share Price. 
 *         Print a Stock Report with total value of each Stock and the total value of Stock.
 *         
 *@Author:-Arpana Kumari
 *Version:1.0
 *@Since:-11 May, 2018
 */
package com.bridgeit.StockReport;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockReport {

	public static void main(String[] args) {
		String companyName;
		long numberOfShares;
		long sharePrice;
		long price;
		long TOTAL = 0;

		System.out.println("***********************STOCK REPORT*************************");
		System.out.println();
		System.out.println("Company Name----------Number of Shares-----------Share Price");
		JSONParser parser = new JSONParser();

		try {
			JSONArray jsonarray = (JSONArray) parser.parse(new FileReader("stock.json"));
			for (Object obj : jsonarray) {
				JSONObject jsonobject = (JSONObject) obj;
				companyName = (String) jsonobject.get("Company Name");
				System.out.print(companyName + "--------------------");
				numberOfShares = (long) jsonobject.get("Number Of Shares");
				System.out.print(numberOfShares + "---------------------");
				sharePrice = (long) jsonobject.get("Share Price");
				System.out.print(sharePrice);
				System.out.println();
				price = numberOfShares * sharePrice;
				System.out.println("price per share :" + price);
				System.out.println();
				TOTAL = TOTAL + price;
			}
			System.out.println();
			System.out.println("TOTAL Share Price : " + TOTAL);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
