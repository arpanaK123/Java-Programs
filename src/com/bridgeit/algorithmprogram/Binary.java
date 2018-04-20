/*
 * Purpose:-convert to Binary using toBinary function and perform the following functions.
           i. Swap nibbles and find the new number.
           ii. Find the resultant number is the number is a power of 2.
 *
 *@Author:-Arpana kumari
 *version:-1.0
 *@since;-20 April, 2018
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class Binary {

	public static void main(String[] args) {

		System.out.println("enter a number");
		int number=Utility.inputInteger();
		String str=Utility.toBinary(number);
		
		System.out.println("*************");
		String nibble=Utility.swapNibble(number);
		System.out.println("swap nibble="+" " +nibble);
	}

}
