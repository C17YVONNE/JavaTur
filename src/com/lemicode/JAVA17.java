package com.lemicode;
/**
 * キーボードから任意の数の10000以下の正整数を入力し、負の数が入力されたときに入力を終了し
 * それまでに入力された正整数の平均値を計算して出力するプログラムを書いてください
 * 平均値はdouble型で計算し、小数点以下2桁で出力します
 */
import java.util.Scanner;

public class JAVA17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;

		System.out.println("任意の10000以下の正整数を入力してください。負の数が入力すると終了します。");
		
		while (true) {
			int num = scanner.nextInt();
			
			if (num < 0) {
				break;
			}
			
			count++;
			
			sum+= num;			
		}
		Double average = (double)sum / count;
		System.out.printf("入力された正整数の平均値:"+ "%.2f", average);
	}
}
