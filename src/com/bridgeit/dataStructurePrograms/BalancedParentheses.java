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
		// String array[] = parenthesis.split("\\s");
		char array[] = parenthesis.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '(') {
				stack.push(array[i]);
			} else if (array[i] == ')') {
				stack.pop();
			} else if (array[i] == '{') {
				stack.push(array[i]);
			} else if (array[i] == '}') {
				stack.pop();
			} else if (array[i] == '[') {
				stack.push(array[i]);
			} else if (array[i] == ']') {
				stack.pop();
			}
		}
		boolean result = stack.isEmpty();
		if (result == true) {
			System.out.println("balanced parenthesis");
		} else {
			System.out.println("parenthesis is not balanced ");
		}
		// Stack stack = new Stack();
		// for (int i = 0; i <= array.length - 1; i++) {
		// stack.push(array[i]);
		// }
		// System.out.println();
		//
		// //((Object) stack).disp();
	}

}
