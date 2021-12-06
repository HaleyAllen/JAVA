package com.codingdojo.zookeeper;

public class Gorilla extends Mammal{
	public Gorilla() {
		super();
	}
	
	public void thowSomething() {
		System.out.println("Gorilla threw somthing!");
		this.energyLevel -= 5; 
	}
	
	public void eatBananas() {
		System.out.println("Gorilla ate bananas!");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla climbed somthing!");
		this.energyLevel -= 10; 
	}

}
