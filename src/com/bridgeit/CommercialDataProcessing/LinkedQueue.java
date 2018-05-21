package com.bridgeit.CommercialDataProcessing;

import com.bridgeit.dataStructurePrograms.Node1;

public class LinkedQueue<T> {
	Node<T> front;

	/**
	 * Add data into linked list
	 * 
	 * @param data
	 */
	public void add(T data) {
		Node<T> n = new Node<T>(data);
		if (front == null) {
			front = n;

		} else {
			Node<T> f = front;
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
		Node<T> f = front;
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
		Node<T> temp = front;
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

}
