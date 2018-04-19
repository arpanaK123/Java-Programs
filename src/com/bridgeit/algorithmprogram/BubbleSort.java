/*
 * Purpose:- Reads in integers prints them in sorted order using Bubble Sort
 *            Print the Sorted List 
 *            
 * @Author:-Arpana kumari
 * version:-1.0
 * @since:-19 April, 2018S
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {

		System.out.println("enter array size");
		int size = Utility.inputInteger();

		Integer[] array;
		Integer item;

		array = Utility.integerInput(size);
		array = Utility.bubbleSort(array);
		Utility.arrayDisplay(array, size);
	}

}
