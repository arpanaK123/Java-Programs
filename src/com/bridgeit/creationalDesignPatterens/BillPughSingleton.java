/*
 * Purpose:-Implementation of Bill Pugh Singleton Pattern
 * 
 * @Author:-Arpana Kumari
 * Version:-1.0
 * @Since:-7 May, 2018
 */
package com.bridgeit.creationalDesignPatterens;

public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();

	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public static void main(String[] args) {
		System.out.println("Bill pugh singleton");
		System.out.println(SingletonHelper.INSTANCE);

	}

}
