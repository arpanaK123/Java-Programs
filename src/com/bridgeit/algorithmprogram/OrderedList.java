package com.bridgeit.algorithmprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class OrderedList {

	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader(
				"//home//bridgeit//Documents//workspace-sts-3.9.3.RELEASE//Java-Program//src//com//bridgeit//ordered.txt");

		BufferedReader br = new BufferedReader(file);
		String str = br.readLine();
		System.out.println("the files contains are:");
		System.out.println(str);

	}

}
