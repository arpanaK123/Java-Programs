/*
 * Purpose:-Reads in strings from standard input and prints them in sorted order.
 * Uses insertion sort.
 *
 *@Author:-Arpana Kumari
 *version:-1.0
 *@since:-20 April,2018
 */
package com.bridgeit.algorithmprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgeit.utility.Utility;

public class InsertionSortForString {
	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader(
				"//home//bridgeit//Documents//workspace-sts-3.9.3.RELEASE//Java-Program//src//com//bridgeit//files//BinarySearch.txt");

		BufferedReader br = new BufferedReader(file);
		String str = br.readLine();
		System.out.println(str);
		String[] array = str.split("\\s");

		String[] arraySort;
		String items;

		arraySort = Utility.insertionSort(array);
		System.out.println(Arrays.toString(arraySort));
	}
}
