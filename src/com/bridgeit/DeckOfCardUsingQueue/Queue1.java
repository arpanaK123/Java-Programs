package com.bridgeit.DeckOfCardUsingQueue;

import java.lang.reflect.Array;

import com.bridgeit.dataStructurePrograms.Node;

public class Queue1 {
	int count = 0;
	Node front = null, temp;
	
//	public Queue1{
//		
//	}

	public Queue1(int number)

	{
		int array[] = new int[number];
		for (int i = 0; i < number; i++) {
			enqueue(i);
		}
	}

	public class Node<T> {
		T data;
		Node next;

		public Node(T element) {
			this.data = element;
			next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	public <T> void enqueue(T element) {
		Node node = new Node<T>(element);
		if (front == null) {
			front = node;
			temp = node;
			count++;
		} else {
			temp.next = node;
			temp = node;
			count++;
		}
	}

	public <T> void deQueue() {
		if (front == null) {
			System.out.println("list is empty");
		} else if (front != null) {
			front = front.next;
			count--;
		}
	}

	public boolean isEmpty()

	{
		if (count == 0)

			return true;
		else
			return false;
	}

	public int size()

	{
		return count;
	}

	public void getData()

	{
		temp = front;

		for (int i = 0; i < size(); i++) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}
