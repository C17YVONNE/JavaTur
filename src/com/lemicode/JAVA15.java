package com.lemicode;

import java.util.Scanner;

/**
 * コンソールから整数を入力してもらい、ユーザーが非正数（0または負の数）を入力した時点で入力を停止します
 * このプログラムはユーザーが入力した正の整数の個数をカウントし、その数を出力してください
 * 入力される数の数は2147483647を超えないと仮定します
 */
public class JAVA15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		System.out.println("正の整数を入力してください。非正数を入力すると終了します。");
		
		while (true) {
			int num = scanner.nextInt();
			
			if (num <= 0) {
				break;
			}
			count++;
		}
		
		System.out.println("入力された正の整数の個数は " + count + " 個です。");
		
		scanner.close();
	}
}
