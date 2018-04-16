/*
 * Purpose:-binarySearch method for integer
 *  
 *  @Author:-Arpana kumari
 *  Version:-1.0
 *  @Since:-14 April,2018
 */
package com.bridgeit.algorithmprogram;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array length");
		int length = scan.nextInt();
		int array[] = new int[length];
		System.out.println("enter array element");

		for (int i = 0; i <= length - 1; i++) {
			System.out.println("enter element");
			array[i] = scan.nextInt();
		}
		System.out.println("enter key");
		int key = scan.nextInt();

		Utility utility = new Utility();

		int result = utility.binarysearch(array, length, 0, length - 1, key);
		if (result > 0) {
			System.out.println("key found at the index=" + length);
		} else {
			System.out.println("Key not found");
		}
	}

}
