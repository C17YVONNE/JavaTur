package com.lemicode.JAVA54;

class Div implements Calculate{
	@Override
	public int calculate(int a, int b) {
		if (b == 0) {
			System.out.println("除数は0ではいけません。");
		}
		return a / b;
	}
}
