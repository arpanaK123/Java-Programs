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
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import com.bridgeit.utility.Utility;

public class HashingFunction {

	public static void main(String[] args) throws Exception {
		System.out.println("enter the size");
		int size = Utility.inputInteger();
		HashChain hs = new HashChain(size);

		FileReader file = new FileReader("file.txt");

		BufferedReader br = new BufferedReader(file);
		String str = br.readLine();
		System.out.println("the files contains are:");
		System.out.println(str);

		String filestore = "";
		String readsfile;
		while ((readsfile = br.readLine()) != null) {
			filestore = filestore + readsfile + " ";
			System.out.println(filestore);

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
