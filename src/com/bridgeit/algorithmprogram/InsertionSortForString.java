/*
 * Purpose:-Reads in strings from standard input and prints them in sorted order.
 * Uses insertion sort.
 *
 *@Author:-Arpana Kumari
 *version:-1.0
 *@since:-19 April,2018
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class InsertionSortForString {

	public static void main(String[] args) {
		System.out.println("enter array size");
		int size = Utility.inputInteger();

		String[] stringArray;
		String items;

		stringArray = Utility.stringInput(size);
		stringArray = Utility.insertionSort(stringArray);

		Utility.arrayDisplay(stringArray, size);

	}

}
