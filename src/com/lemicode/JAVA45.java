package com.lemicode;

import java.util.Arrays;

public class JAVA45 {
	/**
	 * 整数の2次元配列（マトリックス）を受け取り、その転置（行と列を入れ替えること）を行い、
	 * 新しいマトリックスとして返すメソッドtransposeMatrixを作成してください。
	 * mainメソッドでこのメソッドを呼び出し、結果をコンソールに出力してください。
	 */
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] transposedMatrix = transposeMatrix(matrix);
		for (int[] row : transposedMatrix) {
			System.out.print(Arrays.toString(row));
		}
	}

	public static int[][] transposeMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] transposed = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transposed[j][i] = matrix[i][j];
			}
		}

		return transposed;
	}
}
