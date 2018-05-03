/*
 * Purpose:-Find the number of Binary Search Tree
 * 
 * @Author:-Arpana kumari
 * Version:-1.0
 * @Since:-3 May, 2018
 */
package com.bridgeit.dataStructurePrograms;

import com.bridgeit.utility.Utility;

public class BinarySearchTree {

	public static void main(String[] args) {

		System.out.println("enter the number");
		int testcase = Utility.inputInteger();
		while (testcase > 0) {
			System.out.println("enter the nodes");

			int nodes = Utility.inputInteger();
			int tree = Utility.binarySearchTree(nodes);
			System.out.println("total tree= " + tree);
			testcase--;
		}

	}

}