package com.lemicode;

import java.util.Scanner;

/**
 * 整数型の変数が与えられた場合、その数が奇数か偶数かを判定するJavaプログラムを書いてください。
 */

public class JAVA7 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			
			if (number % 2 == 0) {
				System.out.println("偶数");
			}		
			else {
				System.out.println("奇数");
			}		
	}
}
