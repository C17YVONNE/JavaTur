package com.lemicode;
/**
 * 「メールアドレス処理」クラス
 */
public class JAVA63 {
	public static void main(String[] args) {
		//メールアドレスの文字列
		String emailAddress = "tanaka@example.com";
		
		// '@' の位置を見つける
		int atIndex = emailAddress.indexOf("@");
		
		//ドメイン名を抽出
		String domain = emailAddress.substring(atIndex + 1);
		System.out.println("ドメイン名: " + domain);
	}
}
