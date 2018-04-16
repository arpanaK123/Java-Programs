/*
 * Purpose:-User Input and Replace String Template “Hello <<UserName>>, How are you?” 
 * Logic -> Replace <<UserName>> with the proper name
 * 
 * @Author:-Arpana kumari
 * 
 * Version:-1.0
 * @Since:-13 April, 2018
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class ReplaceString {

	public static void main(String[] args) {
		Utility utility = new Utility();

		String string = "hello <<user name>> how are you";

		System.out.println(string);
		System.out.println("enter new String");

		String input = utility.inputString();
		if (input.length() >= 3) {

			string = utility.replaceString(string, input);
		} else {
			System.out.println("please enter string more than three character length");
		}

	}

}
