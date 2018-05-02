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
		if (year < 1800) {
			System.out.println("invalid year, enter year 1800 and beyond");
			System.exit(0);
		}
		Utility.calender(month, year);
		// String[] months = { " ", "January", "February", "March", "April", "May",
		// "June", "July", "August", "September",
		// "October", "November", "December" };
		//
		// int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//
		// // check for leap year
		// if (month == 2 && Utility.leapYear(year))
		// days[month] = 29;
		//
		// // print calendar header
		// System.out.println(" " + months[month] + " " + year);
		// System.out.println(" S M Tu W Th F S");
		//
		// // starting day
		// int d = Utility.day(month, 1, year);
		//
		// // print the calendar
		// for (int i = 0; i < d; i++)
		// System.out.print(" ");
		// for (int i = 1; i <= days[month]; i++) {
		// System.out.printf("%2d ", i);
		// if (((i + d) % 7 == 0) || (i == days[month]))
		// System.out.println();
		// }

	}

}
