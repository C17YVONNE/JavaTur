package com.lemicode;

import java.util.Arrays;

/**
 * Javaの main メソッド内で、0と1が混在する整数配列が与えられた場合に、
 * 各要素について最も近い0までの距離を計算して新しい配列として出力してください。
 * 距離はインデックスの差で測ります。配列は {1, 0, 2, 1, 0, 1, 2, 3, 4}
 */
public class JAVA30 {
	public static void main(String[] args) {
		int[] array = { 1, 0, 2, 1, 0, 1, 2, 3, 4 };
		int[] result = calculateDistanceToNearestZero(array);
		System.out.println(Arrays.toString(result));
	}

	public static int[] calculateDistanceToNearestZero(int[] array) {
		int[] result = new int[array.length];
		int prevZeroIndex = -1;

		// Forward pass: Calculate distance to nearest zero from the left
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				prevZeroIndex = i;
			}
			if (prevZeroIndex == -1) {
				result[i] = Integer.MAX_VALUE; // No zero encountered yet
			} else {
				result[i] = i - prevZeroIndex;
			}
		}

		// Backward pass: Update distances to nearest zero from the right
		prevZeroIndex = -1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == 0) {
				prevZeroIndex = i;
			}
			if (prevZeroIndex != -1) {
				result[i] = Math.min(result[i], prevZeroIndex - i);
			}
		}

		return result;
	}
}
