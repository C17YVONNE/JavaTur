package com.lemicode;
/**
 * 「サブストリングチェック」クラス
 */
public class JAVA67 {

	public static void main(String[] args) {
		//文字列AとB
		String strA = "こんにちは";
		String strB = "今日はいい天気で、こんにちは";
		
		//サブストリングチェック
		if (strB.contains(strA)) {
			System.out.println("含まれています");
		} else {
			System.out.println("含まれていません");
		}
	}
}
