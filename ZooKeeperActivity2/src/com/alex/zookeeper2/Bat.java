package com.alex.zookeeper2;
class Bat extends Mammal {
	
	// ---------------Constructor---------------	
	public Bat() {
		super(300);
	}
	
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	
	// ---------------Methods--------------------
	public void fly() {
		this.setEnergyLevel(getEnergyLevel()-20);
		
	}
	
	public void eatHumans() {
		this.setEnergyLevel(getEnergyLevel()+25);
		
	}
	
	public void attackTown() {
		this.setEnergyLevel(getEnergyLevel()-100);
	}

}
