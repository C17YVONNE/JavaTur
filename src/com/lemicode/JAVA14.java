package com.lemicode;
/**
 * 数列9、99、999...9999999999の和を計算するJavaプログラムを書いてください
 * この数列は各項が前の項に10を掛けて9を加えることで生成されます
 * ループを使用してこの数列を生成し、同時に和を求めてください
 */
public class JAVA14 {
	public static void main(String[] args) {
		long sum = 0;
		for (long i = 9; i <= 9999999999; i = i*10 + 9) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
