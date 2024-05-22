package com.lemicode;
/**
 * 「メールアドレス処理」クラス
 */
public class JAVA63 {
	public static void main(String[] args) {
		//メールアドレスの文字列
		String emailAddress = "tanaka, @, example.com";
		
		//メールアドレスを分割
		String[] parts = emailAddress.split(", ");
		
		//ドメイン名を出力
		System.out.println(parts[2]);
	}
}
