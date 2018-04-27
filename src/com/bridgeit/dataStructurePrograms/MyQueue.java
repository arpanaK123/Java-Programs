package com.bridgeit.dataStructurePrograms;

public class MyQueue<T> {

	T[] Queue;
	int front, rear, size;

	public MyQueue(int size) {
		this.size = size;
		Queue = (T[]) new Object[size];
		front = -1;
		rear = -1;

	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;

		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (rear == size - 1) {
			return true;
		} else
			return false;
	}

	public void enQueue(T data) {
		if (isFull()) {
			return;
		} else if (isEmpty()) {
			front = rear = 0;
		} else {
			rear = rear + 1;
		}
	}

	public void deQueue() {
		if (isEmpty()) {
			return;
		} else if (front == rear) {
			front = rear = -1;
		} else {
			front = front + 1;
		}
	}

}
