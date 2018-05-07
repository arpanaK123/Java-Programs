/*
 * Purpose:-Implementation of Static block initialization Singleton Pattern
 * 
 * @Author:-Arpana Kumari
 * Version:-1.0
 * @Since:-7 May, 2018
 */
package com.bridgeit.creationalDesignPatterens;

public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;

	private StaticBlockInitialization() {
	}

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		System.out.println("static block instatntiation");
		System.out.println(instance);

	}

}
