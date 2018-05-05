/*
 * Purpose:-Create the function of unordered list using linked list
 */
package com.bridgeit.dataStructurePrograms;

import java.io.File;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class UnOrderedNodeFunction<T> {
	static Node<?> Head;

	/**
	 * Generic function to add data
	 * 
	 * @param data
	 */
	public static <T extends Comparable<T>> void addData(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.nextNode = null;
		if (Head == null) {
			Head = node;
		} else {
			@SuppressWarnings("unchecked")
			Node<T> temp = (Node<T>) Head;
			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = node;
		}
	}

	/**
	 * Function to remove data
	 * 
	 * @param position
	 */
	public static <T extends Comparable<T>> void removeData(int position) {
		if (position == 0) {
			Head = Head.nextNode;
		} else {
			@SuppressWarnings("unchecked")
			Node<T> n = (Node<T>) Head;
			Node<T> temp = null;
			for (int i = 0; i < position - 1; i++) {
				n = n.nextNode;
			}
			temp = n.nextNode;
			n.nextNode = temp.nextNode;
			temp = null;
		}
	}

	/**
	 * Function to search data
	 * 
	 * @param word
	 * @return
	 */
	public static <T extends Comparable<T>> int searchData(T word) {
		@SuppressWarnings("unchecked")
		Node<T> temp = (Node<T>) Head;
		int i = 0;
		while (temp != null) {
			if (temp.data.equals(word)) {
				return i;
			}
			temp = temp.nextNode;
			i++;

		}
		return -1;

	}

	/**
	 * Function to print data
	 */
	public static <T extends Comparable<T>> void printData() {
		@SuppressWarnings("unchecked")
		Node<T> node = (Node<T>) Head;
		while (node.nextNode != null) {
			System.out.println(node.data);
			node = node.nextNode;
		}
		System.out.println(node.data);
	}

	/**
	 * Function to search value
	 * 
	 * @param word
	 * @param array
	 * @throws IOException
	 */
	public static void searchFunction(String word, String array[]) throws IOException {
		for (int i = 0; i < array.length; i++) {
			UnOrderedNodeFunction.addData(array[i]);
		}
		int position = UnOrderedNodeFunction.searchData(word);
		if (position == -1) {
			UnOrderedNodeFunction.addData(word);
		} else {
			UnOrderedNodeFunction.removeData(position);
		}
		File file = new File(
				"//home//bridgeit//Documents//workspace-sts-3.9.3.RELEASE//Java-Program//src//com//bridgeit//unorderedfiles//unorderedEmpty.txt");
		Node<?> node = Head;
		while (node.nextNode != null) {
			Utility.printWriter(file, node.data);
			node = node.nextNode;
		}
		Utility.printWriter(file, node.data);

	}

}
