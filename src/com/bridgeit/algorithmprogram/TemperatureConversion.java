/*
 * Purpose:-given the temperature in fahrenheit as input outputs the 
 *         temperature in Celsius or viceversa using the formula
 *         Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
 *          Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
 *          
 * @Author:-Arpana kumari
 * version:-1.0
 * @Since:-20 April, 2018 
 */
package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {

		System.out.println("press 1 to change Celsius to Farenheit");
		System.out.println("press 2 to change Farenheit to Celsius");
		System.out.println("enter your choice");
		int choice = Utility.inputInteger();

		switch (choice) {
		case 1: {
			System.out.println("enter the celsius value");
			double value = Utility.inputDouble();
			double result = Utility.celsiusToFarenheit(value);
			System.out.println("the celsius to farenheit value is=" + " " + result);
			break;
		}

		case 2: {
			System.out.println("enter the farenheit value");
			double value = Utility.inputDouble();
			double result = Utility.farenheitToCelsius(value);
			System.out.println("the farenheit to celsius value is=" + " " + result);
		}
		}
	}

}
