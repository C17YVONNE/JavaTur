package com.lemicode.JAVA51;

class Food extends Item{

	String exp;

	@Override
	void display() {
		super.display();
		System.out.println("賞味期限: " + exp);
	}
}
