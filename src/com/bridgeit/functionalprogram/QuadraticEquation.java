/*
 * Purpose:=Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. 
 * delta = b*b - 4*a*c
 * Root 1 of x = (-b + sqrt(delta))/(2*a)
 * Root 2 of x = (-b - sqrt(delta))/(2*a)
 * Take a, b and c as input values to find the roots of x.
 *
 * @Author:-Arpana kumari
 * 
 * Version:-1.0
 * @Since:-17 April, 2018
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class QuadraticEquation {

	public static void main(String[] args) {
		System.out.println("given quadratic equation"+" "+"a*x*x+b*x+c");

		System.out.println("enter the value of a");
		int a=Utility.inputInteger();
		System.out.println("enter the value of b");
		int b=Utility.inputInteger();
		System.out.println("enter the value of c");
		int c=Utility.inputInteger();
		Utility.findQuadraticNumber( a, b, c);
		
	}

}
