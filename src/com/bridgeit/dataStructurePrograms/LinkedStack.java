package com.bridgeit.dataStructurePrograms;

/*
 * Purpose:-store the Queue in two Stacks. Stack here is also implemented using Linked List
 * 
 * @Author:-Arpana Kumari
 * Version:-1.0
 * @Since:-3 May, 20118
 */
public class LinkedStack<T> {

	Node1<T> front;

	public void add(T data) {
		Node1<T> n = new Node1<T>(data);
		if (front == null) {
			front = n;

		} else {

			n.next = front;
			front = n;
		}
	}

	public void display() {
		Node1<T> f = front;
		while (f!= null) {
			System.out.println(f.data);
			f = f.next;
		}
	}

	public void remove() {
		Node1<T> f = front;
		front = f.next;
	}

	public Integer pop() {
		Node1<T> f = front;
		Integer temp = (Integer) f.data;
		front = f.next;
		return temp;

	}

	public static void main(String[] args) {
		LinkedStack<Integer> l = new LinkedStack<Integer>();
		l.add(2);
		l.add(10);
		l.add(5);
		l.display();
		System.out.println("==");
		l.display();
	}
}
