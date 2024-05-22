package com.lemicode;
/**
 * 「文字カウント」クラス
 */
public class JAVA66 {

	public static void main(String[] args) {
		// 入力文字列
		String input = "こんにちは、皆さんこんにちは！";
		
		//カウントする特定文字
		char keyWord = 'ん';
		
		// 文字のカウント
		int count = countOccurrences(input, keyWord);
		System.out.println("\"" + keyWord + "\" の出現回数: " + count);
    }
		
		//特定の文字をカウントするメソッド
		private static int countOccurrences(String input, char keyWord) {
			int count = 0;
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == keyWord) {
					count++;
				}
			}
		return count;
	}

}
