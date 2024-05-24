package com.lemicode;

/**
 * 「最長単語探索」クラス
 */
public class JAVA73 {

	public static void main(String[] args) {
		// 入力文
		String input = "Javaは 面白くて、 学ぶのが楽しい プログラミング言語です";

		//最長単語探索
		String longestWord = findLongestWord(input);
		System.out.println("最長単語: " + longestWord);
	}

	/**
	 * 入力文内の最長単語を探すメソッド
	 */
	public static String findLongestWord(String str) {
		String[] words = str.split("\\s+");//空白文字で分割
		String longestWord = "";

		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;

	}
}
