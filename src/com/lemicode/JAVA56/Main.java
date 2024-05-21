package com.lemicode.JAVA56;

public class Main {

	public static void main(String[] args) {
		
		// クレジットカードと電子マネーのインスタンスを生成
		CreditCard creditcard = new CreditCard();
		Emoney emoney = new Emoney();
		
		//支払い方法とオンライン認証の処理結果を出力します。
		creditcard.pps();
		creditcard.onlineAuthN();
		
		emoney.pps();
		emoney.onlineAuthN();
	}

}
