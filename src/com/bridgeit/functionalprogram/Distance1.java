package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class Distance1 {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		/*System.out.println("enter value of " + x + "=" + args[0]);
		System.out.println("enter value of " + y + "=" + args[1]);
		double result = Math.sqrt(x * x + y * y);
		System.out.println("distance from the point " + " " + x + "  " + "and" + " " + y + "=" + result);*/
		Utility.calculateDistance(x,y);
	}
}
