package com.bridgeit.CommercialDataProcessing;

import com.bridgeit.dataStructurePrograms.Node1;

public class LinkedStack<T> {

	Node<T> head;

	public void add(T data) {
		Node<T> n = new Node<T>(data);
		if (head == null)
			head = n;
		else {
			n.next = head;
			head = n;
		}
	}

	public void display() {
		Node<T> t = head;
		while (t != null) {
			System.out.println(t.data);
			t = t.next;
		}
	}

	public void remove() {
		Node<T> t = head;
		head = t.next;
	}

	public String pop() {
		Node<T> t = head;
		String temp = (String) t.data;
		head = t.next;
		return temp;
	}

}
