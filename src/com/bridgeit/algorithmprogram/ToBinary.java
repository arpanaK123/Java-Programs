/*
 * Purpose:-Write a static function toBinary that outputs the binary (base 2) representation
 *           of the decimal number typed as the input,the same as saying that 
 *           106 = 64 + 32 + 8 + 2.  Ensure necessary padding to represent 4 Byte String.
 *
 *@Author:-Arpana kumari
 *version:-1.0
 *@since:-20 April, 2018
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class ToBinary {

	public static void main(String[] args) {

		System.out.println("enter number ");
		int number = Utility.inputInteger();
		Utility.toBinary(number);
	}

}
