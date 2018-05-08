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

	public Node1[] table;
	public int size;
	Node1 front;

	/**
	 * @param tablesize
	 */
	public HashChain(int tablesize) {
		table = new Node1[tablesize];
		size = 0;

	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Function to insert the data
	 * 
	 * @param value
	 */
	public void insert(int value) {
		size++;
		int pos = myhash(value);
		Node1 n = new Node1(value);
		if (table[pos] == null)
			table[pos] = n;
		else {
			n.next = table[pos];
			table[pos] = n;
		}
	}

	/**
	 * Function to remove the value
	 * 
	 * @param val
	 */
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
			if (t.equals(val))
				break;
			else
				prev = temp;

			temp = temp.next;

		}
		prev.next = temp.next;
	}

	/**
	 * Function to find the hash value
	 * 
	 * @param value
	 * @return
	 */
	public int myhash(int value) {
		int hashval = value;
		hashval = hashval % table.length;
		return hashval;

	}

	/**
	 * Function to display the Hash Table
	 */
	public void display() {
		for (int i = 0; i < table.length; i++) {
			System.out.print(i + ":-" + " ");
			Node1 t = table[i];
			while (t != null) {
				System.out.print(t.data + " ");
				t = t.next;
			}
			System.out.println();
		}
	}

	/**
	 * Function to write the value inside the file
	 */
	public void write() throws Exception {
		try {
			PrintStream p = new PrintStream(new File("file1.txt"));
			System.setOut(p);
			for (int i = 0; i < table.length; i++) {
				System.out.print(i + " :");
				Node1 t = table[i];
				while (t != null) {
					System.out.print(t.data + " ");
					t = t.next;
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("Something wrong");
		}
	}

	/**
	 * Function to search the value inside hash table
	 * 
	 * @param value
	 */
	public void search(int value) {
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
			remove(value);
		} else {
			System.out.println("file not found \n file added");
			insert(value);
		}
	}
}
