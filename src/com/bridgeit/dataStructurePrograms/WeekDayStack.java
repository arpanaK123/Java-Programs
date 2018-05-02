package com.bridgeit.dataStructurePrograms;

import com.bridgeit.utility.Utility;

public class WeekDayStack {

	public static void main(String[] args) {
		System.out.println("enter the month");
		int month = Utility.inputInteger();
		System.out.println("enter the year");
		int year = Utility.inputInteger();
		int[][] calenderArray = Utility.calenderQueue(month, year);

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < days.length; i++) {
			// System.out.print(days[i]+" ");
		}
		
		
		System.out.println();
		LinkedStack<Integer> list[] = new LinkedStack[6];
		for (int i = 0; i < 6; i++) {
			list[i] = new LinkedStack();
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				list[i].add(calenderArray[i][j]);

			}
		}
		for (int i = 0; i < 6; i++) {
			list[i].display();
		}
	}

}
