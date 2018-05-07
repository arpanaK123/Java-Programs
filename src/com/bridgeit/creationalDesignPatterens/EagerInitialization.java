/*
 * Purpose:-Implementation of Eager initialization Singleton Pattern
 * 
 * @Author:-Arpana Kumari
 * Version:-1.0
 * @Since:-7 May, 2018
 */
package com.bridgeit.creationalDesignPatterens;

public class EagerInitialization {
	// Early, instance will be created at load time
	private static final EagerInitialization instance = new EagerInitialization();

	// private constructor to avoid client applications to use constructor
	private EagerInitialization() {
	};

	public static EagerInitialization getInstance() {
		return instance;
	}

	static EagerInitialization instance1 = new EagerInitialization();
	static EagerInitialization instance2 = new EagerInitialization();

	public static void main(String[] args) {

		System.out.println("bridge lab");
		System.out.println(instance1);
		System.out.println(instance2);
	}
}
