/*
 * Purpose:-Read in a list of words from File. Then prompt the user to enter
 *  a word to search the list. The program reports if the search word is found in the list.
 *
 *@Author:-Arpana kumari
 *Version:-1.0
 *@Since:-20 April, 2018
 */
package com.bridgeit.algorithmprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class BinarySearchForWord {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader(
				"//home//bridgeit//Documents//workspace-sts-3.9.3.RELEASE//Java-Program//src//com//bridgeit//files//BinarySearch.txt");

		BufferedReader br = new BufferedReader(file);
		String str = br.readLine();
		System.out.println(str);

		String[] array = str.split("\\s");

		String[] arraySort;
		String items;

		arraySort = Utility.bubbleSort(array);
		System.out.println(Arrays.toString(arraySort));
		System.out.println();
		System.out.println("enter the string key to be searched");
		items = Utility.inputString();
		if (Utility.binarySearch(array, items))

			System.out.println("string key found");

		else

			System.out.println("key not found");

	}

}
