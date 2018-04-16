package com.bridgeit.utility;

import java.util.Arrays;

import java.util.Scanner;

public class Utility {
	public Utility() {
	}

	public static Scanner scan = new Scanner(System.in);

	/*
	 * tskes a string input from the scanner class
	 * 
	 * @return string input
	 */

	public static String inputString() {
		{
			// take string type input from user
			String input = scan.next();
			// return that string
			return input;
		}

	}
	/*
	 * @takes a int input from a scanner class
	 * 
	 * @return int input
	 */

	public static int inputInteger() {
		// take integer type input from user
		int input = scan.nextInt();
		// return that input
		return input;
	}

	/*
	 * takes a boolean type input from ascanner class
	 * 
	 * @return boolean input
	 */
	public static boolean inputBoolean()

	{
		boolean input = scan.nextBoolean();
		return input;
	}

	/*
	 * Replaces a word from the given string
	 * 
	 * @param String: the string which has the word to be replaced
	 * 
	 * @param String: the word to replace with
	 * 
	 * @return String: the updated string
	 */
	public String replaceString(String string, String input) {

		string = string.replace("<<user name>>", input);
		System.out.println(string);

		return string;
	}

	// Flip Coin function
	// @param Integer: number of times you want to flip the coin
	public static void coinFlip(int times) {

		double heads = 0;

		double tails = 0;

		for (int i = 1; i <= times; i++) {

			double random = Math.random();

			if (random < 0.5) {

				tails++;
			} else {

				heads++;
			}

		}

		System.out.println("Percentage of HEADS" + " = " + " " + (heads / times) * 100 + "%");

		// print the percentage of tails
		System.out.println("Percentage of TAILS" + " = " + " " + (tails / times) * 100 + "%");

	}

	/*
	 * Leap Year Function
	 * 
	 * @param Integer: check the year is leap or not
	 */
	public static void yearCheck(int year) {

		boolean result = ((year % 4 == 0) && ((year % 100 == 0) && (year % 400 == 0)));

		if (result == true) {
			System.out.println(year + " " + "is leap year");
		} else {
			System.out.println(year + " " + "not leap year");
		}

	}

	// Power of Two Function

	// @param integer: print the table
	public static void poweroftwo(int number) {
		System.out.println("enter the range");
		int range = Utility.inputInteger();

		/*
		 * power as a variable name which has first value take as 1
		 */
		int power = 1;

		/*
		 * this loop start with i value is zero and it will end less than or equal to 31
		 */
		for (int i = 0; i <= range; i++) {

			/*
			 * whatever the previous value of power it will multiply with 2 and collect the
			 * result as a variable name power
			 */
			power = power * 2;

			// print the table of power of two
			System.out.println("2^" + i + " =" + power);

		}
	}

	// Harmonic Series function

	// @para taken from the main class
	public static void harmonicSeries(int number) {

		double sum = 0;
		for (int i = 1; i <= number; i++) {
			System.out.print("1/" + i + "+");
			sum = sum + (double) 1 / i;
		}
		System.out.println();
		System.out.println("sum of Harmonic series=" + " " + sum);
	}

	// Prime Factor Function

