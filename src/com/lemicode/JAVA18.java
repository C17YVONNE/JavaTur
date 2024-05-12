package com.lemicode;

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
