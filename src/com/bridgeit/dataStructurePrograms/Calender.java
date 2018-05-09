/*
 * Purpose:-Write a program Calendar.java that takes the month and year 
 *          as command-line arguments and prints the Calendar of the month.
 *          Store the Calendar in an 2D Array, 
 *          
 *@Author:-Arpana Kumari      
 *Version:1.0
 *@Since:-2 May, 2018    
 */
package com.bridgeit.dataStructurePrograms;

import com.bridgeit.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		System.out.println("enter the month between 1 to 12");
		int month = Utility.inputInteger();
		if (month < 1 || month > 12) {
			System.out.println("invalid month,enter month between 1 to 12");
			System.exit(0);
		}
		System.out.println("enter year");
		int year = Utility.inputInteger();
		
		Utility.calender1(month, year);

	}

}
