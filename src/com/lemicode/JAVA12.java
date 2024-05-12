package com.lemicode;

import java.util.Scanner;

/**
 * ユーザーが入力した月に基づいて、それに対応する季節を判定するJavaプログラムを書いてください
 * 季節の分類は以下の通りです：
 * 3～5月は「春」、6～8月は「夏」、9～11月は「秋」、12月、1月、2月は「冬」とします
 */
public class JAVA12 {
	public static void main(String[] args) {
		System.out.println("月を入力してください");
			Scanner scanner = new Scanner(System.in);
			int month = scanner.nextInt();
			
		if (month >= 3 && month <= 5) {
			System.out.println("春");
		}else if (month >= 6 && month <= 8) {
			System.out.println("夏");
		}else if (month >= 9 && month <= 11) {
			System.out.println("秋");
		}else {
			System.out.println("冬");
		}	
	}
}
