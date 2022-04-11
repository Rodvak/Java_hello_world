package com.alex.zookeeper2;
class Gorilla extends Mammal {
	
	// ---------------Constructor---------------
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public Gorilla() {
		super(100);
	}

	// ---------------Methods--------------------
	public void throwSomething() {
		this.setEnergyLevel(getEnergyLevel()-5);
	}
	
	public void eatBanana() {
		this.setEnergyLevel(getEnergyLevel()+10);
	}
	
	public void climb() {
		this.setEnergyLevel(getEnergyLevel()-10);
	}

}
