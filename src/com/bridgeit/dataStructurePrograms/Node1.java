package com.bridgeit.dataStructurePrograms;

public class Node1<T> {

	public Node1<T> next;
	public T data;
	public Integer key;

	public Node1(T data) {
		this.data = data;

	}

	public Node1(Integer key, T data) {
		this.key = key;
		this.data = data;

	}

}
