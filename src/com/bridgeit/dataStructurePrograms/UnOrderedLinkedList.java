/*
 * Purpose:-create ordered list using linked list
 * 
 * @Author:-Arpana Kumari
 * Version:1.0
 * @Since:-4 May, 2018
 */
package com.bridgeit.dataStructurePrograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class UnOrderedLinkedList<T> {
	Node1<T> front;

	/**
	 * Function to add the data in the linked list
	 * 
	 * @param data
	 */
	public void add(T data) {
		Node1<T> n = new Node1<T>(data);
		if (front == null) {
			front = n;
		} else {
			Node1<T> f = front;
			while (f.next != null) {
				f = f.next;
			}
			f.next = n;
		}
	}

	/**
	 * Function to search the data in the linked list
	 * 
	 * @param item
	 * @return
	 */
	// public boolean search(T item) {

	public boolean search(T item) {
		int count = 0;
		if (front == null) {
			// break;
			return false;
		} else {
			Node1<T> f = front;
			while (f != null) {
				if (item.equals(f.data)) {
					count++;
					break;
				}
				f = f.next;
			}
		}
		if (count > 0)

			return true;

		else
			return false;

	}

	// /**
	// * Function to append the data in linked list
	// *
	// * @param data
	// */
	// public void addAgain(T data) {
	// Node1<T> n = new Node1<T>(data);
	// n.data = data;
	// n.next = null;
	// Node1<T> temp = front;
	// while (temp.next != null) {
	// temp = temp.next;
	// }
	// temp.next = n;
	// }

	/**
	 * Function to display the data of the linked list
	 */
	public void display() {
		Node1<T> temp = front;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	/**
	 * Function to write the data inside file
	 */
	public void write() {
		Node1<T> temp = front;
		try {
			PrintStream ps = new PrintStream(new File("unordered"));
			System.setOut(ps);
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		} catch (Exception e) {
			System.out.println("file not found");
		}
	}

	

	public boolean isEmpty() {
		if (front == null)

			return true;
		else
			return false;
	}

	/**
	 * Function to remove data inside the linked list
	 * 
	 * @param item
	 */
	public void remove(T item) {
		Node1<T> temp = front, prev = null;
		if (temp.data.equals(item)) {
			front = temp.next;
			return;
		}
		while (temp != null && !temp.data.equals(item))

		{
			prev = temp;
			temp = temp.next;

		}
		if (temp == null) {
			return;
		}
		prev.next = temp.next;
	}

	/**
	 * Function to insert the value with position inside linkd list
	 * 
	 * @param data
	 */

	// public void insert(int pos, T data) {
	public void insert(T data) {
		Node1<T> n = new Node1<T>(data);
		n.data = data;
		n.next = null;
		int pos = 0;
		if (pos == 0) {
			addFront(data);
		} else {
			Node1<T> temp = front;
			for (int i = 0; i < pos - 1; i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next = n;
		}
	}

	public int size() {
		int i = 0;
		if (front == null) {
			return 0;
		} else {
			Node1<T> temp = front;
			while (temp != null) {
				temp = temp.next;
				i++;
			}
		}
		return i;
	}

	/**
	 * Function to add the data in front in linked list
	 * 
	 * @param data
	 */
	public void addFront(T data) {
		Node1<T> n = new Node1<T>(data);
		Node1<T> temp = front;
		n.next = temp;
		front = n;
	}

	public void sortFunction(T item) {
		Node1<T> t, a, prev, pos;
		pos = new Node1<T>(item);
		pos.next = front;
		front = pos;

		while (pos.next != null) {
			t = pos.next;
			prev = pos;

			a = t.next;

			while (a != null) {
				if (((String) a.data).compareTo((String) t.data) > 0)

				{
					Node1<T> temp = a.next;
					a.next = prev.next;
					prev.next = t.next;
					t.next = temp;
					prev = a;
					a = temp;
				} else {
					a = a.next;
					t = t.next;
					prev = prev.next;
				}
			}
			pos = pos.next;
			front = front.next;
		}
	}

	public void insertAtPosition(T data) {
		Node1<T> n = new Node1<T>(data);
		n.data = data;
		n.next = null;
		Node1<T> temp = null;

		if (front == null) {
			front = null;
		}
		while (front != null) {
			if (((String) n.data).compareTo((String) data) < 0 && ((String) n.data).compareTo((String) data) > 0) {
				temp = n;
				temp.next = n.next;
				n.next = temp.next;
				break;
			}
		}

	}

	public class Node<T> {
		Node next;
		T data;

	}

	Node front1;

	public <T> void addData(T data) {
		Node n = new Node();
		n.data = data;
		n.next = null;
		if (front1 == null) {
			front1 = n;
		} else {
			Node temp = front1;
			while (temp.next == null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}

	public <T> void showFunction() {
		Node n = front1;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public <T> int searchData(T item) {
		Node temp = front1;
		int count = 0;
		while (temp != null) {
			count++;
			if ((temp.data).equals(item)) {
				return count;
			}

			temp = temp.next;
		}

		return 0;
	}

	public <T> void removeData(T data, int index) {
		Node temp = front1;
		Node temp1 = null;
		if (index == 1) {
			front1 = front1.next;

		} else {
			for (int i = 0; i < index - 2; i++) {
				temp = temp.next;
			}
			temp1 = temp.next;
			temp.next = temp1.next;
			System.out.println(temp1.data + " remove data");
		}

	}

	public <T extends Comparable<T>> void sortData(T array) {
		Node n = new Node();
		n.data = array;
		n.next = null;
		Node insert = null;
		if (front1 == null) {
			front1 = null;
		} else {
			Node temp = front1;
			while (temp.next != null) {
				if (((Comparable<T>) temp.data).compareTo(array) < 0
						&& (((Comparable<T>) temp.next.data).compareTo(array) > 0)) {
					insert = n;
					insert.next = temp.next;
					temp.next = insert;
					break;
				}
				temp = temp.next;

			}
			temp.next = n;
		}
	}

	public <T extends Comparable<T>> T[] sortData(T[] array) {
		T temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i].compareTo(array[j]) < 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public void displayData() throws IOException {
		FileWriter fw = new FileWriter("ordered");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		Node temp = front1;
		if (front1 == null) {
			System.out.println("list is empty");
			return;
		} else if (temp.next == null) {
			pw.print(temp.data);
		} else {
			while (temp != null) {
				pw.print(temp.data + " ");
				temp = temp.next;
			}
		}
		pw.close();
	}

}
