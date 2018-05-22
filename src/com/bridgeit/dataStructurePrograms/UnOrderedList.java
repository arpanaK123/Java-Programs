/*
 * Purpose:-Read the Text from a file, split it into words and arrange 
 * it as Linked List. Take a user input to search a Word in the List.
 *  If the Word is not found then add it to the list, and if it found then
 *   remove the word from the List. In the end save the list into a file
 *
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-24 April, 2018
 */
package com.bridgeit.dataStructurePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;

import com.bridgeit.utility.Utility;

public class UnOrderedList {

	public static void main(String[] args) throws Exception {

		System.out.println("enter string to be searched");
		String searchString = Utility.inputString();

		Utility.unOrderedList(searchString);

	}

}
