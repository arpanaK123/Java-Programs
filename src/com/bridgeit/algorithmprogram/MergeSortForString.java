/*
 * Purpose:-Write a program with Static Functions to do Merge Sort of list of Strings. 
 * 
 * @Author:-Arpana kumari
 * version:-1.0
 * @Since:-20 April, 2018
 */
package com.bridgeit.algorithmprogram;

import java.util.Arrays;

import com.bridgeit.utility.Utility;

public class MergeSortForString {

	public static void main(String[] args) {

		String[] array = { "John", "Anthony", "Angelina", "George", "Victor", "Joe", "Jackson" };

		String[] sortedArray = Utility.mergeSort(array);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i] + " ");
		}

	}

}
