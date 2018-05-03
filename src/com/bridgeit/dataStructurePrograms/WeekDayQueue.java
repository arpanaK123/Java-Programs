/*
 * Purpose:-Create the Week Object having a list of WeekDay objects each storing the 
 *          day (i.e S,M,T,W,Th,..) and the Date (1,2,3..) . The WeekDay objects are
 *          stored in a Queue implemented using Linked List. Further maintain also a
 *          Week Object in a Queue to finally display the Calendar
 *
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-3 May, 2018
 */
package com.bridgeit.dataStructurePrograms;

import com.bridgeit.utility.Utility;

public class WeekDayQueue {

	public static void main(String[] args) {
		System.out.println("enter the month");
		int month = Utility.inputInteger();
		System.out.println("enter the year");
		int year = Utility.inputInteger();
		int[][] calender = Utility.calenderQueue(month, year);

		String[] days = { "S", "M", "T", "W", "T", "F", "S" };
		for (int i = 0; i < days.length; i++) {
			System.out.print(days[i] + "  ");
		}
		System.out.println();
		LinkedQueue<Integer> list[] = new LinkedQueue[6];
		for (int i = 0; i < 6; i++) {
			list[i] = new LinkedQueue();
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				list[i].add(calender[i][j]);

			}
		}
		for (int i = 0; i < 6; i++) {
			list[i].display();
		}
	}

}
