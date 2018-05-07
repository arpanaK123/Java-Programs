/*
 * Purpose:-Create the Week Object having a list of WeekDay objects each storing the day (i.e S,M,T,W,Th,..)
 *          and the Date (1,2,3..) .store the Queue in two Stacks. Stack here is also
 *          implemented using Linked List,finally display the Calendar
 *          
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-3 May, 2018
 */
package com.bridgeit.dataStructurePrograms;

import com.bridgeit.utility.Utility;

public class WeekDayStack {

	public static void main(String[] args) {
		System.out.println("enter the month");
		int month = Utility.inputInteger();
		System.out.println("enter the year");
		int year = Utility.inputInteger();
		int[][] calender = Utility.calenderQueue(month, year);
		String[] days = { "S", "M", "T", "W", "T", "F", "S" };

		for (int i = 0; i < days.length; i++)
			System.out.print(days[i] + "  ");

		System.out.println();
		LinkedStack<Integer> list = new LinkedStack<>();

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				list.add(calender[i][j]);

			}
		}
		StackLinkedCalender<Integer> l = new StackLinkedCalender<>();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				Integer temp = list.pop();
				l.add(temp);
			}
		}
		l.display();
	}

}
