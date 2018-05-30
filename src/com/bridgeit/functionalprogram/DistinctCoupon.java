/*
 *  Purpose:- Given N distinct Coupon Numbers, how many 
 * random numbers do you need to generate distinct coupon 
 * number? This program simulates this random process.
 * 
 * @Author:-Arpana kumari
 * version:-1.0
 * @Since:-30 May, 2018
 *
 */
package com.bridgeit.functionalprogram;

public class DistinctCoupon {

	public static int getCoupon(int n) {
		return (int) (Math.random() * n);
	}

	public static int collect(int n) {
		boolean[] isCollected = new boolean[n];
		int distinct = 0;
		while (distinct < n) {
			int value = getCoupon(n);
			if (!isCollected[value]) {
				System.out.println("distinct value=" + value);
				distinct++;
				isCollected[value] = true;

			}
		}
		return distinct;
	}

	public static void main(String[] args) {
		int number = 10;
		int count = collect(number);
		System.out.println("count= " + count);

	}

}
