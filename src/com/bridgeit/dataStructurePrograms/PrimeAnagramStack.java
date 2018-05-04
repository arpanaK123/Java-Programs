/*
 * Purpose:-Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked List
 *          and Print the Anagrams in the Reverse Order.
 *          
 * @Author:-Arpana Kumari
 * Version:-1.0
 * @Since:-4 May, 2018
 */
package com.bridgeit.dataStructurePrograms;

import com.bridgeit.utility.Utility;

public class PrimeAnagramStack {

	public static void main(String[] args) {

		int size = 1000;
		int primecount = 1;
		int count = 0;
		while (primecount <= size) {
			if (Utility.prime(primecount)) {
				count++;
			}
			primecount++;
		}
		System.out.println();
		System.out.println("*****prime Anagram in Reverse Order********");
		int prime[] = new int[count];
		primecount = 1;
		int loop = 0;
		while (primecount <= size) {
			if (Utility.prime(primecount)) {
				prime[loop] = primecount;
				loop++;
			}
			primecount++;
		}
		Utility.primeAnagramLinkedStack(prime);
	}

}
