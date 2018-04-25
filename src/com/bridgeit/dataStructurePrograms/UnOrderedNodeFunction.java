package com.bridgeit.dataStructurePrograms;

import java.io.File;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class UnOrderedNodeFunction<T> {
	static Node Head;

	public static <T extends Comparable<T>> void add(T data) {
		Node node = new Node();
		node.data = data;
		node.nextNode = null;
		if (Head == null) {
			Head = node;
		} else {
			Node temp = Head;
			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = node;
		}
	}

	public static <T extends Comparable<T>> void remove(int position) {
		if (position == 0) {
			Head = Head.nextNode;
		} else {
			Node n = Head;
			Node temp = null;
			for (int i = 0; i < position - 1; i++) {
				n = n.nextNode;
			}
			temp = n.nextNode;
			n.nextNode = temp.nextNode;
			temp = null;
		}
	}

	public static <T extends Comparable<T>> int search(T word) {
		Node temp = Head;
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

	public static <T extends Comparable<T>> void print() {
		Node node = Head;
		while (node.nextNode != null) {
			System.out.println(node.data);
			node = node.nextNode;
		}
		System.out.println(node.data);
	}

	public static void searchFunction(String word, String array[]) throws IOException {
		for (int i = 0; i < array.length; i++) {
			UnOrderedNodeFunction.add(array[i]);
		}
		int position = UnOrderedNodeFunction.search(word);
		if (position == -1) {
			UnOrderedNodeFunction.add(word);
		} else {
			UnOrderedNodeFunction.remove(position);
		}
		File file = new File(
				"//home//bridgeit//Documents//workspace-sts-3.9.3.RELEASE//Java-Program//src//com//bridgeit//unorderedfiles//unorderedEmpty.txt");
		Node node = Head;
		while (node.nextNode != null) {
			Utility.printWriter(file, node.data);
			node = node.nextNode;
		}
		Utility.printWriter(file, node.data);

	}

}
