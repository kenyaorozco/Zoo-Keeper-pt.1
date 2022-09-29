package com.kenya.zookeeper1;

public class GorillaTest {

	public static void main(String[] args) {

		Mammal animal1 = new Mammal();
		Gorilla monkey1 = new Gorilla();
		
		animal1.displayEnergy();
//		System.out.println(animal1.displayEnergy());
//		System.out.println("Threw something caused energy to go down: " + monkey1.throwSomething());
//		System.out.println("The monkey is statisfied with eating a banana: " + monkey1.eatBananas());
//		System.out.println("At the expense of climbing, energy went down by 10: " + monkey1.climb());

		monkey1.throwSomething();
		monkey1.throwSomething();
		monkey1.throwSomething();
		
		monkey1.eatBananas();
		monkey1.eatBananas();
		monkey1.climb();

		System.out.println("Overall energy: " + monkey1.displayEnergy());








	}

}
