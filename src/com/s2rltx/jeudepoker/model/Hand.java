/**
 * 
 */
package com.s2rltx.jeudepoker.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stéphanie
 *
 */
public class Hand implements Printable{

	private List<Card> cards;

	

	public List<Card> getCards() {
		return cards;
	}


	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public Hand() {
		this.cards = new ArrayList<Card>();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (Card card :cards) {
			card.print();
		}
	}
	
	
}
