package com.lemicode;
/**
 * 「配列アクセス処理」クラス
 */
public class ArrayAccessProcessor {

	//配列の特定インデックスにアクセスするメソッド
	public void accessElement(int[] array, int index) {
		try {
			int element = array[index];
			System.out.println("インデックス " + index + " の要素: " + element);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("インデックス " + index + "は配列の範囲外です");
		}
	}
		public static void main(String[] args) {
			ArrayAccessProcessor processor = new ArrayAccessProcessor();
			
			int[] array = {1, 2, 3, 4, 5};
			
			//例1: 有効なインデックスアクセス
			int index1= 3;
			System.out.println("アクセスするインデックス: " + index1);
			processor.accessElement(array, index1);
			
			 // 例2: 範囲外のインデックスアクセス
			int index2 = 5;
			System.out.println("アクセスするインデックス: " + index2);
			processor.accessElement(array, index2);
	}
}
