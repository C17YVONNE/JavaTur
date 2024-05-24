package com.lemicode;

/**
 * 「回文チェック」クラス
 */
public class JAVA72 {
	public static void main(String[] args) {
		//入力文字列
		String input = "たけやぶやけた";

		//回文チェック
		if (isPalindrome(input)) {
			System.out.println("回文です");
		} else {
			System.out.println("回文ではありません");
		}
	}

	/**
	 * 文字列が回文であるかチェックするメソッド
	 */
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j) ){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
