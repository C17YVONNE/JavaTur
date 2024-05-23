package com.lemicode;
/**
 * 「文字列結合」クラス
 */
public class JAVA70 {
	public static void main(String[] args) {
		//入力する複数の文字列
		String [] words = {"Java", "は", "楽しい"};
		
		//文字列を順番に結合
		StringBuilder combined = new  StringBuilder();
		for (String word : words) {
			combined.append(word);
		}
		System.out.println("結合された文字列: " + combined.toString());
	}
}
