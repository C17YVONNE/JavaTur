package com.lemicode;

import java.util.Scanner;

/**
 * 体重指数は体重（kg）を身長（m）の平方で割ったものです
 * この指数に基づき、体型を判定するJavaプログラムを書いてください
 * 体重指数が18.5未満の場合は「やせ型」
 * 18.5以上20.9未満の場合は「スリム」
 * 20.9以上24.9以下の場合は「標準」
 * 24.9を超える場合は「肥満気味」と判定してください
 */
public class JAVA13 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("身長（m）を入力してください:");
		Double height = scanner.nextDouble();
		System.out.println("体重（kg）を入力してください:");
		Double weight = scanner.nextDouble();
		
		String bodyType = determineBodyType(height, weight);
		System.out.println("あなたの体型は: " + bodyType);
		
		scanner.close();
	}
	
	public static String determineBodyType(double height, double weight) {
		
		double bmi = weight/(height*height);
		
		if (bmi < 18.5) {
			return "やせ型";
		}
		else if (bmi >= 18.5 && bmi < 20.9) {
			return "スリム";
		}
		else if (bmi >= 20.9 && bmi < 24.9) {
			return "標準";
		}
		else {
			return "肥満気味";
		}
	}
}
