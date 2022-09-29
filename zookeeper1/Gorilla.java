package com.kenya.zookeeper1;

public class Gorilla extends Mammal {
	
//	Constructor will instantiate our gorilla class
	public Gorilla() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	public void throwSomething() {
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("Throwing makes energy go down by 5: " + getEnergyLevel());

	}

	public void eatBananas() {
		 setEnergyLevel(getEnergyLevel() + 10);
			System.out.println("Eating makes energy go up by 10: " + getEnergyLevel());



	}

	public void climb() {
		setEnergyLevel(getEnergyLevel() - 10);
		System.out.println("Climbing makes energy go down by 10: " + getEnergyLevel());

	}

}
