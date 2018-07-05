/**
 * 
 */
package com.s2rltx.jeudepoker.model;

/**
 * @author St�phanie
 *
 */
public class Card implements Printable {
	
	private CardValue value;
	private Family family;
	
	public Card(CardValue value, Family family) {
		super();
		this.value = value;
		this.family = family;
	}
	
	
	
	public CardValue getValue() {
		return value;
	}

	//public void setValue(CardValue value) {
	//	this.value = value;
	//}



	public Family getFamily() {
		return family;
	}



	//public void setFamily(Family family) {
		//this.family = family;
	//}



	@Override
	public void print(){
		System.out.println(String.format(family.getRepresentation(), value.getRepresentationLeft(), value.getRepresentationRight()));	
	}
	
	@Override
	public String toString(){
		return value.toString()+" de "+family.toString();
	}
}
