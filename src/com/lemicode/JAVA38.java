package com.lemicode;

import java.util.Arrays;

public class JAVA38 {
	/**
	 * 二つの文字列がアナグラム（文字の並びを変えることで、別の単語やフレーズを作ること）かどうかを判定するメソッドisAnagramを作成してください。
	 */
	public static void main(String[] args) {
		System.out.println(isAnagram("earth", "heart"));
	}

	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}

}
