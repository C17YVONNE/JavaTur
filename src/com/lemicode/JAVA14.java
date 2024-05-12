package com.lemicode;
/**
 * 数列9、99、999...9999999999の和を計算するJavaプログラムを書いてください
 * この数列は各項が前の項に10を掛けて9を加えることで生成されます
 * ループを使用してこの数列を生成し、同時に和を求めてください
 */
public class JAVA14 {
	public static void main(String[] args) {
		int n = 10;
		long sum = 0;
		
		long term = 9;
		for (int i = 1; i <= n; i++) {
			sum += term;
			term = term*10 + 9;
			
		}
		System.out.println(sum);
	}
}
