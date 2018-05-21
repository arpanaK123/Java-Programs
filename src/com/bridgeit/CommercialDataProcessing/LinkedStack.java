package com.bridgeit.CommercialDataProcessing;

import com.bridgeit.dataStructurePrograms.Node1;

public class LinkedStack<T> {
	Node<T> front;

	public void add(T data) {
		Node<T> n = new Node<T>(data);
		if (front == null) {
			front = n;

		} else {

			n.next = front;
			front = n;
		}
	}

	public void display() {
		Node<T> f = front;
		while (f != null) {
			System.out.println(f.data);
			f = f.next;
		}
	}

	public void remove() {
		Node<T> f = front;
		front = f.next;
	}

	public Integer pop() {
		Node<T> f = front;
		Integer temp = (Integer) f.data;
		front = f.next;
		return temp;

	}

}
