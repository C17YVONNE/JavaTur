package com.lemicode;
/**
 * 第三の変数を使用せずに、2つのint型変数の値を交換するJavaプログラムを書いてください。
 */
public class JAVA6 {
	public static void main(String[] args) {
		int a = 5, b = 10;
		
		b = b - a;
		a = a + b;
						
		System.out.println(a + "\s" + b);
	}
}
