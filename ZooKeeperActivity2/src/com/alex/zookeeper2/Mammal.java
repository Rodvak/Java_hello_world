package com.alex.zookeeper2;
//Class
public class Mammal {
	// ---------------Member Variables.---------
	private int energyLevel;
	
	// ---------------Constructor---------------
	public Mammal() {
		
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	// ---------------Methods--------------------
	public int displayEnergy() {
		return this.energyLevel;
	}

	// ---------------Getters & Setters----------
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
