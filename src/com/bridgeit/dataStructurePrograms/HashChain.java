/*
 * Purpose:-create Hash-Chain of Hashing function
 * 
 * @Author:-Arpana Kumari
 * Version:-1.0
 * @Since:-4 May, 2018
 */
package com.bridgeit.dataStructurePrograms;

import java.io.File;
import java.io.PrintStream;

public class HashChain {

	public static Node1[] table;
	public static int size;
	Node1 front;

	public HashChain(int tablesize) {
		table = new Node1[tablesize];
		size = 0;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public static void insert(int value) {
		size++;
		int pos = myhash(value);
		Node1 n = new Node1(value);
		if (table[pos] == null) {
			table[pos] = n;
		} else {
			n.next = table[pos];
			table[pos] = n;
		}
	}

	public void remove(int val) {
		int pos = myhash(val);
		Node1 temp = table[pos];
		Node1 prev = null;
		Integer t = (Integer) temp.data;
		if (temp.data.equals(temp)) {
			front = temp.next;
			return;
		}

		while (temp != null) {
			t = (Integer) temp.data;
			if (t.equals(val)) {
				break;
			} else {
				prev = temp;
				temp = temp.next;
			}
		}
		prev.next = temp.next;
	}

	public static int myhash(int value) {
		int hashval = value;
		hashval = hashval % table.length;
		return hashval;

	}

	public static void display() {
		for (int i = 0; i < table.length; i++) {
			System.out.println(i + " ");
			Node1 t = table[i];
			while (t != null) {
				System.out.println(t.data + " ");
				t = t.next;
			}
			System.out.println();
		}
	}

	public static void write() {
		try {
			PrintStream p = new PrintStream(new File("file1.txt"));
			System.setOut(p);
			for (int i = 0; i < table.length; i++) {
				Node1 t = null;
				System.out.println(t.data + " ");
				t = table[i];
				while (t != null) {
					System.out.println(t.data + " ");
					t = t.next;
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("Something wrong");
		}
	}

	public static void search(int value) {
		int pos = myhash(value);
		Integer data = value;
		int c = 0;
		Node1 t = table[pos];
		while (t != null) {
			if (t.data.equals(data)) {
				c++;
				break;
			}
			t = t.next;
		}
		if (c > 0) {
			System.out.println("file found at pos  " + pos + "\n file removed");
		} else {
			System.out.println("file not found \n file added");
			insert(value);
		}
	}
}
