package com.lemicode;

/**
 * Javaの main メソッド内で、整数の配列が与えられた場合に、
 * その配列内で最も長い連続する数のシーケンス（連続する数字の列）の長さを見つけ出してください。
 * シーケンスの要素は順不同であってもかまいません。
 */
public class JAVA32 {
	public static void main(String[] args) {
		int[] nums = { 0, 100, 5, 6,  -2, 200, 1, 3, 2, 7, 8, -1, 9 };
		int longestSequence = 0;

		for (int i = 0; i < nums.length; i++) {
			int currentNum = nums[i];
			int currentSequence = 1;

			boolean found;
			do {
				found = false;
				for (int k = 0; k < nums.length; k++) {
					if (nums[k] == currentNum - 1) {
						currentSequence++;
						currentNum--;
						found = true;
						break;
					}
				}
			} while (found);

			currentNum = nums[i];

			do {
				found = false;
				for (int k = 0; k < nums.length; k++) {
					if (nums[k] == currentNum + 1) {
						currentSequence++;
						currentNum++;
						found = true;
						break;
					}
				}
			} while (found);

			if (currentSequence > longestSequence) {
				longestSequence = currentSequence;
			}
		}
		System.out.println("最長の連続する数のシーケンスの長さ: " + longestSequence);
	}
}
