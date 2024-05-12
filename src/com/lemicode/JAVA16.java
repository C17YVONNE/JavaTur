package com.lemicode;
/**
 * 100以下の二つの正整数に対して、その最小公倍数を計算し、結果を出力するプログラムを作成してください
 */
public class JAVA16 {
	public static void main(String[] args) {
		        int num1 = 15; // 1つ目の正整数
		        int num2 = 20; // 2つ目の正整数

		        // 最小公倍数を計算
		        int lcm = calculateLCM(num1, num2);

		        // 結果を出力
		        System.out.println("最小公倍数は: " + lcm);
		    }

		    // 最小公倍数を計算するメソッド
		    public static int calculateLCM(int a, int b) {
		        // 最大公約数を先に求める
		        int gcd = calculateGCD(a, b);
		        // 二つの数の積を最大公約数で割ることで最小公倍数を求める
		        return (a * b) / gcd;
		    }

		    // 最大公約数を計算するメソッド（ユークリッドの互除法）
		    public static int calculateGCD(int a, int b) {
		        while (b != 0) {
		            int temp = b;
		            b = a % b;
		            a = temp;
		        }
		        return a;
		    }
 }
