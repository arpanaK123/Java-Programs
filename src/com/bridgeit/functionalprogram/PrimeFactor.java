/*
 * Purpose:- Computes the prime factorization of N using brute force.
 *           Print the prime factors of number N.
 * 
 * @Author:-Arpana kumari
 * version:-1.0
 * @Since:-14 April, 2018
 */
package com.bridgeit.functionalprogram;


import com.bridgeit.utility.Utility;

public class PrimeFactor {

	public static void main(String[] args) {
		System.out.println("enter Number to find the Prime Factors");

		int number = Utility.inputInteger();

		Utility.primeFactor(number);

	}

}
