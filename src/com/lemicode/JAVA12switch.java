package com.lemicode;
/**
 * ユーザーが入力した月に基づいて、それに対応する季節を判定するJavaプログラムを書いてください
 * 季節の分類は以下の通りです：
 * 3～5月は「春」、6～8月は「夏」、9～11月は「秋」、12月、1月、2月は「冬」とします
 */
import java.util.Scanner;

public class JAVA12switch {
	public static void main(String[] args) {
		System.out.println("月を入力してください");
			Scanner scanner = new Scanner(System.in);
			int month = scanner.nextInt();
			
		switch (month) {
			case 3:
			case 4:
			case 5:
			System.out.println("春");
			break;
			
			case 6:
			case 7:
			case 8:
			System.out.println("夏");
			break;
			
			case 9:
			case 10:
			case 11:
			System.out.println("秋");
			break;
			
			case 12:
			case 1:
			case 2:
			System.out.println("冬");
			break;
			
			default:
				System.out.println("無効な月");
		}	
	}
}
