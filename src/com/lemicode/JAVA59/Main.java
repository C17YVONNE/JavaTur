package com.lemicode.JAVA59;

public class Main {
	public static void main(String[] args) {

		// 口座の作成
		BankAccount account = new BankAccount(" 123456789", 10000);

		//口座の詳細を表示
		BankAccount.displayInfo(account);
	}
}
