package com.lemicode.JAVA49;

class Truck extends Car {

	int loadCapacity;
	
	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	public void showLoadCapacity() {
		System.out.println("LoadCapacity: " + loadCapacity);
	}
}
