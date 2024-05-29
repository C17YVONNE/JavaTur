package com.lemicode;
/**
 * 「オートボクシングとアンボクシング」クラス
 */
public class AutoboxingAndUnboxing {

	public static void main(String[] args) {
		//int型のデータ
		int primitiveInt = 10;
		
		//オートボクシング
		Integer autoBoxedInt = primitiveInt;
		System.out.println("オートボクシング後のIntegerオブジェクト: " + autoBoxedInt);
		
		//Integerオブジェクト
		Integer wrapperInt = 20;
		
		//アンボクシング
		int UnboxedInt = wrapperInt;
		System.out.println("アンボクシング後のint型データ: " + UnboxedInt);
	}
}
