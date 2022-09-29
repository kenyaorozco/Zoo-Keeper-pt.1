package com.kenya.zookeeper1;

public class Mammal {
//	Member variable
	private int energyLevel;

// Create Constructor
	public Mammal() {
		this.energyLevel = 100;
	}

	// Get Energy Level
	public int getEnergyLevel() {
		return energyLevel;
	}

// Set Energy Level
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int displayEnergy() {

//		System.out.println(displayEnergy());
		return getEnergyLevel();
	}

}
