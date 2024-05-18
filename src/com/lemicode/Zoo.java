package com.lemicode;

public class Zoo {

	private static final int MAX_ANIMALS = 10;
	private Animal [] animals;
	private int count;
	
	public Zoo() {
		animals = new Animal[MAX_ANIMALS];
		count = 0;
	}
	
	public void addAnimal(Animal animal) {
		if (count < MAX_ANIMALS) {
			animals[count] = animal;
			count++;
		} else {
			System.out.println("動物園はいっぱいです！");
		}
	}
	
	public void displayAnimals() {
		for(int i = 0; i < count; i++) {
		animals[i].displayInfo();
		}
	}
}
