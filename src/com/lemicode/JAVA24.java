package com.lemicode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * キーボードから6つの整数を入力し、それらを配列に格納した後
 * まず配列を正順で出力し、次に配列を逆順にして出力するプログラムを書いてください。
 */
public class JAVA24 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[6];
	        for (int i = 0; i < 6; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        // 正順で出力
	        System.out.println("正順: " + Arrays.toString(numbers));

	        // 配列を逆順にする
	        for (int i = 0; i < numbers.length / 2; i++) {
	            int temp = numbers[i];
	            numbers[i] = numbers[numbers.length - 1 - i];
	            numbers[numbers.length - 1 - i] = temp;
	        }

	        // 逆順で出力
	        System.out.println("逆順: " + Arrays.toString(numbers));
	}
}
