package com.lemicode.test;

public class PhoneTest {

	public static void main(String[] args) {
		//创建手机的对象
		Phone p1 = new Phone();
		
		//给手机赋值
		//p.brand = "小米";
		//p.price = 1999.98;
		//赋值
		p1.setBrand("华为");
		p1.setPrice(599.99);
		
		
		
		//获取手机对象中的值
		//System.out.println(p1.brand);
		//System.out.println(p1.price);
		System.out.println( p1.getBrand());
		System.out.println( p1.getPrice());
		
		
		//调用手机中的方法
		p1.call();
		p1.playGame();
			
	}
}
