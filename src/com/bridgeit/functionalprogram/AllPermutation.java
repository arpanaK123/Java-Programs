/*
 * Purpose:=Write static functions to return all permutation of a String using iterative method and
 *  Recursion method. Check if the arrays returned by two string functions are equal. 
 *  
 *   @Author:-Arpana kumari
 * 
 * Version:-1.0
 * @Since:-17 April, 2018
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class AllPermutation {

	public static void main(String[] args) {
		System.out.println("enter the string");
		String string = Utility.inputString();
		int length = string.length();
		Utility.permute(string, 0, length - 1);

	}

}
