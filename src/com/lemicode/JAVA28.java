package com.lemicode;

/**
 * 整数の配列が与えられた場合に、その配列内に重複する要素を検出し、それぞれの重複要素を一度だけ出力してください。
 * 配列はハードコーディングされているものとします。
 */
public class JAVA28 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 5, 1, 6 };
		boolean[] isDuplicate = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && !isDuplicate[i]) {
					isDuplicate[j] = true;
				}
			}
		}
		System.out.print("配列内の重複する要素: ");
		for (int i = 0; i < arr.length; i++) {
			if (isDuplicate[i]) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
