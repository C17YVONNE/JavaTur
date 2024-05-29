package com.lemicode;
/**
 * 「除算処理」クラス
 */
public class DivisionProcessor {

	public void divide(int numerator, int denominator) {
		try {
			int result = numerator / denominator;
			System.out.println("除算結果: " + result);
		}catch (ArithmeticException e) {
			System.out.println("0による除算はできません");
		}
	}
	
	public static void main(String[] args) {
		DivisionProcessor processor = new DivisionProcessor();
		
		//例1: 正常な除算
		int numerator1 = 10;
		int denominator1 = 5;
		System.out.println("被除数: " + numerator1 + ", 除数: " + denominator1);
		processor.divide(numerator1, denominator1);
		
		//例2: 0による除算
		int numerator2 = 10;
		int denominator2 = 0;
		System.out.println("被除数: " + numerator2 + ", 除数: " + denominator2);
		processor.divide(numerator2, denominator2);
	}
}
