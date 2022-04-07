package com.alex.zookeeper2;

public class GorillaTest {
	
	public static void main(String[]args) {
		Gorilla kerchak = new Gorilla();
		Bat dracula = new Bat();
		
		kerchak.displayEnergy();
		System.out.println("Kerchak's energy level is : " + kerchak.displayEnergy());
		kerchak.throwSomething();
		kerchak.throwSomething();
		kerchak.throwSomething();
		System.out.println("Kerchak threw a rock, energy level decreased to : " + kerchak.getEnergyLevel());
		kerchak.eatBanana();
		kerchak.eatBanana();
		System.out.println("Kerchak ate a banana, energy increased to : " + kerchak.getEnergyLevel());
		kerchak.climb();
		System.out.println("Kerchak just climbed a tree and now he is exhausted, energy decreased to : " + kerchak.getEnergyLevel());
		
		dracula.displayEnergy();
		System.out.println("Dracula's energy level is : " + dracula.displayEnergy());
		dracula.fly();
		dracula.fly();
		System.out.println("Dracula just took off, it's energy decreased to : " + dracula.displayEnergy());
		dracula.eatHumans();
		dracula.eatHumans();
		dracula.eatHumans();
		System.out.println("Dracula just ate a human, it's energy increased to : " + dracula.displayEnergy());
		dracula.attackTown();
		dracula.attackTown();
		dracula.attackTown();
		System.out.println("Dracula just set the town in fire, it's energy decreased to : " + dracula.displayEnergy());
	}

}
