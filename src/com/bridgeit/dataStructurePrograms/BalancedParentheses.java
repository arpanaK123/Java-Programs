package com.bridgeit.dataStructurePrograms;

import java.util.Stack;

import com.bridgeit.utility.Utility;

public class BalancedParentheses {

	public static void main(String[] args) {

		System.out.println("enter the parenthesis");
		String parenthesis = Utility.inputString();
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
		if (result==true) {
			System.out.println("balanced parenthesis");
		} else {
			System.out.println("parenthesis is not balanced ");
		}

	}

}
