/*
 * Purpose:-Implementation of Enum Singleton Pattern
 * 
 * @Author:-Arpana Kumari
 * Version:1.0
 * @Since:-7 May, 2018
 */
package com.bridgeit.creationalDesignPatterens;

public enum EnumSingleton {
	LOW, START, INSTANCE;

	public static void doSomething() {
	}

	public static void main(String[] args) {
		System.out.println("enum class");
		System.out.println(START);
		System.out.println(INSTANCE);
		System.out.println(LOW);
	}

}
