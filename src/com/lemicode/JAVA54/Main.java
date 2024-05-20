package com.lemicode.JAVA54;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calculate add = new Add();
		Calculate sub = new Sub();
		Calculate mul = new Mul();
		Calculate div = new Div();

		System.out.println("加算: " + add.calculate(5, 3));
		System.out.println("減算: " + sub.calculate(5, 3));
		System.out.println("乗算: " + mul.calculate(5, 3));
		System.out.println("除算: " + div.calculate(6, 3));
	}

}
