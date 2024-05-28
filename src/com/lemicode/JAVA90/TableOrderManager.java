package com.lemicode.JAVA90;

import java.util.ArrayList;
import java.util.List;

/**
 * 複数のテーブルでの注文を管理する TableOrderManager クラスを作成
 */
public class TableOrderManager {
	private List<List<Order>> tables;

	public TableOrderManager(int numberOfTables) {
		tables = new ArrayList<>(numberOfTables);
		for (int i = 0; i < numberOfTables; i++) {
			tables.add(new ArrayList<>());
		}
	}

	// 特定のテーブルに注文を追加するメソッド
	public void addOrder(int tableNumber, String dishName, double price) {
		if (tableNumber < 1 || tableNumber > tables.size()) {
			System.out.println("無効なテーブル番号です。");
			return;
		}
		tables.get(tableNumber - 1).add(new Order(dishName, price));
	}

	// 全テーブルの注文を表示するメソッド
	public void printAllOrders() {
		for (int i = 0; i < tables.size(); i++) {
			System.out.println("テーブル " + (i + 1) + " の注文:");
			List<Order> orders = tables.get(i);
			if (orders.isEmpty()) {
				System.out.println(" 注文はありません。");
			} else {
				for (Order order : orders) {
					System.out.println(" " + order);
				}
			}
		}
	}
}
