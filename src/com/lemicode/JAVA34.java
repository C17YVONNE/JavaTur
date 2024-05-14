package com.lemicode;

/**
 * 2つの整数（例: 8, 12）最大公約数を計算するメソッドgcdを作成してください。
 * このメソッドは再帰を使用せず、ループを通じて最大公約数を計算してください。
 */
public class JAVA34 {
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		int result = gcd(8, 12);
		System.out.println("最大公约数： " + result);
	}
}
