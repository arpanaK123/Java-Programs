package com.bridgeit.algorithmprogram;

import com.bridgeit.dataStructurePrograms.Queue;

public class Dequeue<T>{
	T[] q;
int size;
int front;
int rear;

 Queue queue=new Queue();
 public Dequeue(int size)
 {
	 this.size=size;
	
 }
 public void enQueue(T data)
 {
	 queue.addFront(data);
 }
 
}
