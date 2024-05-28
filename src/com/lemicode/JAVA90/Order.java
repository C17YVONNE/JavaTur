package com.lemicode.JAVA90;

/**
 * 注文を表す Order クラスを作成
 */
public class Order {

	//料理名と価格
	private String dishName;
	private double price;

	//注文メソッド
	public Order(String dishName, double price) {
		this.dishName = dishName;
		this.price = price;
	}

	public String getDishName() {
		return dishName;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "-" + dishName + ": " + price + "円";
	}
}
