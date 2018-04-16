/*
 * Purpose:-Print the year is a Leap Year or not.
 * @Author:-Arpana kumari
 * 
 * Version:-1.0
 * @Since:-13 April, 2018
 */
package com.bridgeit.functionalprogram;


import com.bridgeit.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println("enter year & check leap year or not");

		
		int year = Utility.inputInteger();

		if(year/1000 > 0)
		{
			Utility.yearCheck(year);
		}
		else
		{
			System.out.println("Please enter a 4 digit number");
		}
	}

}
