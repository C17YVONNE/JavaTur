package com.lemicode;
/**
 * キーボードから入力された整数の桁数を計算して出力するプログラムを書いてください
 * 入力された整数が0以下の場合は、その数自体を出力します。
 */
import java.util.Scanner;

public class JAVA21 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を入力してください:");
		int num = scanner.nextInt();
		
		if (num <= 0 ) {
			System.out.println(num);
		}
		else {
			int digits = 0;
			while (num > 0) {
				num /= 10;
				digits++;
			}
			System.out.println(digits);
		}
		
	}
}
