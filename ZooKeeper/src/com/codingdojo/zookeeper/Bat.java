package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		super();
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Bat Flew!");
		this.energyLevel -= 50; 
	}
	
	public void eatHumans() {
		System.out.println("Bat ate a human!");
		this.energyLevel += 25; 
	}
	
	public void attackTown() {
		System.out.println("Bat attacked the town!");
		this.energyLevel -= 100; 
	}
}
