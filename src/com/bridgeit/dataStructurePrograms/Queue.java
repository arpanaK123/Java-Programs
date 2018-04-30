package com.bridgeit.dataStructurePrograms;

public class Queue<T> {

	Node1<T> front, rear;

	public Queue() {
		front = null;
		rear = null;

	}

	public boolean isEmpty() {
		if (front == null) {
			return true;

		} else {
			return false;
		}
	}

	public int size() {
		Node1 temp = front;
		int i = 0;
		while (temp != null) {
			temp = temp.next;
			i++;
		}
		return i;
	}

	public void addFront(T data) {
		Node1<T> n = new Node1<T>(data);
		if (front == null) {
			front = n;
			rear = front;

		} else {
			n.next = front;
			front = n;

		}
	}

	public void addEnd(T data) {
		Node1<T> n = new Node1<T>(data);

		if (front == null) {
			rear = n;
			front = rear;
		} else {
			rear.next = n;
			rear = n;
		}

	}

	public Node1<T> removeFront() {
		Node1<T> f = front;
		front = front.next;
		return f;
	}

	public Node1<T> removeLast() {
		Node1<T> f = front;
		Node1<T> prev = null;
		while (f.next != null) {
			prev = f;
			f = f.next;
		}
		prev.next = null;
		return f;
	}

	public void display() {
		Node1<T> temp = front;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
