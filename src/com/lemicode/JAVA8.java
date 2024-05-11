package com.lemicode;

import java.util.Scanner;
/**
 * LCスーパーでプロモーション活動が行われています
 *購入金額に応じて割引が適用され、さらに購入金額の小数点以下の部分は切り捨てられます
 *購入金額による割引は次の通りです：
 *100円以上で10％オフ、500円以上で20％オフ、2000円以上で30％オフ、5000円以上で40％オフ
 *鈴木さんは自分が支払うべき金額を計算できません
 *プログラムを作成して、彼女が支払うべき金額を計算してください
 *入力:鈴木さんの購入金額（int型）。
 *出力:割引後の支払い金額（int型）。
 */
public class JAVA8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		
		double discount = 1.0;
		if (amount >= 5000) {
			discount = 0.6;
		} else if (amount >= 2000) {
			discount = 0.7;
		} else if (amount >= 500) {
			discount = 0.8;
		} else if (amount >= 100) {
			discount = 0.9;
		}
		int payment = (int) (amount * discount);
		System.out.println(payment);
	}
}
