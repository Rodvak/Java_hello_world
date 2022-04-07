package com.alex.zookeeper2;

public class GorillaTest {
	
	public static void main(String[]args) {
		Gorilla kerchak = new Gorilla(100);
		
		kerchak.displayEnergy();
		System.out.println("Kerchak's energy level is : " + kerchak.displayEnergy());
		kerchak.throwSomething();
		kerchak.throwSomething();
		kerchak.throwSomething();
		System.out.println("Kerchak threw a rock, energy level decreased to : " + kerchak.getEnergyLevel());
		kerchak.eatBanana();
		kerchak.eatBanana();
		System.out.println("Kerchak ate a banana, energy increased by : " + kerchak.getEnergyLevel());
		kerchak.climb();
		System.out.println("Kerchak just climbed a tree and now he is exhausted, energy decreased by: " + kerchak.getEnergyLevel());
		
	}

}
