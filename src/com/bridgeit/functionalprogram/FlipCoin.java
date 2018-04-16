/*
 * Purpose:-Flip Coin and print percentage of Heads and Tails
 * @Author:-Arpana kumari
 * 
 * Version:-1.0
 * @Since:-13 April, 2018
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {

		System.out.println("How Many Times to Flip Coin");
		int times = Utility.inputInteger();

		Utility.coinFlip(times);

	}

}
