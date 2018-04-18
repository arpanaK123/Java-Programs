/*
 * Purpose:= Write a Stopwatch Program for measuring the time that
 *            elapses between the start and end clicks, Print the elapsed time.
 *
 * @Author:-Arpana kumari
 * 
 * Version:-1.0
 * @Since:-17 April, 2018
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class Stopwatch {

	private long startTime = 0;
	private long stopTime = 0;

	public static void main(String[] args) {
		System.out.println("press 1 for START");
		long start = Utility.inputInteger();
		start = System.currentTimeMillis();
		System.out.println("press 2 for STOP");
		long stop = Utility.inputInteger();
		stop = System.currentTimeMillis();

		System.out.println("elapsed time=" + (stop - start));
	}

}