	// @para taken from the main class
	public static void primeFactor(int number) {
		System.out.println("prime factor of " + " " + number + "  " + "is:=");
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				number = number / 2;
				System.out.print(i + " ");
			}
		}
	}
	// *//

	// Gambler Function
	// @para taken the three integer type from th emain class
	public static void gambler(int number, int stake, int goal) {
		int win = 0;
		int bets = 0;
		for (int i = 1; i < number; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;// loss increment
				if (Math.random() < 0.5) {
					cash++;// cash increment
				} else {
					cash--;// cash decrement
				}
			}
			if (cash == goal) {
				win++;// win increment

			}

		}
		System.out.println("Win percentage is" + "=" + (win / number) * 100);
		System.out.println("Loss Percentage is" + " =" + (bets / number) * 100);
	}

	// Two-D Array Function
	/*
	 * @para takes from the main class TwoDarray
	 */
	public static void integerArray(int rows, int columns, int[][] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = 0; j <= array.length - 1; j++) {
				System.out.println("enter " + " " + i + " " + j + " " + "elements");
				array[i][j] = Utility.inputInteger();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	/*
	 * @para takes from the main class vTwoDarray
	 */
	public static void doubleArray(int rows, int columns, double[][] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = 0; j <= array.length - 1; j++) {
				System.out.println("enter " + " " + i + " " + j + " " + "elements");
				array[i][j] = Utility.inputInteger();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	/*
	 * @para takes from the main class TwoDarray
	 */
	public static void booleanArray(int rows, int columns, boolean[][] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = 0; j <= array.length - 1; j++) {
				System.out.println("enter " + " " + i + " " + j + " " + "elements");
				array[i][j] = Utility.inputBoolean();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	// Sum of Three Integer adds to zero

	/*
	 * @para takes from the main class
	 */
	public static void sumOfThreeZero(int array[], int length) {
		boolean flag = true;
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.print(array[i] + " ");

						System.out.print(array[j] + " ");
						System.out.print(array[k]);
						System.out.println();
						flag = true;
					}
				}
			}
		}

		if (flag == false) {
			System.out.println("sum of zero does not exit");
		}

	}

	public static void numberCoupon(int number)

	{
		int count = 0;
		for (int i = 1; i <= number; i++) {
			while (number != 0) {
				double random = Math.random();
				if (random == number) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	// Distance function
	// @para takes from the main class
	/*
	 * public static void calculateDistance(int x,int y) {
	 * System.out.println("enter value of x" + x + "=")+x;
	 * System.out.println("enter value of " + y + "=" + args[1]); double result =
	 * Math.sqrt(x * x + y * y); System.out.println("distance from the point " + " "
	 * + x + "  " + "and" + " " + y + "=" + result); }
	 */

	// Wind Chill Function

	public static void chillWind(double t, double v) {
		System.out.println("temperature=" + " " + t);
		System.out.println("wind speed=" + " " + v);
		double w = (35.74 + (0.62512 * t) + (0.4275 * t)) * Math.pow(v, 0.16);
		System.out.println("wind chill=" + " " + w);
	}

	// *** ALGORITHM PROGRAM ***//

	// Binary Search Function

	public int binarysearch(int array[], int n, int low, int high, int key) {
		int mid;
		for (int i = 0; i <= n - 1; i++) {
			while (low <= high) {
				mid = (low + high) / 2;

				if (key == array[mid]) {
					return mid;
				} else if (key > array[mid]) {
					low = mid + 1;
					high = high;
				} else {
					low = low;
					high = mid - 1;
				}

			}
		}
		return 0;
	}

	// Anagram function

	/*
	 * @para taken two string type from main class
	 */
	public static void compareString(String words1, String words2) {
		/*
		 * replaceAll() method remove the space from the words1 and give it to variable
		 * name as words1
		 */
		words1 = words1.replaceAll("\\s", " ");
		/*
		 * replaceAll() method remove the space from the words2 and give it to variable
		 * name as words2
		 */
		words2 = words2.replaceAll("\\s", " ");

		/*
		 * compare the length using length() method length is not equal
		 */
		if (words1.length() != words2.length()) {
			System.out.println("String are not anagram");
		} else {

			/*
			 * give to the one standard form using toLowerCase() and collect it in variable
			 * name as words1 & words2
			 */
			words1 = words1.toLowerCase();
			words2 = words2.toLowerCase();

			/*
			 * create character array and convert the string using toCharArray() and collect
			 * it in variable array1 and array2
			 */
			char array1[] = words1.toCharArray();
			char array2[] = words2.toCharArray();

			/*
			 * Arrays.sort() method sort the character array
			 */
			Arrays.sort(array1);
			Arrays.sort(array2);

			/*
			 * using equals() method compare the character it is equals or not and result
			 * collect in to the boolean type variable name as result
			 */
			boolean result = Arrays.equals(array1, array2);

			if (result == true) {
				System.out.println("strings are anagram");
			} else {
				System.out.println("strings are not anagram");
			}
		}
	}

	// Find The Prime Number in Range Function

	// @para taken from the main class
	public static void primenumber(int number) {
		// loop start from 2 and it will goes less than number
		for (int i = 2; i < number; i++) {
			int flag = 0;
			for (int j = 2; j < i; j++) {
				/*
				 * remainder equals zero controls come out to loop
				 */
				if (i % j == 0) {
					flag = 1;
				}
			}

			/*
			 * remainder not equals zero print the value of i
			 */
			if (flag == 0) {
				// print the value
				System.out.print(i + " ");
			}
		}
	}

}