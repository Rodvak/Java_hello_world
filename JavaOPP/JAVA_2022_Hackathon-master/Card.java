// package com.hackathon.dekofcards;

import java.util.HashMap;

public class Card {
	
	private String suit;
	private int rank;
	private String name;
	
    public Card(String suit, Integer rank) {
    	this.suit = suit;
    	this.rank = rank;
    	this.name = "";
    	
    	HashMap<Integer, String> names = new HashMap<Integer, String>();
        names.put(1, "Ace");
        names.put(11, "Jack");
        names.put(12, "Queen");
        names.put(13, "King");
            
            
        if (names.get(rank) != null) {
            this.name = names.get(rank);
        }
        else {
            this.name = Integer.toString(rank);
        }
    }

	public boolean compareTwoCards(Card card1, Card card2) {
		String[]array = new String[]{"Spades", "Hearts", "Dimonds", "Clubs"};
		if ( card1.getRank() < card2.getRank()) {
			return false;
		}
		else if (card1.getRank() == card2.getRank()){
			for (int i = 0; i < array.length; i++) {
				if (card1.getSuit() == array[i]) {
					return true;
				}
				if (card2.getSuit() == array[i]) {
					return false;
				}
			}
		}
		return true;
		
	}
         







    
    public void showCard() {
        System.out.printf("%s of %s\n", this.name, this.suit);
    }


	public String getSuit() {
		return suit;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
    
}
