/*
 * Purpose:-Extend the Prime Number Program and store only the numbers in that range
 *         that are Anagrams. For e.g. 17 and 71 are both Prime and Anagrams in 
 *         the 0 to 1000 range. Further store in a 2D Array the numbers that are
 *         Anagram and numbers that are not Anagram
 *
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-30 April,2018
 */
package com.bridgeit.dataStructurePrograms;

import com.bridgeit.utility.Utility;

public class PrimeAnagram2DArray {

	public static void main(String[] args) {

		int size = 1000;
		int primeCount = 1;
		int count = 0;
		while (primeCount <= size) {
			if (Utility.prime(primeCount)) {
				count++;
			}
			primeCount++;
		}
		System.out.println();
		System.out.println("**********prime Anagram*********");
		int[] prime = new int[count];
		primeCount = 1;
		int loop = 0;
		while (primeCount <= size) {
			if (Utility.prime(primeCount)) {
				prime[loop] = primeCount;
				//System.out.println(prime[loop]);
				loop++;
				
			}
			primeCount++;
		}
		Utility.anagram2D(prime);
//Utility.primeAnagram2DArray(prime);
	}

}
