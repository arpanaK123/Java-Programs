/*
 * Purpose:- Create a Program which creates Banking Cash Counter where people
 *           come in to deposit Cash and withdraw Cash. Have an input panel to add
 *           people to Queue to either deposit or withdraw money and dequeue the people.
 *           Maintain the Cash Balance.
 *
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-26 April,2018
 */
package com.bridgeit.dataStructurePrograms;

import com.bridgeit.utility.Utility;

public class BankCashCounter {

	public static void main(String[] args) {
		System.out.println("enter total number of people");
		int people = Utility.inputInteger();
		int cash = Utility.bankCashCounter(people);
		System.out.println("final Bank balance is=" + cash);
	}

}
