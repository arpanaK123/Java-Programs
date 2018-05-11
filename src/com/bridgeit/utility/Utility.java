package com.bridgeit.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONObject;

import com.bridgeit.dataStructurePrograms.LinkedQueue;
import com.bridgeit.dataStructurePrograms.LinkedStack;
import com.bridgeit.dataStructurePrograms.MyQueue;
import com.bridgeit.dataStructurePrograms.Node1;
import com.bridgeit.dataStructurePrograms.OrderedLinkedList;
import com.bridgeit.dataStructurePrograms.UnOrderedLinkedList;
import com.bridgeit.dataStructurePrograms.Queue;

@SuppressWarnings("unused")
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
		@SuppressWarnings("unused")
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

	/**
	 * Funtion of prime number
	 * 
	 * @param number:check
	 *            prime or not
	 */
	public static void primeNumber(int number) {
		int flag;
		for (int i = 2; i <= number; i++) {
			flag = 0;
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
		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {

			return true;
		} else
			return false;
	}

	/**
	 * Palindrome function
	 * 
	 * @param number:its
	 *            palindrome or not
	 * @return
	 */
	public static boolean primePalindrome(int number) {
		int sum = 0;
		int rem;
		int temp = number;
		while (number != 0) {
			rem = number % 10;
			sum = sum * 10 + rem;

			number = number / 10;

		}

		if (temp == sum) {
			// System.out.println(number);
			return true;
		}

		return false;

	}

	public static void primeAnagram(int[] prime) {
		int count = 0, anagramCount = 0;
		boolean z;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = checkEqual(prime[i], prime[j]);
				if (z && count == 0) {
					anagramCount++;
					count++;
					z = false;

				}
			}
			if (count > 0) {
				anagramCount++;
				count = 0;
			}
		}
		int[] anagramTotal = new int[anagramCount];
		int x = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = checkEqual(prime[i], prime[j]);
				if (z && count == 0) {
					anagramTotal[x] = prime[j];
					x++;
					count++;
					z = false;
				}
			}
			if (count > 0) {
				anagramTotal[x] = prime[i];
				x++;
				count = 0;
			}
		}
		System.out.println("*******");
		for (int i = 0; i < anagramTotal.length; i++) {
			for (int j = 0; j < anagramTotal.length - 1; j++) {
				if (anagramTotal[j] > anagramTotal[j + 1]) {
					int temp = anagramTotal[j];
					anagramTotal[j] = anagramTotal[j + 1];
					anagramTotal[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < anagramTotal.length; i++) {
			for (int j = 0; j < anagramTotal.length - 1; j++) {
				if (anagramTotal[j] == anagramTotal[j + 1]) {
					anagramTotal[j + 1] = -1;
				}
			}
		}
		for (int i = 0; i < anagramTotal.length; i++) {
			if (anagramTotal[i] != -1) {
				System.out.println(anagramTotal[i]);
			}
		}

	}

	public static boolean checkEqual(int value1, int value2) {
		String value1String = Integer.toString(value1);
		String value2String = Integer.toString(value2);
		char value1Array[] = value1String.toCharArray();
		char value2Array[] = value2String.toCharArray();
		value1String = arrangeAnagram(value1Array);
		value2String = arrangeAnagram(value2Array);
		return value1String.equals(value2String);

	}

	public static String arrangeAnagram(char[] item) {
		String arrangeItem = "";
		for (int i = 0; i < item.length; i++) {
			for (int j = 0; j < item.length - 1; j++) {
				if (item[j] > item[j + 1]) {
					char temp = item[j];
					item[j] = item[j + 1];
					item[j + 1] = temp;

				}
			}
		}
		for (int i = 0; i < item.length; i++) {
			arrangeItem = arrangeItem + item[i];

		}
		return arrangeItem;
	}

	/**
	 * takes input-integer function
	 * 
	 * @param size
	 * @return
	 */
	public static Integer[] integerInput(int size) {
		Integer[] array = new Integer[size];
		System.out.println("eneter array element");
		for (int i = 0; i <= size - 1; i++) {
			array[i] = Utility.inputInteger();
		}
		return array;
	}

	/**
	 * takes string input function
	 * 
	 * @param size
	 * @return
	 */
	public static String[] stringInput(int size) {
		String[] array = new String[size];
		System.out.println("enetr string element");
		for (int i = 0; i <= size - 1; i++) {
			array[i] = Utility.inputString();
		}
		return array;
	}

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
				array[j] = array[j - 1];

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
	 * @param item
	 * @return
	 */
	public static <T extends Comparable<T>> boolean binarySearch(T[] array, T item) {
		int low = 0;
		int high = array.length;
		while (low < high) {
			int mid = (low + high) / 2;
			if (array[mid].equals(item)) {
				return true;
			} else if (((array[mid]).compareTo(item)) < 0) {
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
			System.out.print(array[i] + " ");
		}

	}

	/**
	 * Find power range function
	 * 
	 * @param exponent
	 * @param number
	 * @return sum
	 */
	public static int rangePower(int exponent, int number) {
		int sum = 1;
		for (int i = 0; i < exponent; i++) {
			sum = sum * number;
		}
		// System.out.println(sum);
		return sum;

	}

	/**
	 * Your number find function
	 * 
	 * @param array
	 */
	public static void yourNumberFind(int[] array) {
		int low = 0;
		int high = array.length;
		int mid = (low + high) / 2;
		while (low < high) {
			System.out.println("you are between" + " " + low + " " + " and" + " " + (high - 1));
			System.out.println("enter true or false");
			boolean answer = Utility.inputBoolean();
			mid = (low + 1 + high) / 2;
			if (answer == true) {
				low = mid + 1;
			} else if (answer == false) {
				high = mid;
			}
		}
		System.out.println("your number is=" + " " + array[mid]);
	}

	/**
	 * merge Sort for String function
	 * 
	 * @param list
	 * @return sorted string
	 */
	public static String[] mergeSort(String[] list) {
		String[] sorted = new String[list.length];
		if (list.length == 1) {
			sorted = list;
		} else {
			int mid = list.length / 2;
			String[] left = null;
			String[] right = null;
			if ((list.length % 2) == 0) {
				left = new String[list.length / 2];
				right = new String[list.length / 2];
			} else {
				left = new String[list.length / 2];
				right = new String[(list.length / 2) + 1];
			}
			int x = 0;
			int y = 0;
			for (; x < mid; x++) {
				left[x] = list[x];
			}
			for (; x < list.length; x++) {
				right[y++] = list[x];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = mergeArray(left, right);
		}

		return sorted;
	}

	/**
	 * merge string function
	 * 
	 * @param left
	 * @param right
	 * @return merged string
	 */
	private static String[] mergeArray(String[] left, String[] right) {
		String[] merged = new String[left.length + right.length];
		int lIndex = 0;
		int rIndex = 0;
		int mIndex = 0;
		int comp = 0;
		while (lIndex < left.length || rIndex < right.length) {
			if (lIndex == left.length) {
				merged[mIndex++] = right[rIndex++];
			} else if (rIndex == right.length) {
				merged[mIndex++] = left[lIndex++];
			} else {
				comp = left[lIndex].compareTo(right[rIndex]);
				if (comp > 0) {
					merged[mIndex++] = right[rIndex++];
				} else if (comp < 0) {
					merged[mIndex++] = left[lIndex++];
				} else {
					merged[mIndex++] = left[lIndex++];
				}
			}
		}
		return merged;

	}

	/**
	 * Change how many notes
	 * 
	 * @param amount
	 */
	public static void amountChange(int amount) {
		int a, b, c, d, e, f, g, h;
		while (amount >= 1000) {
			h = amount / 1000;
			amount = amount % 1000;
			System.out.println("number of 1000 notes=  " + h);
		}
		while (amount >= 500) {
			a = amount / 500;
			amount = amount % 500;
			System.out.println("number of Rs 500 notes=" + " " + a);
			break;
		}
		while (amount >= 100) {
			b = amount / 100;
			amount = amount % 100;
			System.out.println("number of Rs 100 notes=" + " " + b);
			break;
		}
		while (amount >= 50) {
			c = amount / 50;
			amount = amount % 50;
			System.out.println("number of Rs 50 notes=" + " " + c);
			break;
		}
		while (amount >= 10)

		{
			d = amount / 10;
			amount = amount % 10;
			System.out.println("number of Rs 10 notes=" + " " + d);
			break;
		}
		while (amount >= 5) {
			e = amount / 5;
			amount = amount % 5;
			System.out.println("number of  Rs 5 notes=" + " " + e);
			break;
		}
		while (amount >= 2) {
			f = amount / 2;
			amount = amount % 2;
			System.out.println("number of Rs 2 notes=" + " " + f);
			break;
		}
		while (amount >= 1) {
			g = amount / 1;
			amount = amount % 1;
			System.out.println("number of Rs 1 notes=" + " " + g);
			break;
		}

	}

	/**
	 * find the day of calender
	 * 
	 * @param m:
	 *            month
	 * @param d:
	 *            day
	 * @param y:
	 *            year
	 * @return: day
	 */
	public static int calender(int m, int d, int y) {

		int y0 = y - (14 - m) / 12;

		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

		int m0 = m + 12 * ((14 - m) / 12) - 2;

		int d0 = (d + x + ((31 * m0) / 12)) % 7;

		return d0;
	}

	/**
	 * change into celsius to farenheit function
	 * 
	 * @param value
	 * @return
	 */
	public static double celsiusToFarenheit(double value) {
		return ((value * 9 / 5)) + 32;
	}

	/**
	 * change into Farenheit to celsius function
	 * 
	 * @param value
	 * @return
	 */
	public static double farenheitToCelsius(double value) {
		return (value - 32) * 5 / 9;
	}

	/**
	 * monthly payment function
	 * 
	 * @param P
	 * @param n
	 * @param r
	 * @return
	 */
	public static double paymentMonthly(double P, double n, double r) {
		return ((P * r) / 1 - 1 / powerDouble((1 + r), (n)));
	}

	/**
	 * @param number
	 * @param exponent
	 * @return
	 */
	private static double powerDouble(double number, double exponent) {
		double sum = 1;
		for (int i = 0; i < exponent; i++) {
			sum = sum * number;
		}
		return sum;
	}

	/**
	 * find the square root
	 * 
	 * @param c
	 */
	public static void sqrt(double c) {
		double t = c;
		double epsilon = 1e-15;

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}

		System.out.println(t);
	}

	/**
	 * change decimal number to binary number
	 * 
	 * @param number
	 * @return
	 */
	public static String toBinary(int number) {
		String temp = "";
		int rem;
		int count = 0;
		String printNumber = "";
		while (number != 0) {
			rem = number % 2;
			if (rem == 1) {
				int power = rangePower(count, 2);
				if ((number - 1) == 0)
					printNumber = printNumber + power + " ";
				else
					printNumber = printNumber + power + "+";

			}
			count++;
			temp = temp + rem;
			number = number / 2;

		}

		String reverse = "";
		char reverseArray[] = temp.toCharArray();
		for (int i = reverseArray.length - 1; i >= 0; i--) {
			reverse = reverse + reverseArray[i];
		}
		System.out.println(reverse);
		System.out.println("padding" + "=" + printNumber);

		return reverse;

	}

	/**
	 * @param number
	 * @return
	 */
	public static String swapNibble(String number) {
		char[] array = number.toCharArray();
		String swap = "";
		if (array.length < 8) {
			int count = 8 - array.length;
			while (count > 0) {
				swap = swap + "0";
				count--;
			}
		}
		for (int i = 0; i < array.length; i++) {
			swap = swap + array[i];

		}
		array = swap.toCharArray();
		swap = "";
		System.out.print(swap);
		for (int i = array.length / 2; i < array.length; i++) {
			swap = swap + array[i];
		}
		for (int i = 0; i < (array.length / 2); i++) {
			swap = swap + array[i];
		}
		return swap;

	}

	/**
	 * Function of convert binary to decimal
	 * 
	 * @param number
	 * @return:decimal number
	 */
	public static int binaryToDecimal(String number) {
		int sum = 0;
		int p = 0;
		for (int i = number.length() - 1; i >= 0; i--) {
			if (number.charAt(i) == '1') {
				sum = sum + rangePower(p, 2);
			}
			p++;

		}
		return sum;
	}

	/**
	 * Generic function for printWriter
	 * 
	 * @param file
	 * @param data
	 * @throws IOException
	 */
	public static <T extends Comparable<T>> void printWriter(File file, Comparable<?> data) throws IOException {
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		pw.print(data + " ");
		pw.close();
	}

	// public static

	/**
	 * function of Bank cash Counter
	 * 
	 * @param people:total
	 *            number of people
	 * @return: total cash
	 */
	public static int bankCashCounter(int people) {
		int cash = 100000;
		int testCase = people;
		MyQueue<Integer> queue = new MyQueue<Integer>(testCase);
		int choice = 0;
		for (int i = 0; i < testCase; i++)
			queue.enQueue(i);

		while (testCase > 0) {
			System.out.println("Bank amount=" + " " + cash);
			int count = 0;
			while (count == 0) {
				// while (testCase > 0) {
				System.out.println("press 1 for withdraw money");
				System.out.println("press 2 for Deposit money");
				System.out.println("enter your choice");
				choice = Utility.inputInteger();
				if (choice == 1 || choice == 2)
					count++;

			}
			if (choice == 1) {
				int amount = 0, withdrawAmount = 0;
				while (withdrawAmount == 0) {
					System.out.println("enter the amount");
					amount = Utility.inputInteger();

					if (amount > cash)
						System.out.println("your amount is invalid,plz come next");

					else
						cash = cash - amount;
					// System.out.println("after withdraw: ");
					// System.out.println("Bank amount=" + " " + cash);

					withdrawAmount++;
				}
				queue.deQueue();

				// queue.deQueue();
			} else if (choice == 2) {
				int amount = 0, depositAmount = 0;
				while (depositAmount == 0) {
					System.out.println("enter how much amount u want to deposit");
					amount = Utility.inputInteger();
					depositAmount++;
				}
				cash = cash + amount;
				// System.out.print("after deposit: ");
				// System.out.println("Bank amount=" + " " + cash);
				queue.deQueue();
			}
			testCase--;
			System.out.println("total people left " + testCase);
		}

		return cash;

	}

	/**
	 * Function of Palindrome Checker using Dequeue
	 * 
	 * @param word:check
	 *            palindrome or not
	 * @return: true or false
	 */
	public static boolean palindromeChecker(String word) {
		Queue<Character> queue = new Queue<Character>();
		char[] array = word.toCharArray();
		for (int i = 0; i < array.length; i++) {
			queue.addFront(array[i]);
		}

		String str = "";
		for (int i = 0; i < array.length; i++) {
			Node1<Character> ch = queue.removeFront();
			str = str + ch.data;
		}
		System.out.println(str);
		if (str.equals(word)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * find the prime in 2D array
	 */
	public static void prime2DArray() {

		int array[][] = new int[10][100];
		int[][] prime = new int[10][100];
		int count = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j] = count;
				count++;
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (prime(array[i][j])) {
					prime[i][j] = array[i][j];
				} else {
					prime[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (prime[i][j] != 0) {
					System.out.print(prime[i][j] + "   ");
				}
			}
			System.out.println();

		}

	}

	/**
	 * find prime anagram
	 * 
	 * @param number:
	 *            anagram number
	 */
	public static void primeAnagram2DArray(int[] prime) {

		boolean status, status1, status2;
		int k = 1;

		for (int i = 2; i < prime.length; i++) {
			for (int j = i + 1; j <= prime.length - 1; j++) {
				status = Utility.prime(i);
				status1 = Utility.prime(j);
				status2 = Utility.anagramCheck(i, j);
				if (status2 && status1 && status) {
					while (i > 100 && j > 100 && k == 1) {
						System.out.println();
						k = 0;
					}
					while (i > 200 && j > 200 && k == 0) {
						System.out.println();
						k = 2;
					}
					while (i > 300 && j > 300 && k == 12) {
						System.out.println();
						k = 3;
					}
					while (i > 400 && j > 400 && k == 3) {
						System.out.println();
						k = 4;
					}
					while (i > 500 && j > 500 && k == 4) {
						System.out.println();
						k = 5;
					}
					while (i > 600 && j > 600 && k == 5) {
						System.out.println();
						k = 6;
					}
					while (i > 700 && j > 700 && k == 6) {
						System.out.println();
						k = 7;
					}
					while (i > 800 && j > 800 && k == 7) {
						System.out.println();
						k = 8;
					}
					while (i > 900 && j > 900 && k == 8) {
						System.out.println();
						k = 9;
					}

					System.out.print(" " + i + " ");

					System.out.print(" " + j + " ");
				}
			}
		}
	}

	/**
	 * PRIME ANAGRAM 2D function
	 * 
	 * @param i
	 * @param j
	 * @return: string are anagram
	 */
	private static boolean anagramCheck(int i, int j) {

		String s1 = Integer.toString(i);

		String s2 = Integer.toString(j);
		char array1[] = s1.toCharArray();
		char array2[] = s2.toCharArray();
		s1 = arrange(array1);
		s2 = arrange(array2);
		return s1.equals(s2);
	}

	public static String arrange(char[] array) {
		String s = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					char temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			s = s + array[i];
		}
		return s;
	}

	/**
	 * Prime Anagram 2D-Array Function
	 * 
	 * @param prime:
	 *            check the prime Anagram
	 * @return
	 */
	public static void anagram2D(int prime[]) {

		int count = 0, countAnagram = 0;
		boolean b;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				b = anagramCheck(prime[i], prime[j]);
				if (b && count == 0) {
					countAnagram++;
					count++;
					b = false;
				}

			}
			if (count > 0) {
				countAnagram++;
				count = 0;
			}
		}
		int[] anagramArray = new int[countAnagram];
		int x = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				b = anagramCheck(prime[i], prime[j]);
				if (b && count == 0) {
					anagramArray[x] = prime[j];
					x++;
					count++;
					b = false;

				}
			}
			if (count > 0) {
				anagramArray[x] = prime[i];
				x++;
				count = 0;
			}
		}
		for (int i = 0; i < anagramArray.length; i++) {
			for (int j = 0; j < anagramArray.length - 1; j++) {
				if (anagramArray[j] > anagramArray[j + 1]) {
					int temp = anagramArray[j];
					anagramArray[j] = anagramArray[j + 1];
					anagramArray[j + 1] = temp;

				}
			}
		}
		for (int i = 0; i < anagramArray.length; i++) {
			for (int j = 0; j < anagramArray.length - 1; j++) {
				if (anagramArray[j] == anagramArray[j + 1]) {
					anagramArray[j + 1] = 0;
				}

			}
		}
		int position = 0;
		for (int i = 0; i < anagramArray.length; i++) {
			if (anagramArray[i] != 0) {
				position++;
			}
		}
		int[] array = new int[position + 1];
		int zz = 1;
		int yy = 0;
		for (int i = 0; i < anagramArray.length; i++) {
			if (anagramArray[i] != 0) {
				array[yy] = anagramArray[i];
				yy++;
			}
		}
		int total[][] = new int[10][100];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				total[i][j] = zz;
				zz++;
			}
		}
		int xx = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (array[xx] == total[i][j] && xx < array.length) {
					total[i][j] = array[xx];
					xx++;
				} else {
					total[i][j] = 0;
					// x++;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (total[i][j] != 0) {
					System.out.print(total[i][j] + "  ");

				}
			}
			System.out.println();

		}
	}

	// return true if the given year is a leap year
	public static boolean leapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		return false;
	}

	/**
	 * find the weekdays
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int day(int month, int day, int year) {
		int y0 = year - (14 - month) / 12;

		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

		int m0 = month + 12 * ((14 - month) / 12) - 2;

		int d0 = (day + x + ((31 * m0) / 12)) % 7;
		return d0;

	}

	/**
	 * Function to Print the calender
	 * 
	 * @param month
	 * @param year
	 */
	public static void calender1(int month, int year) {
		int day = 1;
		int year1 = year - (14 - month) / 12;

		int x = year1 + year1 / 4 - year / 100 + year / 400;

		int month1 = month + 12 * ((14 - month) / 12) - 2;

		int day1 = (day + x + ((31 * month1) / 12)) % 7;
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int monthday = 0;
		for (int i = 0; i < days.length; i++) {
			if (i == month - 1) {
				monthday = days[i];
			}
		}
		int[][] totalday = new int[6][7];
		boolean leap = Utility.leapYear(year);
		if (leap && month == 1) {
			monthday = 29;
		}

		int z = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < day1) {
					totalday[i][j] = -1;
				} else if (z <= monthday) {
					totalday[i][j] = z;
					z++;
				} else {
					totalday[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < 12; i++) {
			if (month == i + 1) {
				System.out.print(" " + months[i] + " " + year);
			}
		}
		System.out.println();

		String[] dayname = { "S", "M", "T", "W", "T", "F", "S" };
		for (int i = 0; i < 7; i++) {
			System.out.print(dayname[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (totalday[i][j] != -1) {
					if (totalday[i][j] < 10) {
						System.out.print(totalday[i][j] + "  ");
					} else
						System.out.print(totalday[i][j] + " ");
				} else {
					System.out.print("   ");

				}
			}
			System.out.println();
		}

	}

	/**
	 * Print the calender using Queue in 2D-Array
	 * 
	 * @param month
	 * @param year
	 * @return
	 */
	public static int[][] calenderQueue(int month, int year) {
		int day = 1;
		int year1 = year - (14 - month) / 12;

		int x = year1 + year1 / 4 - year / 100 + year / 400;

		int month1 = month + 12 * ((14 - month) / 12) - 2;

		int day1 = (day + x + ((31 * month1) / 12)) % 7;
		// System.out.println(day1);

		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] monthday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int monthDays = 0;
		for (int i = 0; i < monthday.length; i++) {
			if (i == month - 1) {
				monthDays = monthday[i];
				// System.out.println(monthDay);
			}
		}
		int[][] totalDay = new int[6][7];
		boolean result = Utility.leapYear(year);
		if (result && month == -1) {
			monthDays = 29;
		}
		int z = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < day1) {
					totalDay[i][j] = -1;
				} else if (z <= monthDays) {
					totalDay[i][j] = z;
					z++;
				} else {
					totalDay[i][j] = -1;
				}
			}

		}
		for (int i = 0; i < 12; i++) {
			if (month == i + 1) {
				System.out.println(monthName[i] + " " + year);
			}
		}
		System.out.println();
		return totalDay;
	}

	/**
	 * Find factorial of the given number
	 * 
	 * @param number:
	 *            find factorial
	 * @return: factorial number
	 */
	public static double findFactorial(double d) {
		double fact = 1;
		while (d != 0) {
			fact = fact * d;
			d--;
		}
		System.out.println(fact);
		return fact;
	}

	/**
	 * Find Binary Search Tree
	 * 
	 * @param nodes:find
	 *            number of nodes
	 * @return:total number of tree
	 */
	public static double binarySearchTree(double nodes) {
		double numerator = (findFactorial(2 * nodes));
		double denumerator = (findFactorial(nodes + 1)) * findFactorial(nodes);
		double tree = numerator / denumerator;
		return tree;
	}

	/**
	 * Prime anagram using stack
	 * 
	 * @param prime
	 */
	public static void primeAnagramLinkedStack(int[] prime) {

		int count = 0, countAnagram = 0;
		boolean b;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				b = anagramCheck(prime[i], prime[j]);
				if (b && count == 0) {
					countAnagram++;
					count++;
					b = false;
				}

			}
			if (count > 0) {
				countAnagram++;
				count = 0;
			}
		}
		int[] anagramArray = new int[countAnagram];
		int x = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				b = anagramCheck(prime[i], prime[j]);
				if (b && count == 0) {
					anagramArray[x] = prime[j];
					// System.out.println(anagramArray[x]);
					x++;
					count++;
					b = false;

				}
			}

			if (count > 0) {
				anagramArray[x] = prime[i];
				x++;
				count = 0;
			}
		}
		for (int i = 0; i < anagramArray.length; i++) {
			for (int j = 0; j < anagramArray.length - 1; j++) {
				if (anagramArray[j] > anagramArray[j + 1]) {
					int temp = anagramArray[j];
					anagramArray[j] = anagramArray[j + 1];
					anagramArray[j + 1] = temp;

				}
			}
		}
		for (int i = 0; i < anagramArray.length; i++) {
			for (int j = 0; j < anagramArray.length - 1; j++) {
				if (anagramArray[j] == anagramArray[j + 1]) {
					anagramArray[j + 1] = 0;
				}
				// System.out.println(anagramArray[j]);

			}
		}
		int position = 0;
		for (int i = 0; i < anagramArray.length; i++) {
			if (anagramArray[i] != 0) {
				position++;
			}
		}

		int[] array = new int[position + 1];
		@SuppressWarnings("unused")
		int zz = 1;
		int yy = 0;
		for (int i = 0; i < anagramArray.length; i++) {
			if (anagramArray[i] != 0) {
				array[yy] = anagramArray[i];
				// System.out.println(array[yy]);
				yy++;
			}

		}
		LinkedStack<Integer> l = new LinkedStack<Integer>();
		for (int i = 0; i < array.length - 1; i++) {
			l.add(array[i]);
		}
		l.display();
	}

	/**
	 * Prime Anagram using Queue
	 * 
	 * @param prime
	 */
	public static void primeAnagramLinkedQueue(int[] prime)

	{
		int count = 0, countAnagram = 0;
		boolean b;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				b = anagramCheck(prime[i], prime[j]);
				if (b && count == 0) {
					countAnagram++;
					count++;
					b = false;
				}

			}
			if (count > 0) {
				countAnagram++;
				count = 0;
			}
		}
		int[] anagramArray = new int[countAnagram];
		int x = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				b = anagramCheck(prime[i], prime[j]);
				if (b && count == 0) {
					anagramArray[x] = prime[j];
					x++;
					count++;
					b = false;

				}
			}

			if (count > 0) {
				anagramArray[x] = prime[i];
				x++;
				count = 0;
			}
		}
		for (int i = 0; i < anagramArray.length; i++) {
			for (int j = 0; j < anagramArray.length - 1; j++) {
				if (anagramArray[j] > anagramArray[j + 1]) {
					int temp = anagramArray[j];
					anagramArray[j] = anagramArray[j + 1];
					anagramArray[j + 1] = temp;

				}
			}
		}
		for (int i = 0; i < anagramArray.length; i++) {
			for (int j = 0; j < anagramArray.length - 1; j++) {
				if (anagramArray[j] == anagramArray[j + 1]) {
					anagramArray[j + 1] = 0;
				}

			}
		}
		int position = 0;
		for (int i = 0; i < anagramArray.length; i++) {
			if (anagramArray[i] != 0) {
				position++;
			}
		}

		int[] array = new int[position + 1];
		@SuppressWarnings("unused")
		int zz = 1;
		int yy = 0;
		for (int i = 0; i < anagramArray.length; i++) {
			if (anagramArray[i] != 0) {
				array[yy] = anagramArray[i];
				yy++;
			}

		}
		LinkedQueue<Integer> l = new LinkedQueue<Integer>();
		for (int i = 0; i < array.length - 1; i++) {
			l.add(array[i]);
		}
		l.display();
	}

	/**
	 * Ordered list function using Linked List
	 * 
	 * @param searchnum
	 * @throws Exception
	 */
	// public static void orderedList(String searchnum) throws Exception {
	// OrderedLinkedList<String> l = new OrderedLinkedList<String>();
	// File file = new File("ordered");
	// BufferedReader br = new BufferedReader(new FileReader(file));
	//
	// String str = "";
	// String stint;
	// while ((stint = br.readLine()) != null) {
	// str = str + stint + " ";
	// }
	// br.close();
	//
	// for (String filenum : str.split("\\s", 0)) {
	// l.add(filenum);
	// }
	// System.out.println("Before search");
	// l.display();
	// boolean result = l.search(searchnum);
	// if (result) {
	// l.remove(searchnum);
	// } else {
	// l.add(searchnum);
	// // insert(searchnum);
	// }
	// // sortFunction(searchnum);
	// System.out.println("***********");
	// System.out.println("after searching");
	// l.display();
	// l.write();
	// }
	//

	public static void unOrderedList(String number) throws IOException {
		UnOrderedLinkedList<String> l = new UnOrderedLinkedList<String>();
		File file = new File("ordered");
		BufferedReader br = new BufferedReader(new FileReader("unordered"));

		String str = "";
		String stint;
		while ((stint = br.readLine()) != null) {
			str = str + stint + " ";
		}
		br.close();

		for (String filenum : str.split("\\s", 0)) {
			l.add(filenum);
		}
		System.out.println("Before search");
		l.display();
		boolean result = l.search(number);
		if (result) {
			l.remove(number);
		} else {
			l.add(number);
			// insert(searchnum);
		}
		// sortFunction(searchnum);
		// System.out.println("***********");
		System.out.println("after searching");
		l.display();
		l.write();
	}

	// JSON Data Management

	/**
	 * Function of Regular Expression function to replace name
	 * 
	 * @param sentence
	 * @return
	 */
	public static String replaceFullName(String sentence) {
		System.out.println("enter new name");
		String newName = Utility.inputString();
		System.out.println("enter full name");
		String fullname = Utility.inputString();
		String replaceName = sentence.replaceAll("<<name>>", newName);

		String replaceFullName = replaceName.replaceAll("<<full name>>", fullname);

		Utility.replaceWithPattern(sentence, replaceFullName);

		return replaceFullName;
	}

	/**
	 * Function to replace mobile number
	 * 
	 * @param sentence
	 * @return
	 */
	public static String mobileNumber(String sentence) {
		System.out.println("enter your mobile number");
		String number = Utility.inputString();
		String replaceNumber = sentence.replaceAll("xxxxxxxxxx", number);

		Utility.replaceWithPattern(sentence, replaceNumber);

		return replaceNumber;
	}

	/**
	 * Function to change date to date
	 * 
	 * @param sentence
	 * @return
	 */
	public static String dateChange(String sentence) {
		System.out.println("enter the new date");
		String date = Utility.inputString();
		String rerplaceDate = sentence.replaceAll("10/05/2018", date);
		Utility.replaceWithPattern(sentence, rerplaceDate);

		return rerplaceDate;

	}

	/**
	 * Function of replace with pattern using regex
	 * 
	 * @param str
	 * @param replace
	 * @return
	 */
	public static String replaceWithPattern(String str, String replace) {

		Pattern ptn = Pattern.compile("\\s+");
		Matcher mtch = ptn.matcher(str);
		return mtch.replaceAll(replace);
	}

	/**
	 * Function of Deck Of Cards
	 * 
	 * @param suits
	 * @param ranks
	 * @return
	 */
	public static String[] deck(String[] suits, String[] ranks) {
		int n = suits.length * ranks.length;

		String[] deck = new String[n];

		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + " " + "of" + " " + suits[j];
			}
		}

		for (int i = 0; i < deck.length; i++) {
			int random = i + (int) Math.random() * (deck.length - 1);
			String temp = deck[random];
			deck[random] = deck[i];
			deck[i] = temp;
		}
		return deck;
	}

	/**
	 * function of distributeed card
	 * 
	 * @param deck
	 */
	public static void distributeCard(String[] deck) {
		int indexOfdeck = 0;
		String[][] cardDistribute = new String[4][9];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				cardDistribute[i][j] = deck[indexOfdeck];
				indexOfdeck++;
			}
		}

		for (int i = 0; i < 4; i++) {
			System.out.print("\n Player" + i + 1 + " : ");

			for (int j = 0; j < 9; j++) {
				System.out.print(cardDistribute[i][j] + " ");
			}
			System.out.println();
		}

	}

}
