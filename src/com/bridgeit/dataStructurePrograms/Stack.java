/*
 * Purpose:-create Stack and check the balance parenthesis
 */
package com.bridgeit.dataStructurePrograms;

public class Stack<T> {

	T[] c;
	int length;
	int top;

	/**
	 * @param length
	 */
	@SuppressWarnings("unchecked")
	public Stack(int length)

	{
		this.length = length;
		c = (T[]) new Object[length];
		top = 0;
	}

	/**
	 * @param d
	 */
	public void push(T d) {
		c[top] = d;
		top++;
	}

	/**
	 * @return
	 */
	public T pop() {
		return c[top--];
		
	}

	public boolean checkPop() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		} else
			return false;
	}

	/**
	 * @return
	 */
	public int size() {
		return top;
	}

	/**
	 * @return
	 */
	public T peek() {
		return c[top];
	}
}