/*
 * Purpose:-Write a static function sqrt  to compute the square root
 *          of a nonnegative number c given in the input using Newton's method:
 *          
 *@Author:-Arpana kumari
 *version:-1.0
 *@since:-20 April, 2018          
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
		double c = Double.parseDouble(args[0]);

		Utility.sqrt(c);
	}
}
