package com.bridgeit.utility;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	public Utility() {

	}

	public static Scanner scan = new Scanner(System.in);
	static Random random = new Random();

	/**
	 * DOUBLE type function
	 * 
	 * @return input
	 */
	public static double inputDouble() {
		double input = scan.nextDouble();
		return input;
	}

	/**
	 * generated random number with bound
	 * 
	 * @param bound
	 * @return generated random number
	 */
	public static int randomNumber(int number) {
		return random.nextInt(number);
	}

	/**
	 * generated random number without bound
	 * 
	 * @param size
	 * @return generated random number
	 */
	public static int inputRandom(int size) {
		return random.nextInt();
	}

	/**
	 * takes a string input from the scanner class
	 * 
	 * @return string input
	 */
	public static String inputString() {
		{
			String input = scan.next();
			return input;
		}

	}

	/**
	 * @return input
	 */
	public static String inputString1() {
		String input = scan.nextLine();
		return input;
	}

	/**
	 * @takes a int input from a scanner class
	 * @return int input
	 */
	public static int inputInteger() {
		int input = scan.nextInt();
		return input;
	}

	/**
	 * takes a boolean type input from a scanner class
	 * 
	 * @return boolean input
	 */
	public static boolean inputBoolean()

	{
		boolean input = scan.nextBoolean();
		return input;
	}

	/**
	 * Replaces a word from the given string
	 * 
	 * @param string:
	 *            the string which has the word to be replaced
	 * @param string:
	 *            the word to replace with
	 * @param input:
	 *            the updated string
	 * @return
	 */
	public String replaceString(String string, String input) {

		string = string.replace("<<user name>>", input);
		System.out.println(string);

		return string;
	}

	/**
	 * Flip Coin function
	 * 
	 * @param times:
	 *            number of times you want to flip the coin
	 */
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

		System.out.println("Percentage of TAILS" + " = " + " " + (tails / times) * 100 + "%");

	}

	/**
	 * Leap Year Function
	 * 
	 * @param year:
	 *            check the year is leap or not
	 */
	public static void yearCheck(int year) {

		boolean result = ((year % 4 == 0) && ((year % 100 == 0) && (year % 400 == 0)));

		if (result == true) {
			System.out.println(year + " " + "is leap year");
		} else {
			System.out.println(year + " " + "not leap year");
		}

	}

	/**
	 * Power of Two Function
	 * 
	 * @param number:
	 *            print the table
	 */
	public static void poweroftwo(int number) {
		System.out.println("enter the range");
		int range = Utility.inputInteger();
		int power = 1;

		for (int i = 0; i <= range; i++) {

			power = power * 2;

			System.out.println("2^" + i + " =" + power);

		}
	}

	/**
	 * Harmonic Series function
	 * 
	 * @param number:print
	 *            the sum of harmonic series
	 */
	public static void harmonicSeries(int number) {

		double sum = 0;
		for (int i = 1; i <= number; i++) {
			System.out.print("1/" + i + "+");
			sum = sum + (double) 1 / i;
		}
		System.out.println();
		System.out.println("sum of Harmonic series=" + " " + sum);
	}

	/**
	 * Prime Factor Function
	 * 
	 * @param number:
	 *            find the prime factor
	 */
	public static void primeFactor(int number) {
		System.out.println("prime factor of " + " " + number + "  " + "is:=");
		int i = 2;
		while (i <= number) {
			if (number % i == 0) {
				System.out.print(i + " ");
				number = number / i;

			} else if (number % i != 0) {
				i++;
			}
		}
	}

	/**
	 * Gambler Function
	 * 
	 * @param number
	 * @param stake
	 * @param goal
	 */
	public static void gambler(int number, int stake, int goal) {
		double win = 0;
		double bets = 0;
		double loss = 0;
		for (int i = 1; i <= number; i++) {
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

			} else {
				loss++;
			}

		}
		System.out.println("Win percentage is" + "=" + (win / number) * 100);
		System.out.println("Loss Percentage is" + " =" + (loss / number) * 100);
	}

	// static printwriter,using it all the different 2D-Array

	static PrintWriter printWriter = new PrintWriter(System.out, true);

	/**
	 * GENERIC print array function
	 * 
	 * @param array
	 * @param row
	 * @param column
	 */
	public static <T> void printArray(T[][] array, int row, int column) {
		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j <= column - 1; j++) {
				printWriter.print(array[i][j] + " ");

			}
			printWriter.println();
		}
	}

	/**
	 * Two-D INTEGER Array Function
	 */

	public static void integerArray() {
		printWriter.println("enter the number of rows");
		int row = Utility.inputInteger();
		printWriter.println("enter the number of columns");
		int column = Utility.inputInteger();
		Integer[][] array = new Integer[row][column];
		printWriter.println(
				"enter" + " " + row + "  " + "row " + " " + "and" + " " + column + " " + "column" + "  " + " value");
		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j <= column - 1; j++) {
				array[i][j] = Utility.inputInteger();
			}
		}
		printArray(array, row, column);
	}

	/**
	 * Two-D double array function
	 */
	public static void doubleArray() {
		printWriter.println("enter the number of rows");
		int row = Utility.inputInteger();
		printWriter.println("enter the number of columns");
		int column = Utility.inputInteger();
		Double[][] array = new Double[row][column];
		printWriter.println("enter" + (row * column) + "integer array value");
		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j <= column - 1; j++) {
				array[i][j] = Utility.inputDouble();
			}
		}
		printArray(array, row, column);
	}

	/**
	 * Two-D boolean array function
	 */
	public static void booleanArray() {

		printWriter.println("enter the number of rows");
		int row = Utility.inputInteger();
		printWriter.println("enter the number of columns");
		int column = Utility.inputInteger();
		Boolean[][] array = new Boolean[row][column];
		printWriter.println("enter" + (row * column) + "integer array value");
		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j <= column - 1; j++) {
				array[i][j] = Utility.inputBoolean();
			}
		}
		printArray(array, row, column);
	}

	/**
	 * Sum of Three Integer adds to zero
	 * 
	 * @param array:to
	 *            be ckecked its sum of 3-integer are 0 or not
	 * @param length:takes
	 *            array length
	 */
	public static void sumOfThreeZero(int array[], int length) {
		boolean flag = true;
		int count = 0;
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.print(array[i] + " ");

						System.out.print(array[j] + " ");
						System.out.print(array[k]);
						System.out.println();
						count++;
						flag = true;
					}
				}
			}
		}
		System.out.println("total count sum of three integer zero=" + count);

		if (flag == false) {
			System.out.println("sum of zero does not exit");
		}

	}

	/**
	 * Distance function
	 * 
	 * @param x:value
	 *            of first argument
	 * @param y:
	 *            value of second arguments
	 */
	public static void calculateDistance(int x, int y) {
		System.out.println("enter value of x" + "=" + x);
		System.out.println("enter value of " + "=" + y);
		double result = Math.sqrt(x * x + y * y);
		System.out.println("distance from the point " + " " + x + "  " + "and" + " " + y + "=" + result);
	}

	/**
	 * Wind Chill Function
	 * 
	 * @param t:temperature
	 *            of wind
	 * @param v:speed
	 *            of wind
	 * @return
	 */
	public static double chillWind(double t, double v) {
		double w = (35.74 + (0.62512 * t) + (0.4275 * t)) * Math.pow(v, 0.16);
		System.out.println("wind chill=" + " " + w);
		return w;
	}

	/**
	 * QUADRATIC EQUATION FUNCTION
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void findQuadraticNumber(int a, int b, int c) {
		int delta;
		double root1;
		double root2;
		System.out.println("roots of the equation=" + a + "x^2+" + b + "x+" + c);

		delta = b * b - 4 * a * c;
		System.out.println("delta=" + " " + delta);

		if (delta > 0) {
			System.out.println("roots are equal and real");
			root1 = (-b + (Math.sqrt(delta)) / (2 * a));
			System.out.println("root of x1=" + root1);

			System.out.println("roots are equal and real");
			root2 = (-b - (Math.sqrt(delta)) / (2 * a));
			System.out.println("roots of x2=" + root2);
		} else {
			System.out.println("roots are imaginary");
		}

	}

	/**
	 * PERMUTATION FUNCTION
	 * 
	 * @param string:to
	 *            print permutation
	 * @param lowindex
	 * @param highindex
	 */
	public static void permute(String str, int lowindex, int highindex) {
		if (lowindex == highindex)
			System.out.println(str);
		else {
			for (int i = lowindex; i <= highindex; i++) {
				str = swap(str, lowindex, i);
				permute(str, lowindex + 1, highindex);
				str = swap(str, lowindex, i);
			}
		}
	}

	/**
	 * SWAP FUNCTION
	 * 
	 * @param string
	 * @param i:position
	 *            1
	 * @param j:position
	 *            2
	 * @return"string
	 */
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * Coupon number function
	 * 
	 * @param size:take
	 *            size of coupon number
	 * @return:count random coupon number
	 */
	public static int findCoupon(int size) {
		int count = 0;
		int randomNumber = 0;
		int random = 0;
		int array[] = new int[size];

		while (randomNumber < size) {
			if (random == 0) {
				array[randomNumber] = randomNumber(size) + 1;
				count++;
			} else {
				int y = 0;
				while (y == 0) {
					random = inputRandom(size) + 1;
					count++;
					int x = 0;
					for (int i = 0; i <= randomNumber - 1; i++) {
						if (array[i] == random) {
							x++;
						}
					}
					if (x == 0) {
						array[randomNumber] = random;
						y++;
					}
				}
			}
			randomNumber++;
		}
		for (int i = 0; i <= size - 1; i++) {
			System.out.println(array[i]);
		}

		return count;

	}

	// *** ALGORITHM PROGRAM ***//

	/**
	 * Binary Search Function
	 * 
	 * @param array
	 * @param n
	 * @param low
	 * @param high
	 * @param key
	 * @return
	 */
	public static int binarysearch(int array[], int low, int high, int key) {
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;

			if (key == array[mid]) {
				return mid;
			} else if (key > array[mid]) {
				low = mid + 1;
				high = high;
			} else {

				high = mid - 1;
				low = low;
			}
		}

		return 0;

	}

	/**
	 * Anagram function
	 * 
	 * @param words1:
	 * @param words2
	 */
	public static void compareString(String words1, String words2) {

		words1 = words1.replaceAll("\\s", "");

		words2 = words2.replaceAll("\\s", "");

		boolean result = true;
		if (words1.length() != words2.length()) {
			System.out.println("String are not anagram");
			result = false;
		} else {

			words1 = words1.toLowerCase();
			words2 = words2.toLowerCase();

			char array1[] = words1.toCharArray();
			char array2[] = words2.toCharArray();

			Arrays.sort(array1);
			Arrays.sort(array2);

			Arrays.equals(array1, array2);

			if (result == true) {
				System.out.println("strings are anagram");
			} else {
				System.out.println("strings are not anagram");
			}
		}
	}

	public static void primeNumber(int number) {
		int flag ;
		for (int i = 2; i <= number; i++) {
			flag=0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(i + " ");
			}
		}
	}

	/**
	 * PRIME NUMBER FUNCTION
	 * 
	 * @param number
	 * @return
	 */
	public static boolean prime(int number) {
		int flag = 0;
		for (int i = 2; i <= number - 1; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {

				System.out.print(i + " ");
				// return true;
			}
		}
		return false;
	}

	public static boolean primePalindrome(int number) {
		int sum = 0;
		int rem = 0;
		int num = number;
		while (number != 0) {
			rem = rem % 10;
			sum = sum * 10 + rem;
			number = number / 10;

		}
		if (num == sum) {
			return true;
		} else
			return false;

	}

	public static void primeAnagram(int[] prime) {

	}

	// public static void insertionSort(int array[], int size) {
	// int item, j;
	// for (int i = 1; i <= size - 1; i++) {
	// item = array[i];
	// j = i + 1;
	//
	// while (j >= 0 && array[j] > item) {
	// array[j + 1] = array[j];
	// j--;
	// }
	// array[j + 1] = item;
	// }
	// }

	/**
	 * Generic function of INSERTION SORT
	 * 
	 * @param array
	 * @return array
	 */
	public static <T extends Comparable<T>> T[] insertionSort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			T ne = array[i];
			int j;
			for (j = i; j > 0 && (array[j - 1].compareTo(ne)) > 0; j--) {
				array[i] = array[j - 1];

			}
			array[j] = ne;
		}
		return array;
	}

	/**
	 * generic function of bubble sort
	 * 
	 * @param array
	 * @return
	 */
	public static <T extends Comparable<T>> T[] bubbleSort(T[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					T temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;

				}
			}
		}
		return array;
	}

	/**
	 * generic functiom of binary search
	 * 
	 * @param array
	 * @param value
	 * @return
	 */
	public static <t extends Comparable<t>, T> boolean binarySearch(T[] array, String value) {
		int low = 0;
		int high = array.length;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid].equals(value)) {
				return true;
			} else if ((((String) array[mid]).compareTo((String) value)) < 0) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return false;
	}

	/**
	 * generic function of display array
	 * 
	 * @param array
	 * @param size
	 */
	public static <t> void arrayDisplay(t array[], int size) {
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i] + " ");
		}

	}

}