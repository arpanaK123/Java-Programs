package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class WindChill {

	public static void main(String[] args) {

		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);

		Utility.chillWind(t, v);
	}

}
