package com.s2rltx.jeudepoker.model;



public class Player {
	
	private String name;
	private int age;
	private Hand hand;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public Player() {
		this.name = " ";
		this.age= 43;
		this.hand = new Hand();
	}
	
	public void printHand() {
		// TODO Auto-generated method stub
		hand.print();
	}
	
	

}
