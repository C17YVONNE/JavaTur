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
	if (num <= 1){
	   isPrime = false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
          }
	}

            System.out.println(isPrime);
		
	}
}
