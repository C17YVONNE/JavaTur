package com.lemicode;
/**
 * 「基本型とラッパークラス変換」クラス
 */
public class JAVA76 {
	public static void main(String[] args) {

	//int型のデータをIntegerラッパークラスに変換
	int primitiveNum = 10;
	
	Integer wrapperNum = Integer.valueOf(primitiveNum);
	System.out.println("変換後のIntegerオブジェクト: " + wrapperNum);
	
	//Integerラッパークラスのオブジェクトをint型に変換
	Integer wrapperNum2 = 20;
	
	int primitiveNum2 = wrapperNum2.intValue();
	System.out.println("変換後のint型データ: " + primitiveNum2);
	}
}
