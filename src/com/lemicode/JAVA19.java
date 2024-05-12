package com.lemicode;
/**
 * キーボードから入力された一連の整数の中で、負の数が入力されたら入力を停止し
 * それまでに入力された偶数の合計を計算して出力するプログラムを書いてください。
 */

import java.util.Scanner;

public class JAVA19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		System.out.println("正整数を入力してください。負の数が入力すると終了します。");
		
		
		while (true) {
			int num = scanner.nextInt();
			if (num < 0) {
				break;
			}
			if (num % 2 == 0) {
				sum+=num;
			}
		}
		
		System.out.println(sum);

	}
}
