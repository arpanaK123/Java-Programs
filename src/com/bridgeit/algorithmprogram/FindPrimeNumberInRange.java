/*
 * Purpose:-Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
 *  
 *  @Author:-Arpana kumari
 *  Version:-1.0
 *  @Since:-14 April,2018
 */
package com.bridgeit.algorithmprogram;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class FindPrimeNumberInRange {

	public static void main(String[] args) {

		System.out.println("enter prime number range");

		int range = Utility.inputInteger();

		Utility.primeNumber(range);

	}

}
