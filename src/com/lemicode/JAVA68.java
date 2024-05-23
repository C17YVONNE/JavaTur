package com.lemicode;

/**
 * 「文字列変換」クラス
 */
public class JAVA68 {
	public static void main(String[] args) {
		//入力文字列
		String input = "LemiCode";

		//大文字に変換
		String upperCase = input.toUpperCase();
		System.out.println("大文字変換: " + upperCase);

		//小文字に変換
		String lowerCase = input.toLowerCase();
		System.out.println("小文字変換: " + lowerCase);
	}
}
