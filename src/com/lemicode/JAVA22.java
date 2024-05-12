package com.lemicode;

import java.util.Scanner;

/**
 * ユーザーが入力した非負整数nの階乗を計算してください
 * 階乗とは、1からその数までの全ての整数の積のことを指します
 * 例えば、5の階乗は1 * 2 * 3 * 4 * 5 = 120です
 * この問題では、forループとi--を使って階乗を計算する必要があります
 */
public class JAVA22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("非負整数nを入力してください");
		int num = scanner.nextInt();
		long factorial = 1;
		
		if (num == 0) {
			factorial = 0;
		}
		
		for (int i = num; i > 0; i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
}
