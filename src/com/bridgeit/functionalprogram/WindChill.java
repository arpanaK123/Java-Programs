/*
 *Purpose:=Write a program WindChill.java that takes two double command-line arguments t and v and
 *  prints the wind chill. Use Math.pow(a, b) to compute ab. 
 *  
 *  @Author:-Arpana kumari
 * 
 * Version:-1.0
 * @Since:-17 April, 2018
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		int wind = 0;
		int temp = 0;
		double t = 0, v = 0;
		while (temp == 0) {
			System.out.println("enter temperature greater than 50");
			t = Utility.inputInteger();
			if (t > 50) {
				temp++;
			}
		}
		while (wind == 0) {
			System.out.println("enter the speed of wind, where 3<v<120");
			v = Utility.inputInteger();

			if (v > 3 && v < 120)
				wind++;
		}

		double windchill = Utility.chillWind(t, v);

	}
}
