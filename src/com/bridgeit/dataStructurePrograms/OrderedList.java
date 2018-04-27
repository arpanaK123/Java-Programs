/*
 * Purpose:-Read .a List of Numbers from a file and arrange it
 *         ascending Order in a Linked List. Take user input for a number,
 *         if found then pop the number out of the list else insert 
 *         the number in appropriate position
 *
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-25 April,2017
 */
package com.bridgeit.dataStructurePrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.bridgeit.utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader(
				"//home//bridgeit//Documents//workspace-sts-3.9.3.RELEASE//Java-Program//src//com//bridgeit//orderedList//ordered.txt");

		BufferedReader br = new BufferedReader(file);
		String str = br.readLine();
		System.out.println("the files contains are:");
		System.out.println(str);
		String[] array = str.split("\\s");
		Utility.bubbleSort(array);
		System.out.println("enter string to be searched");
		String searchString = Utility.inputString();
		UnOrderedNodeFunction.searchFunction(searchString, array);
		UnOrderedNodeFunction.printData();

	}

}
