/*
 *Purpose:-create a Player Object having Deck of Cards, and having ability to Sort by Rank and maintain the 
 *           cards in a Queue implemented using Linked List.
 *       
 *@Author:-Arpana Kumari
 * Version:1.0
 * @Since:-12 May 2018
 */
package com.bridgeit.DeckOfCardUsingQueue;

import java.util.LinkedList;

import com.bridgeit.dataStructurePrograms.Queue;
import com.bridgeit.utility.Utility;

public class DeckOfCard {

	public static void main(String[] args) {

		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		Queue1 queue = new Queue1(0);
		int indexOfDeck = 0;

		String[] array = Utility.deck(suits, ranks);
		System.out.println("Deck of Cards: ");
		System.out.println("--------------");
		for (int i = 0; i < 4; i++) {
			LinkedList<String> list = new LinkedList<String>();

			for (int j = 0; j < 9; j++) {
				list.add(array[indexOfDeck]);
				indexOfDeck++;
			}

			queue.enqueue(list);
		}
		queue.getData();
	}

}
