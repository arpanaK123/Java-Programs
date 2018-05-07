/*
 * Purpose:-Create a Slot of 10 to store Chain of Numbers that belong to each 
 *          Slot to efficiently search a number from a given set of number.
 *          read a set of numbers from a file and take user input to search a number
 *          O/P -> Save the numbers in a file
 *          
 *@Author:-Arpana Kumari
 *Version:1.0
 *@Since:-4 May, 2018
 */
package com.bridgeit.dataStructurePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import com.bridgeit.utility.Utility;

public class HashingFunction {

	public static void main(String[] args) throws Exception {
		System.out.println("enter the size");
		int size = Utility.inputInteger();
		@SuppressWarnings("unused")
		HashChain hs = new HashChain(size);

		File file = new File("file");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String filestore = "";
		String readsfile;
		while ((readsfile = br.readLine()) != null) {
			filestore = filestore + readsfile + " ";

		}
		br.close();
		for (String filestring : filestore.split("\\s", 0)) {
			int number = Integer.parseInt(filestring);
			HashChain.insert(number);
		}
		System.out.println("enter number to be searched");
		int search = Utility.inputInteger();

		HashChain.search(search);

		HashChain.display();
		HashChain.write();
	}

}
