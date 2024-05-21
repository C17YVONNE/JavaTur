package com.lemicode.JAVA58;

public class Main {

	public static void main(String[] args) {
		
		//「小説」と「学術書」のインスタンスを生成
		Novel novel = new Novel();
		Academic academic = new Academic();
		
		//各書籍の情報と、借りる/返却のプロセスを出力します
		novel.displayInfo();
		novel.borrowBook();
		
		academic.displayInfo();
		academic.returnBook();

	}
}
