/*
 * Purpose:-A palindrome is a string that reads the same forward and backward, for
 *          example, radar, toot, and madam. We would like to construct an 
 *          algorithm to input a string of characters and check whether it is 
 *          a palindrome.
 *
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-30 April, 2018
 */
package com.bridgeit.dataStructurePrograms;

import com.bridgeit.utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args) {
		System.out.println("enter the string");
		String word = Utility.inputString();

		boolean result = Utility.palindromeChecker(word);
		if (result == true) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}
}
