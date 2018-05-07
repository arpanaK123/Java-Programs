/*
 * Purpose:-Implementation of Lazy Initialization Singleton Pattern
 * 
 * @Author:-Arpana Kumari
 * Version:-1.0
 * @Since:-7 May, 2018
 */
package com.bridgeit.creationalDesignPatterens;

public class LazyInitialization {
	private static LazyInitialization instance;

	private LazyInitialization() {
	}

	public static LazyInitialization getInstance() {
		if (instance == null) {// if there is no instance available... create new ones
			instance = new LazyInitialization();
		}
		return instance;
	}

	public static void main(String[] args) {

		System.out.println("lazy instance");
		System.out.println(instance);

		// Instance 1
		LazyInitialization instance1 = LazyInitialization.getInstance();

		// Instance 2
		LazyInitialization instance2 = LazyInitialization.getInstance();

		// now lets check the hash key.
		System.out.println("Instance 1 hash:" + instance1.hashCode());
		System.out.println("Instance 2 hash:" + instance2.hashCode());

	}

}
