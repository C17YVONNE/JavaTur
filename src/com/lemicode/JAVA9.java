package com.lemicode;

import java.util.Scanner;
/**
 * ユーザーが入力した年齢に基づいて人を分類するプログラムを書いてください
 * 分類は以下の通りです：
 * 0～12歳は「子供」、13～19歳は「青少年」、20～59歳は「成人」、60歳以上は「高齢者」とします
 * 入力:ユーザーの年齢（整数)
 * 出力:年齢に基づく分類
 */
public class JAVA9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		while (true) {
			System.out.println("年齢を入力してください");
			int age = scanner.nextInt();
			
			if (age >= 60) {
				System.out.println("高齢者");
				break;
			} else if (age >= 20) {
				System.out.println("成人");
				break;
			}else if (age >= 13) {
				System.out.println("青少年");
				break;
			}else if (age >= 0) {
				System.out.println("子供");
				break;
			}else if (age < 0) {
				System.out.println("エラー! 再入力してください。");
			}
		}			
	}
}
