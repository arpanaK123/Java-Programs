/*
 * Purpose:-Write a Util Static Function to calculate monthlyPayment that reads in
 *   three command-line arguments P, Y, and R and calculates the monthly payments 
 *  
 *  @Author:-Arpana kumari
 *  Version:-1.0
 *  @Since:-20 April, 2018
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {

		double P = Integer.parseInt(args[0]);
		double Y = Integer.parseInt(args[1]);
		double R = Integer.parseInt(args[2]);
		double n = 12 * Y;
		double r = R / (2 * 100);

		double result = Utility.paymentMonthly(P, n, r);
		System.out.println("monthly payment is=:" + result);
	}

}
