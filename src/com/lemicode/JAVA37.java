package com.lemicode;

public class JAVA37 {
	/**
	 * 与えられた整数が素数（1とその数自身以外に正の約数を持たない数）かどうかを判定するメソッドisPrimeを作成してください。
	 */
	public static void main(String[] args) {
		System.out.println(isPrime(31));
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
