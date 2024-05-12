package com.lemicode;

import java.util.Scanner;

/**
 * キーボードから入力された一連の整数の中で、0が入力されたら入力を停止し
 * それまでに入力された数の中で最大値と最小値を求めて出力するプログラムを書いてください。
 */
public class JAVA20 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 最大値と最小値を初期化
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("整数を入力してください（0で終了）:");

        // 0が入力されるまでループ
        while (true) {
            int num = scanner.nextInt();
            
            // 0が入力されたらループを終了
            if (num == 0) {
                break;
            }

            // 最大値と最小値を更新
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // 最大値と最小値を出力
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);

        scanner.close();
    }
}
