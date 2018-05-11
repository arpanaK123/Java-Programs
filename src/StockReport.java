
/*
 * Purpose:-Write a program to read in Stock Names, Number of Share, Share Price. 
 * Print a Stock Report with total value of each Stock and the total value of Stock.
 * 
 * @Author:-Arpana Kumari
 * Version:-1.0
 * @Since:-11 May, 2018
 */
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgeit.utility.Utility;

public class StockReport {

	public static void main(String[] args) {
		String companyName;
		long numberOfShares;
		long sharePrice;
		long price;
		long TOTAL = 0;
		JSONParser parser = new JSONParser();
		System.out.println("               **********STOCK REPORT**********          ");
		System.out.println();
		System.out.println("Company Name" + "----------" + "Number of shares" + "-----------" + "Share Price");
		try {
			JSONArray jsonarray = (JSONArray) parser.parse(new FileReader("stock.json"));
			for (Object object : jsonarray) {
				JSONObject jsonObject = (JSONObject) object;
				companyName = (String) jsonObject.get("Company Name");
				System.out.print(companyName + "--------------------");
				numberOfShares = (long) jsonObject.get("Number Of Shares");
				System.out.print(numberOfShares + "-----------------------");
				sharePrice = (long) jsonObject.get("Share Price");
				System.out.println(sharePrice);

				price = numberOfShares * sharePrice;
				System.out.print("Price per share =: " + price);
				System.out.println();
				TOTAL = TOTAL + price;
				System.out.println();

			}
			System.out.println();
			System.out.println("TOTAL Share Price Of Company = " + TOTAL);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
