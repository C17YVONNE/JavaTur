package com.lemicode.JAVA58;
/**
 * 「書籍」の抽象クラス
 */
abstract class BaseBook {

	//書籍のタイトル、著者、ISBN番号を格納する属性
	String title;
	String author;
	String isbn;
	
	//書籍情報を出力する抽象メソッド
	abstract void displayInfo();
}
