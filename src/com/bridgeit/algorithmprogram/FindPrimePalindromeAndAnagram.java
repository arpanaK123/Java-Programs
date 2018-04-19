/*
 * Purpose:-find the prime numbers that are Anagram and Palindrome 
 * 
 * @Author:-Arpana kumari
 * 
 * version:-1.0
 * Since:-18 April, 2018
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class FindPrimePalindromeAndAnagram {

	public static void main(String[] args) {
		int i = 2;
		int count = 0;
		boolean j;
		System.out.println("enter prime range");
		int range = Utility.inputInteger();
		System.out.println("print palindrome prime");
		while (i <= range) {
			if (Utility.prime(i))

			{
				if (Utility.primePalindrome(i))
					System.out.println(i);

				count++;
			}
			i++;

		}
		System.out.println();
		System.out.println("print anagram prime");

		int[] prime = new int[count];
		i = 2;
		int z = 0;

		while (i <= range) {
			j = Utility.prime(i);
			if (j) {
				prime[z] = i;
				z++;

			}
			i++;

		}
		Utility.primeAnagram(prime);

	}

}
