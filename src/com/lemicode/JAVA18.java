package com.lemicode;
/**
 * 与えられた整数が素数であるかどうかを判断するプログラムを書いてください
 * 素数は1より大きく、1とその数自身以外には約数を持たない正の整数です
 */
import java.util.Scanner;

public class JAVA18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1より大きい整数を入力してください");
		int num = scanner.nextInt();
		
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(isPrime);
        } else {
            System.out.println(isPrime);
        }
		
	}
}
