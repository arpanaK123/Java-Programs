/*
 * Purpose:- takes a command-line argument N, asks you to think of
 *  a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.
 *
 *@Author:-Arpana Kumari
 *version:-1.0
 *@since:-19 April, 2018S
 */
package com.bridgeit.algorithmprogram;

import java.util.ArrayList;
import java.util.List;

import com.bridgeit.utility.Utility;

public class FindYourNumber {

	public static void main(String[] args) {
		System.out.println("enter a number range");
		int range = Utility.inputInteger();
		int rangePower = (int) Utility.rangePower(range, 2);
		System.out.println("First U have to think a Number Between 0 and " + rangePower);
		int finalNUmber = Utility.findYourNumber(0, rangePower);
		System.out.println("your number is= " + finalNUmber);

	}

}
