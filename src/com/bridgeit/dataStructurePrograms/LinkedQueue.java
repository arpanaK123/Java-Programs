/*
 * Purpose:- The WeekDay objects are stored in a Queue implemented using Linked List
 */
package com.bridgeit.dataStructurePrograms;

public class LinkedQueue<T> {

	Node1<T> front;

	/**
	 * Add data into linked list
	 * 
	 * @param data
	 */
	public void add(T data) {
		Node1<T> n = new Node1<T>(data);
		if (front == null) {
			front = n;

		} else {
			Node1<T> f = front;
			while (f.next != null)
				f = f.next;
			f.next = n;

		}
	}

	/**
	 * remove data from linked list
	 * 
	 * @return
	 */
	public T remove() {
		Node1<T> f = front;
		if (front != null)
			front = f.next;
		return f.data;
	}

	/**
	 * check the list is empty or not
	 * 
	 * @return
	 */
	public boolean isEmpty() {

		if (front == null) {
			return true;

		} else {
			return false;
		}
	}

	/**
	 * display the data of the linked list
	 */
	public void display() {
		Node1<T> temp = front;
		Integer a = 10;
		if (!isEmpty()) {
			while (temp != null) {

				if (!(temp.data.equals(-1))) {
					if (((Integer) (temp.data)).compareTo(a) < 0) {
						System.out.print(temp.data + "  ");
					} else
						System.out.print(temp.data + " ");
				} else
					System.out.print("   ");

				temp = temp.next;
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		LinkedQueue<Integer> l = new LinkedQueue<Integer>();
		l.display();
		System.out.println(" == ");
		l.remove();
		l.display();
		System.out.println(l.isEmpty());
	}
}
