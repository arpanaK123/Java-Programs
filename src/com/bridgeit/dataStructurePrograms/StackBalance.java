/*
 * Purpose:-create Stack and check the balance parenthesis
 */
package com.bridgeit.dataStructurePrograms;

public class StackBalance<T> {

	T[] c;
	int length;
	int top;

	/**
	 */
	@SuppressWarnings("unchecked")
	public StackBalance(int length)

	{
		this.length = length;
		c = (T[]) new Object[length];
		top = 0;
	}

	/**
	 * Push function
	 * 
	 * @param d
	 */
	public void push(T d) {
		c[top] = d;
		top++;
	}

	/**
	 * 
	 * @return
	 */
	public T pop() {
		try {
			if (top >= 0) {
				return c[top--];
			}
		} catch (Exception e) {
			System.out.println("not balanced");
			// return c[top--];
		}
		return c[top--];
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