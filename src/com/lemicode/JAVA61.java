package com.lemicode;
/**
 * 与えられた住所の文字列を市区町村、通り、番地に分割し、それぞれを出力するプログラムを作成します。
 * 住所はコンマで区切られ、「市区町村, 通り, 番地」の形式で与えられます。
 */
public class JAVA61 {

			public static void main(String[] args) {
				//住所の文字列
				String fullAddress = "渋谷区, 明治通り, 1-2-3" ;
				
				//住所を分割
				String[] parts = fullAddress.split(", ");
				
				// 分割した住所の出力
				System.out.println("市区町村: " + parts[0]);
		        System.out.println("通り: " + parts[1]);
		        System.out.println("番地: " + parts[2]);
			}
}
