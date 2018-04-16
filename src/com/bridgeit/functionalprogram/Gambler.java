/*
 * Purpose:- Simulates a gambler who start with $stake and place
 *  fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal.
 *  Print Number of Wins and Percentage of Win and Loss
 *   
 *  @Author:-Arpana kumari
 *  Version:-1.0
 *  @Since:-14 April,2018
 */
package com.bridgeit.functionalprogram;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Gambler {

	public static void main(String[] args) {

		System.out.println("Enter the STAKE");
		int stake = Utility.inputInteger();
		System.out.println("Enter the GOAL");
		int goal = Utility.inputInteger();
		System.out.println("Enter Number of Times");
		int number = Utility.inputInteger();
		Utility.gambler(number, stake, goal);

	}

}
