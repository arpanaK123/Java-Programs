/*
 * Purpose:-binarySearch method for integer
 *  
 *  @Author:-Arpana kumari
 *  Version:-1.0
 *  @Since:-14 April,2018
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class BinarySearch {

	public static void main(String[] args) {

		System.out.println("press 1 for binary search integer functoin");
		System.out.println("press 2 for binary search string function");
		System.out.println("press 3 for insertion sort integer function");
		System.out.println("press 4 for insertion sort string function");
		System.out.println("press 5 for bubble sort integer function");
		System.out.println("press 6 for bubble sort string function");
		System.out.println("enter your choice");
		int choice = Utility.inputInteger();

		System.out.println("enter array size");
		int size = Utility.inputInteger();
		int array[] = new int[size];
		String array1[] = new String[size];
		System.out.println("enter array element");
		for (int i = 0; i <= size - 1; i++) {
			array[i] = Utility.inputInteger();
		}
		for (int i = 0; i <= size - 1; i++) {
			array1[i] = Utility.inputString();
		}
		switch (choice) {
		case 1: {
			System.out.println("press 1 for start the stopwatch");
			long start = Utility.inputInteger();
			start = System.nanoTime();

			System.out.println("enter the key to be searched");
			int key = Utility.inputInteger();
			int result = Utility.binarysearch(array, 0, size - 1, key);
			if (result >= 0) {
				System.out.println("key found @ index=" + result);
			} else {
				System.out.println("key not found");
			}
			System.out.println("press 2 for stop the stopwatch");
			long stop = Utility.inputInteger();
			stop = System.nanoTime();
			System.out.println("elapsed time=" + " " + (stop - start));
			break;

		}

		case 2: {
			System.out.println("press 1 for start the stopwatch");
			long start = Utility.inputInteger();
			start = System.nanoTime();
			break;
		}

		case 3:
			System.out.println("press 1 for start stopwatch");
			long start = Utility.inputInteger();
			start = System.nanoTime();
			System.out.println("array element before sorting");
			for (int i = 0; i <= size - 1; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
			Utility.insertionSort(array, size);
			System.out.println("array element after sorting"); {
			for (int i = 0; i <= size - 1; i++) {
				System.out.print(array[i] + " ");
				System.out.println("press 2 for stop the stopwatch");
				long stop = Utility.inputInteger();
				stop = System.nanoTime();
				System.out.println("elapsed time=" + " " + (stop - start));
			}
		}

		}

	}

}
