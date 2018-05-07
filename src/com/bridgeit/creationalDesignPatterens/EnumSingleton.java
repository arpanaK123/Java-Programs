/*
 * Purpose:-Implementation of Enum Singleton Pattern
 * 
 * @Author:-Arpana Kumari
 * Version:1.0
 * @Since:-7 May, 2018
 */
package com.bridgeit.creationalDesignPatterens;

public enum EnumSingleton {

	INSTANCE;
	int a = 10;

	public static void doSomething() {
		int a = 10;
	}

	public static void main(String[] args) {
		System.out.println("enum class");
		System.out.println(INSTANCE.a);
	}

}
