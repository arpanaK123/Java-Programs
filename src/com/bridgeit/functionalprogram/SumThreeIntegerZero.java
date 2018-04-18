/*
 * Purpose:=A program with cubic running time. Read in N integers and
 *  counts the   number of triples that sum to exactly 0.
 *  
 *  @Author:-Arpana kumari
 * 
 * Version:-1.0
 * @Since:-17 April, 2018
 */

package com.bridgeit.functionalprogram;

import java.util.Arrays;

import com.bridgeit.utility.Utility;

public class SumThreeIntegerZero {

	public static void main(String[] args) {
		int array[] = { 0, -1, 2, -3, 1,-2,3 };
		int length = array.length;
		System.out.println(length);
		Utility.sumOfThreeZero(array, length);

	}

}
