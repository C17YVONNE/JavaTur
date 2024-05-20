package com.lemicode.JAVA51;

class Electronics extends Item{

	String mfr;
	
	@Override
	void display() {
		super.display();
		System.out.println("製造元: " + mfr);
	}
}
