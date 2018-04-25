package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class SwapNibble {

	public static void main(String[] args) {
		System.out.println("enter number ");
		int number = Utility.inputInteger();
		String s = Utility.toBinary(number);
		System.out.println(s);
		// System.out.println("number is="+s);
		System.out.println("swap nibble:");
	String str=	Utility.swapNibble(s);
	System.out.println(str);
		System.out.println(Utility.binaryToDecimal(str));

	}
}
