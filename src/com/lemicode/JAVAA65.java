package com.lemicode;
/**
 * 「文字列逆順」クラス
 */
public class JAVAA65 {
	public static void main(String[] args) {
		//入力文字列
		String input = "こんにちは LemiCode";
		
		// 文字列を逆順にする
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println("逆順: " + reversed);
	}
}
