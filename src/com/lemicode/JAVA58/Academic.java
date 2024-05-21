package com.lemicode.JAVA58;

/**
 * 派生クラス「学術書」を作成
 */
class Academic extends BaseBook implements IBorrow {

	//「書籍」の抽象メソッドを実装
	@Override
	void displayInfo() {
		System.out.println("学術書タイトル: 経済学の原理, 著者: マンキュー, ISBN: 987654321");
	}

	//インターフェースのメソッドをオーバーライド
	//学術書を借りる
	@Override
	public void borrowBook() {
		System.out.println("学術書を借りました。");
	}

	//学術書を返却する
	@Override
	public void returnBook() {
		System.out.println("学術書を返却しました。");
	}
}
