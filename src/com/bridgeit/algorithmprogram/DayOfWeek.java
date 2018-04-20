/*
 * Purpose:-takes a date as input and prints the day of the week that date falls on.
 *  Your program should take three command-line arguments: m (month), d (day), and y (year).
 *  
 * @Author:-Arpana kumari
 * version:-1.0
 * @Since:-20 April, 2018
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class DayOfWeek {
	public static void main(String[] args) {

		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);

		String weekName[] = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		int weekDay = Utility.calender(m, d, y);
		System.out.println("the day is=:" + " " + weekName[weekDay]);

	}
}
