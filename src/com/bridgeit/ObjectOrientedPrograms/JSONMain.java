/*
 * Purpose:-Create a JSON file having Inventory Details for Rice, Pulses and Wheats with
 *          properties name, weight, price per kg. 
 *  
 *  @Author:-Arpana Kumari
 *  Version:1.0
 *  @Since:-11 May,2018
 */
package com.bridgeit.ObjectOrientedPrograms;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeit.utility.Utility;

public class JSONMain {

	public static void main(String[] args) throws IOException {

		JSONObject obj1 = new JSONObject();

		System.out.println("enter the rice name");
		String riceName = Utility.inputString();
		System.out.println("enter the per kg weight of rice");
		int riceWeight = Utility.inputInteger();
		System.out.println("enter the cost per kg of rice");
		int riceCost = Utility.inputInteger();

		System.out.println("enter the pulse name");
		String pulseName = Utility.inputString();
		System.out.println("enter the per kg weight of pulse");
		int pulseWeight = Utility.inputInteger();
		System.out.println("enter the cost per kg of pulse");
		int pulseCost = Utility.inputInteger();

		System.out.println("enter the wheats name");
		String wheatName = Utility.inputString();
		System.out.println("enter the per kg weight of wheat");
		int wheatweight = Utility.inputInteger();
		System.out.println("enter the cost per kg of wheat");
		int wheatCost = Utility.inputInteger();

		obj1.put("name", riceName);
		obj1.put("weight", riceWeight);
		obj1.put("cost", riceCost);
		JSONObject obj2 = new JSONObject();

		obj2.put("name", pulseName);
		obj2.put("weight", pulseWeight);
		obj2.put("cost", pulseCost);
		JSONObject obj3 = new JSONObject();

		obj3.put("name", wheatName);
		obj3.put("weight", wheatweight);
		obj3.put("cost", wheatCost);

		// JSONArray list = new JSONArray();
		// list.add(obj);

		try (FileWriter file = new FileWriter("FILE1.json")) {
			file.write(obj1.toJSONString());
			file.write(obj2.toJSONString());
			file.write(obj3.toJSONString());

			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj1);
			System.out.println("\nJSON Object: " + obj2);
			System.out.println("\nJSON Object: " + obj3);

		}
	}

}
