/*
 * Purpose:-create ordered list using linked list
 * 
 * @Author:-Arpana Kumari
 * Version:1.0
 * @Since:-4 May, 2018
 */
package com.bridgeit.dataStructurePrograms;

import java.io.File;
import java.io.PrintStream;

public class OrderedLinkedList<T> {
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

	/**
	 * Function to append the data in linked list
	 * 
	 * @param data
	 */
	public void addAgain(T data) {
		Node1<T> n = new Node1<T>(data);
		n.data = data;
		n.next = null;
		Node1<T> temp = front;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}

	/**
	 * Function to display the data of the linked list
	 */
	public void display() {
		Node1<T> temp = front;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/**
	 * Function to write the data inside file
	 */
	public void write() {
		Node1<T> temp = front;
		try {
			PrintStream ps = new PrintStream(new File("ordered"));
			System.setOut(ps);
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		} catch (Exception e) {
			System.out.println("file not found");
		}
	}

	/**
	 * Function to find the index of data
	 * 
	 * @param item
	 * @return
	 */
	public int index(T item) {
		int count = 0, i = 0;
		if (front == null) {
			return -1;
		} else {
			Node1<T> temp = front;
			while (temp != null) {
				i++;
				if (item == temp.data) {
					count++;
					break;
				}
				temp = temp.next;
			}
		}
		if (count > 0)

			return i;

		else
			return -1;
	}

	/**
	 * pop function of linked list
	 * 
	 * @param pos
	 */
	public void pop(int pos) {
		Node1<T> temp = front;
		int i = 1;
		while (temp != null && i < pos) {
			temp = temp.next;
			i++;
		}
		System.out.println(temp.data);
	}

	public void pop() {
		Node1<T> temp = front;
		while (temp.next != null) {
			temp = temp.next;
		}
		System.out.println(temp.data);
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

}
