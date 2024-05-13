package com.lemicode;
/**
 * キーボードから6つの整数を入力し、それらを配列に格納した後、配列の中で最大値と最小値を見つけて出力するプログラムを書いてください
 * 最大値と最小値が同じ値であれば、その値を一度だけ出力します
 * 最大値と最小値が異なる値で、それぞれの値が複数存在する場合でも、各値を一度だけ出力します
 */
import java.util.Scanner;

public class JAVA23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		if (max == min) {
			System.out.println(max);
		}else {
			System.out.println(max + " " + min);
		}
	}
}
