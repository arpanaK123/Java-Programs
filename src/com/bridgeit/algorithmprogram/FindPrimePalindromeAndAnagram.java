package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class FindPrimePalindromeAndAnagram {

	public static void main(String[] args) {
		int i = 0;
		int count = 0;
		System.out.println("enter prime range");
		int range = Utility.inputInteger();
		System.out.println("print palindrome prime");
		while (i <= range) {
			if (Utility.prime(i))

			{
				if (Utility.primePalindrome(i))
					System.out.print(i);
				count++;
			}
			i++;
		}
		System.out.println();
		System.out.println("print anagram prime");

		int[] array = new int[range];
		i = 1;
		int z = 0;

		int[] prime = null;
		while (i <= range) {
			boolean j = Utility.prime(i);
			if (j) {
				prime[z] = i;
				z++;

			}
			i++;

		}
		Utility.primeAnagram(prime);

	}

}
