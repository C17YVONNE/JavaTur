package com.lemicode;
//double 型の変数を int 型に変換するプログラムを作成してください。変換時には小数点以下を切り捨てます。
public class JAVA3 {
	public static void main(String[] args) {
		double data1 = 12.34;
		System.out.println("入力:" + data1);
		
		int value1 = (int)data1;
		System.out.println("出力:" + value1);
	
		double data2 = 1.88;
		System.out.println("入力:" + data2);
		
		int value2 = (int)data2;
		System.out.println("出力:" + value2);
	}
}
