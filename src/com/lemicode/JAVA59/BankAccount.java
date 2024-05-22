package com.lemicode.JAVA59;

/**
 * 「銀行口座」クラスを作成
 */
public class BankAccount {

	//finalで定義された銀行コード
	private static final int BANK_CODE = 101;

	//口座番号
	private final String accountNumber;

	//口座残高
	private double balance;

	// 全ての口座の数を追跡するstatic変数
	private static int totalAccounts = 0;

	// コンストラクタ
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		totalAccounts++;// 口座を作成するたびに口座数を増やす
	}

	// 銀行コードを取得するメソッド
	public static final int getBankCode() {
		return BANK_CODE;
	}

	// 口座番号を取得するメソッド
	//通常、口座番号は一度設定されたら変更されないべきです。setter メソッドは不要です。
	public String getAccountNumber() {
		return accountNumber;
	}

	// 口座残高を取得するメソッド
	public double getBalance() {
		return balance;
	}

	// 口座残高を設定するメソッド
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// 全ての口座数を取得するメソッド
	// 全口座数は内部的に管理されるべき情報であり、外部から変更する必要はありませんので、setter メソッドは不要です。
	public static int getTotalAccounts() {
		return totalAccounts;
	}

	//口座の詳細を表示するstaticメソッド
	public static void displayInfo(BankAccount account) {
		System.out.println("銀行コード: " + BANK_CODE);
		System.out.println("口座番号: " + account.getAccountNumber());
		System.out.println("残高: " + account.getBalance() + "円");
		System.out.println("全口座数: " + totalAccounts);
	}
}
