/*
 * Purpose:-store the Queue in two Stacks. Stack here is also implemented using Linked List
 * 
 * @Author:-Arpana kumari
 * Version:1.0
 * @Since:-3 May, 2018
 */
package com.bridgeit.dataStructurePrograms;

public class StackLinkedCalender<T> {
	Node1<T> front;

	/**
	 * Function to add value
	 * 
	 * @param temp
	 */
	public void add(Integer temp) {
		Node1<T> n = new Node1(temp);
		if (front == null) {
			front = n;
		} else {
			n.next = front;
			front = n;
		}
	}

	/**
	 * Function to display the value
	 */
	public void display() {
		Node1<T> f = front;
		int i = 1;
		while (f != null) {
			Integer value = (Integer) f.data;
			if (!value.equals(-1)) {
				if (value < 10)
					System.out.print(f.data + "  ");
				else
					System.out.print(f.data + " ");
				if (i % 7 == 0) {
					System.out.println();
				}
			} else {
				System.out.print("   ");
			}
			f = f.next;
			i++;
		}
	}

	/**
	 * Function to remove the value
	 */
	public void remove() {
		Node1<T> f = front;
		front = f.next;
	}

}
