/*
 * Purpose:-Implementation of Thread Safe Singleton Pattern
 * 
 *  @Author:-Arpana Kumari
 *  Version:1.0
 *  @Since:-7 May, 2018
 */
package com.bridgeit.creationalDesignPatterens;

public class TreadSafeSingleton {

	private static TreadSafeSingleton instance;

	private TreadSafeSingleton() {
	}

	public static synchronized TreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new TreadSafeSingleton();
		}
		return instance;
	}

	public static TreadSafeSingleton getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (TreadSafeSingleton.class) {
				if (instance == null) {
					instance = new TreadSafeSingleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {

		System.out.println("thread safe singleton");
		System.out.println(instance);
	}

}
