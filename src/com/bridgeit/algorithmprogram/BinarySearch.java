/*
 * Purpose:-binarySearch method for integer
 *  
 *  @Author:-Arpana kumari
 *  Version:-1.0
 *  @Since:-19 April,2018
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

		Integer[] array;
		String[] stringArray;
		String items;
		Integer item;
		long start;
		long stop;

		switch (choice) {
		case 1:
		{

			array = Utility.integerInput(size);
			array = Utility.bubbleSort(array);
			Utility.arrayDisplay(array, size);
			System.out.println();
			System.out.println("enter key to be searched");
			item = Utility.inputInteger();
			start = System.nanoTime();
			if (Utility.binarySearch(array, item))
				System.out.println("key found");
			else
				System.out.println("key not found");

			stop = System.nanoTime();
			System.out.println("elapsed time=" + (stop - start));

			break;
		}
		case 2: {
			stringArray = Utility.stringInput(size);
			stringArray = Utility.bubbleSort(stringArray);
			Utility.arrayDisplay(stringArray, size);
			System.out.println();
			System.out.println("enter the string key to be searched");
			items = Utility.inputString();
			start = System.nanoTime();
			if (Utility.binarySearch(stringArray, items))
				
			
				System.out.println("string key found");

			else

			System.out.println("key not found");
			stop = System.nanoTime();
			System.out.println("elapsed time=" + (stop - start));
			break;

		}

		case 3: {
			array=Utility.integerInput(size);
			start=System.nanoTime();
			array=Utility.insertionSort(array);
			Utility.arrayDisplay(array, size);
			stop=System.nanoTime();
			System.out.println("elapsed time="+(stop-start));
			break;
		}
		case 4: {

			stringArray = Utility.stringInput(size);
			start = System.nanoTime();
			stringArray = Utility.insertionSort(stringArray);

			Utility.arrayDisplay(stringArray, size);
			stop = System.nanoTime();

			System.out.println("elapsed time=" + (stop - start));
			break;
			
		
		}
		
		case 5:
		{
			array=Utility.integerInput(size);
			start=System.nanoTime();
			array=Utility.bubbleSort(array);
			Utility.arrayDisplay(array, size);
			stop=System.nanoTime();
			System.out.println("elapsed time="+(stop-start));
			break;
			
		}
		case 6:
		{
		stringArray=Utility.stringInput(size);
		start=System.nanoTime();
		stringArray=Utility.bubbleSort(stringArray);
		Utility.arrayDisplay(stringArray, size);
		stop=System.nanoTime();
		System.out.println("elapsed time="+(stop-start));
		break;
			
		}
		default:
			System.out.println("enter correct choice");
			break;

		}

	}
}
