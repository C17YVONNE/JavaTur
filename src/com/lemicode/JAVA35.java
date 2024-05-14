package com.lemicode;

/**
 * 整数の配列のすべての要素の合計を計算するメソッドsumArrayを作成してください。
 */
public class JAVA35 {
	public static void main(String[] args) {
		int[] array = { 6, 7, 8 };
		System.out.println(sumArray(array));
	}

	public static int sumArray(int[] array) {

		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum;
	}
}
