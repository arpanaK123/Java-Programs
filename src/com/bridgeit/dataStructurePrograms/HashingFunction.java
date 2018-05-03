package com.bridgeit.dataStructurePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import com.bridgeit.utility.Utility;

public class HashingFunction {

	public static void main(String[] args) throws Exception {
		System.out.println("enter the size");
		int size = Utility.inputInteger();
		HashChain hs = new HashChain(size);

		FileReader file = new FileReader(
				"/home//bridgeit//Documents//workspace-sts-3.9.3.RELEASE//Java-Program//src//com//bridgeit//hashingfile//file.txt");

		BufferedReader br = new BufferedReader(file);
		String str = br.readLine();
		System.out.println("the files contains are:");
		System.out.println(str);

		String filestore = "";
		String readsfile;
		while ((readsfile = br.readLine()) != null) {
			readsfile = filestore + readsfile + " ";

		}
		br.close();
		for (String filestring : filestore.split("\\s", 0)) {
			int number = Integer.parseInt(filestring);
			HashChain.insert(number);
		}
		System.out.println("enter number to be searched");
		int search = Utility.inputInteger();

		HashChain.search(search);

		HashChain.display();
		HashChain.write();
	}

}
