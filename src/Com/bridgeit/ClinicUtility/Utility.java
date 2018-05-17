package Com.bridgeit.ClinicUtility;

import java.util.Scanner;

public class Utility {
	Scanner scan = new Scanner(System.in);

	/**
	 * Take a integer type input from a scanner class
	 * 
	 * @return integer input
	 */
	public int inputInteger() {
		int input = scan.nextInt();
		return input;
	}

	/**
	 * Take a String type input from a Scanner class
	 * 
	 * @return String input
	 */
	public String inputSring() {
		String input = scan.next();
		return input;
	}

}
