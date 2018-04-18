/*
 * Purpose:= Given N distinct Coupon Numbers, how many 
 * random numbers do you need to generate distinct coupon 
 * number? This program simulates this random process.
 * 
 * @Author:-Arpana kumari
 * version:-1.0
 * @Since:-17 April, 2018
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class Coupon {
	public static void main(String[] args) {
		System.out.println("enter N distinct coupon number want to generated");
		int size = Utility.inputInteger();
		int totalNumber = Utility.findCoupon(size);
		System.out.println("total random number=" + " " + totalNumber);

	}
}
