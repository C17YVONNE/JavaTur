package com.lemicode;

public class ZooTest {

	public static void main(String[] args) {
		
		Zoo myZoo = new Zoo();
		myZoo.addAnimal(new Animal("ライオン", 5, "健康"));
		myZoo.addAnimal(new Animal("ゾウ", 10, "病気"));
		
		
		myZoo.displayAnimals();
	}
}
