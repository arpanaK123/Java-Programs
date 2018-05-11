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
import java.io.FileReader;

import com.bridgeit.utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws Exception {


		OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();

		FileReader read = new FileReader("ordered");

		BufferedReader br = new BufferedReader(read);

		String file = br.readLine();

		System.out.println("File contains :");
		System.out.println(file);
		br.close();

		String[] stringArray = file.split("\\s",0);

		Object[] array = list.SortInt(stringArray);

		int i, j;

		//System.out.println("The sorted array is:");
		for (i = 0; i < stringArray.length; i++) {

			//System.out.println(array[i]);

		}

		for (j = 0; j < i; j++) {

			list.add(array[j]);
		}


		System.out.println("Enter the  value to be search:");
		String value = Utility.inputString();

		int index = list.search(value);

		if (index == 0) {
			list.sortedAdd(value);
		} else {
			list.remove(value, index);
		}

		System.out.println("After searching:");

		list.show();

		list.printOrdered();

	}

}
