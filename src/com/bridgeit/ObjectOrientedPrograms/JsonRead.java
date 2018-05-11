package com.bridgeit.ObjectOrientedPrograms;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonRead {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();

		try {

			Object obj = parser.parse(new FileReader("jkson.txt"));

			JSONObject jsonObject = (JSONObject) obj;

			JSONArray details = (JSONArray) jsonObject.get("Details of Rice Pulse Wheat");

			System.out.println("\nDetail List of rice pulse and wheat:");
			Iterator<String> iterator = details.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
