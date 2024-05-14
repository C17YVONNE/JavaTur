package com.lemicode;

/**
 * Javaの main メソッド内で、入力配列: {1, 2, 3, 4, 3, 2, 1, 29, -22 }
 * その配列のバランスポイントを見つけ出してください。
 * バランスポイントとは、配列の特定の位置で、その位置より前のすべての要素の合計と、
 * その位置より後ろのすべての要素の合計が等しくなる点を指します。
 * バランスポイントが存在する場合はそのインデックスを、存在しない場合は -1 を出力してください。
 */
public class java31 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 3, 2, 1, 29, -22 };
		int balancePointIndex = findBalancePoint(array);
		System.out.println("Balance Point Index: " + balancePointIndex);
	}

	public static int findBalancePoint(int[] array) {
		int totalSum = 0;
		for (int num : array) {
			totalSum += num;
		}

		int leftSum = 0;
		for (int i = 0; i < array.length; i++) {
			totalSum -= array[i]; // Adjust total sum by removing current element
			if (leftSum == totalSum) {
				return i; // Found balance point
			}
			leftSum += array[i];
		}

		return -1; // Balance point not found
	}
}
