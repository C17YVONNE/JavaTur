package com.lemicode.test;

public class Phone {
	
	//成员变量（属性，一般是名词）
	private String brand;
	private double price;
	
	
	//针对每个私有化成员变量，提供get和set方法
	//set方法：给成员变量赋值
	//get方法：对外提供成员变量的值
	
	public void setBrand(String b) {
		brand = b;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(Double p) {
		if(p >= 1500.00 && p <= 3599.99) {
			price = p;
		}else {
			System.out.println("非优惠机型价格");
		}
		
	}
	
	public double getPrice() {
		return price;
	}
	//成员方法（行为，一般是动词）
	public void call () {System.out.println("The phone is calling.");}
	
	public void playGame() {System.out.println("The phone is playing game.");}
}
