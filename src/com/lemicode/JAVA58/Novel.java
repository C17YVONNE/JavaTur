package com.lemicode.JAVA58;
/**
 * 派生クラス「小説」を作成
 */
class Novel extends BaseBook implements IBorrow{

	//「書籍」の抽象メソッドを実装
	@Override
	void displayInfo() {
		System.out.println("小説タイトル: ノルウェイの森, 著者: 村上春樹, ISBN: 123456789");
	}
	
	//インターフェースのメソッドをオーバーライド
	//小説を借りる
	@Override
	public void borrowBook() {
		System.out.println("小説を借りました。");
	}
	
	//小説を返却する
	@Override
    public void returnBook() {
        System.out.println("小説を返却しました。");
    }
}
