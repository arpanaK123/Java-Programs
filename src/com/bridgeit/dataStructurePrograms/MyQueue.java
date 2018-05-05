/*
 * Purpose:-Create a bank cash counter using Queue
 * 
 * @Author:-Arpana Kumari
 * Version:1.0
 * @Since:-26 April, 2018
 */
package com.bridgeit.dataStructurePrograms;

public class MyQueue<T> {

	T[] Queue;
	int front, rear, size;

	/**
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	public MyQueue(int size) {
		this.size = size;
		Queue = (T[]) new Object[size];
		front = -1;
		rear = -1;

	}

	/**
	 * Check the queue is empty or not
	 * 
	 * @return:true or false
	 */
	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;

		} else {
			return false;
		}
	}

	/**
	 * check the Queue is full or not
	 * 
	 * @return:true or false
	 */
	public boolean isFull() {
		if (rear == size - 1) {
			return true;
		} else
			return false;
	}

	/**
	 * function to add the data in queue
	 * 
	 * @param data
	 */
	public void enQueue(T data) {
		if (isFull()) {
			return;
		} else if (isEmpty()) {
			front = rear = 0;
		} else {
			rear = rear + 1;
		}
	}

	/**
	 * Function to remove
	 */
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
