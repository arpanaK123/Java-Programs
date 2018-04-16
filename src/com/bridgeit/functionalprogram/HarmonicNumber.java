/*
 * Purpose:-Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 *          and Print the Nth Harmonic Value
 *          
 *@Author:-Arpana kumari
 *Version:-1.0
 *@Since:-14 April, 2018
 */
package com.bridgeit.functionalprogram;


import com.bridgeit.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {

		System.out.println("enter the number of Harmonic series");

		int number = Utility.inputInteger();

		Utility.harmonicSeries(number);
	}

}
