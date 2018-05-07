/*
 * Purpose:-Implementation of Serialization and Singleton Pattern
 * 
 * @Author:-Arpana Kumari
 * Version:1.0
 * @Since:-7 May, 2018
 */
package com.bridgeit.creationalDesignPatterens;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable {
	public static Singleton instance = new Singleton();

	private Singleton() {
	}
}

public class SerializationSingleton {

	public static void main(String[] args) {

		try {
			Singleton instant = Singleton.instance;
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("serialization.txt"));
			out.writeObject(instant);
			out.close();
			ObjectInput in = new ObjectInputStream(new FileInputStream("serialization.txt"));
			Singleton instant2 = (Singleton) in.readObject();

			in.close();
			System.out.println("instanceOne hashCode=" + instant.hashCode());
			System.out.println("instanceTwo hashCode=" + instant2.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
