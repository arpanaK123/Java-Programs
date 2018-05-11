package testJason;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class TestMain {

	public static void main(String[] args) throws IOException {

		
JSONObject obg=new JSONObject();
obg.put("name", "arpana");
obg.put("id", "123@");
obg.put("mob number", "543563897");

try (FileWriter file = new FileWriter("/home/bridgeit/json")) {
	file.write(obg.toJSONString());
	System.out.println("Successfully Copied JSON Object to File...");
	System.out.println("\nJSON Object: " + obg);
}
	}
}
