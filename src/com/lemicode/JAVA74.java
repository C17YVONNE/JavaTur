package com.lemicode;
/**
 * 「ユニーク文字チェック」クラス
 */
public class JAVA74 {

	public static void main(String[] args) {
		// 入力の文字列
		String input = "Lemicode";
		
		//ユニーク文字チェック
		if (isUnique(input)) {
			System.out.println("全ての文字がユニークです");
		} else {
			System.out.println("重複する文字が存在します");
		}		
	}
	
	/**
	 * 文字列内の全ての文字のユニーク性をチェックするメソッド
	 */
	public static boolean isUnique(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;	
	}
}
