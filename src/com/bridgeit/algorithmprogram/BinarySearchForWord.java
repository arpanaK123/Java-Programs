/*
 * Purpose:-Read in a list of words from File. Then prompt the user to enter
 *  a word to search the list. The program reports if the search word is found in the list.
 *
 *@Author:-Arpana kumari
 *Version:-1.0
 *@Since:-19 April, 2018
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class BinarySearchForWord {

	public static void main(String[] args) {
		System.out.println("enter array size");
		int size = Utility.inputInteger();
		String[] stringArray;
		String items;

		stringArray = Utility.stringInput(size);
		stringArray = Utility.bubbleSort(stringArray);
		Utility.arrayDisplay(stringArray, size);
		System.out.println("enter the string key to be searched");
		items = Utility.inputString();
		boolean result = Utility.binarySearch(stringArray, items);
		if (result == true) {
			System.out.println("string key found");

		} else {
			System.out.println("key not found");

		}

	}

}
