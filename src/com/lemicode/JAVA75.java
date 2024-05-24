package com.lemicode;

/**
 * 「サブストリング抽出」クラス
 */
public class JAVA75 {

	public static void main(String[] args) {
		// 入力文字列
		String input = "abc";

		//全てのサブストリングの抽出と出力
		extractAndPrintSubstrings(input);
	}

	/**
	 * 文字列の全てのサブストリングを抽出して出力するメソッド
	 */
	public static void extractAndPrintSubstrings(String str) {
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i , j));
			}
		}
	}
}
