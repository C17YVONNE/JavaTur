package com.lemicode;

public class JAVA42 {
	/**
	 * 与えられた文字列がパリンドローム（前後から読んでも同じになる文字列）であるかどうかを判定するメソッドisPalindromeを作成してください。
	 */
	public static void main(String[] args) {
		System.out.println(isPalindrome("madam"));
	}

	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
