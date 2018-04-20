/*
 * Purpose:- There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which 
 *          can be returned by Vending Machine. Write a Program to calculate the minimum
 *          number of Notes as well as the Notes to be returned by the Vending Machine as a Change
 *  
 *  @Author:-Arpana kumari
 *  version:-1.0
 *  @Since:-20 April, 2018
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("enter the amount");
		int amount = Utility.inputInteger();

		Utility.amountChange(amount);

	}

}
