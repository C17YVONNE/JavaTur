package com.lemicode;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setModel("Toyota");
		myCar.setMaxSpeed(180);
		
		System.out.println("車種: " + myCar.getModel());
		System.out.println("最高速度: " + myCar.getMaxSpeed() + "km/h");
	}
}
