/*
 * Purpose:-The Two Strings are Anagram or not....
 *  
 *  @Author:-Arpana kumari
 *  Version:-1.0
 *  @Since:-18 April,2018
 */
package com.bridgeit.algorithmprogram;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Anagram {

	public static void main(String[] args) {

		System.out.println("eneter first string");

		String words1 = Utility.inputString1();

		System.out.println("enter second string");

		String words2 = Utility.inputString1();

		Utility.compareString(words1, words2);

	}
}
