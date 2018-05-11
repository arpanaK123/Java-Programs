package com.bridgeit.ObjectOrientedPrograms;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import com.bridgeit.utility.Utility;

public class Json {

	public static void main(String[] args) throws IOException {
		JSONObject obj1 = new JSONObject();
		obj1.put("name", "rice");
		obj1.put("weight", "10kg");
		obj1.put("price", "55");

		JSONObject obj2 = new JSONObject();
		obj2.put("name", "pulse");
		obj2.put("weight", "10kg");
		obj2.put("price", "45");

		JSONObject obj3 = new JSONObject();
		obj3.put("name", "wheat");
		obj3.put("weight", "10kg");
		obj3.put("price", "55");

		try (FileWriter file = new FileWriter("jsonoutput.json")) {
			file.write(obj1.toJSONString());

			file.write(obj2.toJSONString());

			file.write(obj3.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj1);
			System.out.println(obj2);
			System.out.println(obj3);
		}

		// Utility.jsonDataManagement();
	}

}
