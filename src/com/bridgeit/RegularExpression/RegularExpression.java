package com.bridgeit.RegularExpression;

import com.bridgeit.utility.Utility;

public class RegularExpression {

	public static void main(String[] args) {
		String sentence = "Hello <<name>>, We have your full name as <<full name>> in our system";
		String newSentence = Utility.replaceFullName(sentence);
		System.out.println(newSentence);

		String sentence2 = "Your contact number is 91-xxxxxxxxxx";
		String newSentence2 = Utility.mobileNumber(sentence2);
		System.out.println(newSentence2);

		String sentence3 = "Please,let us know in case of any clarification. Thank you BridgeLabz 10/05/2018.";
		String newSentence3 = Utility.dateChange(sentence3);
		System.out.println(newSentence3);

		System.out.println("now thw final sentence is:");
		System.out.println(newSentence + " " + newSentence2 + " " + newSentence3);
	}
}
