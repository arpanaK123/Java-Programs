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
		UnOrderedNodeFunction.print();

	}

}