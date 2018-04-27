
/*
 * Purpose:-convert to Binary using toBinary function and perform the following functions.
 *         i. Swap nibbles and find the new number.
 *          ii. Find the resultant number is the number is a power of 2.
 *
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-23 April,2018
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class SwapNibble {

	public static void main(String[] args) {
		System.out.println("enter number ");
		int number = Utility.inputInteger();
		String s = Utility.toBinary(number);
		System.out.println(s);
		System.out.println("swap nibble:");
		String str = Utility.swapNibble(s);
		System.out.println(str);
		System.out.println(Utility.binaryToDecimal(str));

	}
}
