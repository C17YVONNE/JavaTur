package com.lemicode;

/**
 * 整数の配列が与えられた場合に、その配列内の「ピーク」要素を見つけ出してください。
 * 「ピーク」とは、その要素が隣接する要素よりも大きい場合を指します。
 * 配列の最初または最後の要素が隣接する単一の要素より大きい場合、それらもピークとみなされます。
 * 配列内に複数のピークがある場合は、どれでも一つを出力して構いません。配列はハードコーディングされているものとします。
 */
public class JAVA29 {
	public static void main(String[] args) {
		int[] arr = { 10, 3, 2, 4, 1, 20 };
		System.out.println("ピーク要素: ");
		
		for (int i = 0; i < arr.length; i++) {
			if ((i == 0 || arr[i - 1] < arr[i]) && ( i == arr.length - 1 || arr[i] > arr[i + 1])) {
				System.out.println(arr[i]);
			}
		}
	}
}
