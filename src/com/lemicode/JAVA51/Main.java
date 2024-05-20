package com.lemicode.JAVA51;

public class Main {

	public static void main(String[] args) {
		Electronics electronicItem = new Electronics();
		electronicItem.name = "iphone";
		electronicItem.price = 80000;
		electronicItem.mfr = "Apple";
		
		Food foodItem = new Food();
		foodItem.name = "チョコレート";
		foodItem.price = 200;
		foodItem.exp = "2023年12月";
		
		electronicItem.display();
		foodItem.display();
	}
}
