/*
 * Purpose:-A library for reading in 2D arrays of integers, doubles,
 *  or booleans from standard input and printing them out to standard output.
 *  
 *  @Author:-Arpana kumari
 *  Version:-1.0
 *  @Since:-14 April,2018
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class TwoDarray {

	public static void main(String[] args) {
		
		System.out.println("press 1 for integer Array");
		System.out.println("press 2 for double Array");
		System.out.println("press 3 for boolean array");

		System.out.println("enter your choice");
		int choice = Utility.inputInteger();
		
		System.out.println("Enter the number of Rows");
		int rows = Utility.inputInteger();
		System.out.println("Enter the number of column");
		int columns = Utility.inputInteger();
		switch (choice) {
		case 1: {
			int array[][] = new int[rows][columns];
			Utility.integerArray(rows, columns, array);
			break;
		}
		case 2: {
			double array[][] = new double[rows][columns];
			Utility.doubleArray(rows, columns, array);
			break;
		}
		case 3: {
			boolean array[][] = new boolean[rows][columns];
			Utility.booleanArray(rows, columns, array);
			break;
		}
		default:
			System.out.println("enter correct choice");
			break;
		}
	}
}