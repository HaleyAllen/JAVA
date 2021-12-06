package com.codingdojo.zookeeper;

public class Mammal {
	protected int energyLevel;
	protected static int mammalCount;
	

	public Mammal() {
		this.energyLevel = 100;
		mammalCount++;
	}
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + this.energyLevel);
		return energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public static int getMammalCount() {
		return mammalCount;
	}
	
	public static void setMammalCount(int mammalCount) {
		Mammal.mammalCount = mammalCount;
	}
}
 