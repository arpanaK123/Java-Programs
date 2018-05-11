/*
 * Purpose:-Write a Program DeckOfCards.java, to initialize deck of cards having suit 
 *         ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", 
 *         "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random method and then distribute
 *         9 Cards to 4 Players and Print the Cards the received by the 4 Players using 2D Array…
 *         
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-11 May,2018
 */
package com.bridgeit.DEckOfCards;

import com.bridgeit.utility.Utility;

public class DeckOfCards {

	public static void main(String[] args) {
 String  []suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
 
 String []ranks= {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
 
 String []array=Utility.deck(suits,ranks);
 System.out.println("Deck of Cards: ");
 System.out.println("--------------");
 
 for(int i=0;i<array.length;i++)
 {
	 System.out.print(array[i]+" ");
 }
 System.out.println();
Utility.distributeCard(array);
 
	}

} 
