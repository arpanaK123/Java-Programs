package com.bridgeit.algorithmprogram;

import com.bridgeit.utility.Utility;

public class FindYourNumber {

	public static void main(String[] args) {
System.out.println("enter a number range");
int range=Integer.parseInt(args[0]);
int rangePower=(int) Utility.rangePower(range,2);
int array[]=new int[rangePower];
for(int  i=0;i<rangePower;i++)
{
	array[i]=i+1;
}

Utility.yourNumberFind(array);
	}

}
