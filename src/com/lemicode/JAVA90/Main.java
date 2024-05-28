package com.lemicode.JAVA90;

public class Main {

	public static void main(String[] args) {
		// 5つのテーブルを管理
		TableOrderManager manager = new TableOrderManager(5);

		// テーブル1に注文を追加
		manager.addOrder(1, "寿司", 1200);
		manager.addOrder(1, "天ぷら", 900);
		
		//テーブル2に注文を追加
		manager.addOrder(2, "刺身", 1500);
		manager.addOrder(2, "煮物", 800);
		
		//全テーブルの注文を表示
		manager.printAllOrders();
	}
}
