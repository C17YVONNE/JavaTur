package com.lemicode;

import java.util.Arrays;

public class JAVA44 {
	/**
	 * 二つの整数配列を受け取り、それらを一つの配列に結合し、新しい配列として返すメソッドconcatenateArraysを作成してください。
	 * forループを使用して結合処理を行い、mainメソッドでこのメソッドを呼び出し、結果をコンソールに出力してください。
	 */
	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30 };
		int[] array2 = { 40, 50, 60 };
		int[] combinedArray = concatenateArrays(array1, array2);
		System.out.println(Arrays.toString(combinedArray));
	}

	public static int[] concatenateArrays(int[] array1, int[] array2) {
		int[] result = new int[array1.length + array2.length];
		int index = 0;

		for (int i = 0; i < array1.length; i++, index++) {
			result[index] = array1[i];
		}

		for (int j = 0; j < array2.length; j++, index++) {
			result[index] = array2[j];
		}

		return result;
	}
}
