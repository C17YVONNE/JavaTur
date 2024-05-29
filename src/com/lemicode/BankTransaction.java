package com.lemicode;

	// カスタム例外クラス
	class InsufficientFundsException extends Exception{
		public InsufficientFundsException(String message) {
			super(message);
		}
	}
	class IllegalArgumentException extends Exception{
		public IllegalArgumentException(String message) {
			super(message);
		}
	}
	

	//「銀行取引処理」クラス

	public class BankTransaction {
		private double balance;
		
		public BankTransaction(double balance) {
			this.balance = balance;
		}
	
	// 出金処理メソッド
	public String withdraw(double amount) {
		try {
		if (amount < 0) {
			throw new IllegalArgumentException("不正な出金額です。");
		}
		
		if (amount > balance) {
			throw new InsufficientFundsException("残高が不足です。");
		}
		
		balance -= amount;
		return  "取引成功: 残高は" + balance + "円です。";
	} catch (IllegalArgumentException e) {
		return "エラー: " + e.getMessage();
		} catch (InsufficientFundsException e) {
			return "エラー: " + e.getMessage();
		}
	}


	public static void main(String[] args) {
		// テスト例
		BankTransaction transaction = new BankTransaction(5000);
		
		 // 残高不足のテスト
		System.out.println(transaction.withdraw(6000)); // エラー: 残高が不足しています。
	
		//不正な出金額のテスト
		System.out.println(transaction.withdraw(-500)); // エラー: 出金額は正の数でなければなりません。
		
		//有効な出金額のテスト
		System.out.println(transaction.withdraw(2500)); // 取引成功: 残高は2500円です。
	}
}
	
