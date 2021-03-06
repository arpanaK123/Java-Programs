/*
 * Purpose:- Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)
 *          where parentheses are used to order the performance of operations. Ensure
 *          parentheses must appear in a balanced fashion.
 *
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-25 April, 2018
 */
package com.bridgeit.dataStructurePrograms;

import java.util.Stack;

import com.bridgeit.utility.Utility;

public class BalancedParentheses {

	public static void main(String[] args) {

		System.out.println("enter the parenthesis");
		String parenthesis = Utility.inputString();
		char array[] = parenthesis.toCharArray();
		StackBalance<Character> stack1 = new StackBalance<Character>(array.length);

		for (int i = 0; i < array.length; i++) {
			if (array[i] == '(') {
				stack1.push(array[i]);

			} else if (array[i] == ')') {
				stack1.pop();
			}

		}
		boolean result = stack1.isEmpty();
		if (result == true) {
			System.out.println("balanced parenthesis");
		} else {
			System.out.println("parenthesis is not balanced ");
		}

	}

}
