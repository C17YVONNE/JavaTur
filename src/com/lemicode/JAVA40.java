package com.lemicode;

public class JAVA40 {
	/**
	 * 与えられた基数と指数から累乗を計算するメソッドpowerを作成してください。
	 */
	public static void main(String[] args) {
		System.out.println(power(5, 2));
	}

	public static int power(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}
}
