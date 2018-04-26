package com.bridgeit.dataStructurePrograms;

public class Stack<T extends Comparable<T>> {

	static int size = 20;
	static int top = -1;

	static Object[] s = new Object[size];

	public static <T extends Comparable<T>> void push(T data) {
		if (top == size - 1) {
			System.out.println("stack is full , push operation not possible");
		} else {
			++top;
			s[top] = data;
		}
	}

	public static <T extends Comparable<T>> void pop() {
		if (top == -1) {
			System.out.println("stack is empty,pop operation not possible");
		} else {
			top--;
		}
	}

	public static <T extends Comparable<T>> void disp() {
		if (top == -1) {
			System.out.println("stack is empty, display operation not possible");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.println(s[i] + " ");
				top--;
			}
		}
	}

	public boolean isEmpty() {
		if (top == 0) {
			return true;
		} else
			return false;
	}

	public int size() {
		return size();
	}

	public T peek() {
		return (T) s[top];
	}
}