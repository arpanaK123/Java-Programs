/*
 * Purpose:-Create a JSON file having Inventory Details for Rice, Pulses and Wheats 
 *           with properties name, weight, price per kg. 
 *           
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-23 May, 2018           
 */
package com.bridgeit.json;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json {
	public static void main(String[] args) {
		String name;
		long weight;
		long price;

		JSONParser parser = new JSONParser();
		try {
			// JSONArray jsonarray = (JSONArray) parser.parse(new FileReader("Json.json"));
			Object object = parser.parse(new FileReader("Json.json"));
			JSONObject jsonObject = (JSONObject) object;

			JSONArray jsonArray = (JSONArray) jsonObject.get("Inventory");
			for (Object obj : jsonArray) {
				JSONObject jsonobject = (JSONObject) obj;
				name = (String) jsonobject.get("Name");
				weight = (long) jsonobject.get("Weight");
				price = (long) jsonobject.get("Price/kg");
				System.out.println(name);
				System.out.println(weight);
				System.out.print(price);
				System.out.println();
				long totalPrice = price * weight;
				System.out.println("total Price:" + totalPrice);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
