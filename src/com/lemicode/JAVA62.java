package com.lemicode;
/**
 * 「ショッピングリスト」クラス
 */
public class JAVA62 {
	public static void main(String[] args) {
		//商品名配列
		String[] items = {"りんご", "バナナ", "トマト"};
		
		// 商品名を結合
		String combinedList = String.join(", ", items);
		System.out.println("結合されたリスト: " + combinedList);
		
		// 特定の商品を置換
		String replacedList = combinedList.replace("バナナ", "いちご");
		System.out.println("置換後のリスト: " + replacedList);
	}
}
