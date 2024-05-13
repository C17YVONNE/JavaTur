package com.lemicode;

/**
 * 整数の二次元配列が与えられた場合に、その配列の行と列を交換して、新しい配列を作成し出力してください。
 * この操作を「転置」と呼びます。二次元配列は正方形（同じ数の行と列）と仮定してかまいません。
 * 二次元配列はハードコーディングされているものとします。
 */
public class JAVA27 {
	public static void main(String[] args) {
		int[][] original = new int[][] {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};
		int[][] transposed = new int[original.length][original.length];

		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				transposed[j][i] = original[i][j];
			}
		}

		System.out.println("転置された配列:");
		for (int i = 0; i < transposed.length; i++) {
			for (int j = 0; j < transposed[i].length; j++) {
				System.out.print(transposed[i][j] + " ");
			}
			System.out.println();
		}
	}
}
