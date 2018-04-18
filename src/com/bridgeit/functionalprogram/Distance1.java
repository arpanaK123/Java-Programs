/*
 * Purpose:=Write a program Distance.java that takes two integer 
 * command-line arguments x and y and prints the Euclidean distance
 *  from the point (x, y) to the origin (0, 0). The formulae to calculate
 *   distance = sqrt(x*x + y*y). Use Math.power function
 *
 *@Author:-Arpana kumari
 * version:-1.0
 * @Since:-17 April, 2018
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class Distance1 {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		Utility.calculateDistance(x, y);
	}
}
