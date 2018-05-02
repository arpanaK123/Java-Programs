package com.bridgeit.dataStructurePrograms;

public class LinkedQueue<T> {

	Node1<T> front;

	public void add(T data) {
		Node1<T> n = new Node1<T>(data);
		if (front == null) {
			front = n;

		} else {
			Node1<T> f = front;
			// f = f.next;
			// f.next = n;
			n.next = front;
			front = n;
		}
	}

	public T remove() {
		Node1<T> f = front;
		if (front != null)
			front = f.next;
		return f.data;
	}

	public boolean isEmpty() {

		if (front == null) {
			return true;

		} else {
			return false;
		}
	}

	public void display() {
		Node1<T> temp = front;
		Integer a = 10;
		if (!isEmpty()) {
			while (temp != null) {

				if (!(temp.data.equals(-1))) {
					if (((Integer) (temp.data)).compareTo(a) < 0) {
						System.out.print(temp.data + " ");
					} else
						System.out.print(temp.data + " ");
				} else
					System.out.println();

				temp = temp.next;
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		LinkedQueue<Integer> l = new LinkedQueue<Integer>();
		l.display();
		System.out.println(" == ");
		l.remove();
		l.display();
		System.out.println(l.isEmpty());
	}
}
