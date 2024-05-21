package com.lemicode.JAVA55;
/**
 * 派生クラスMusic
 */
class Music extends BaseMedia implements IReplayable{
	//抽象メソッドを実装
	@Override
	void displayInfo() {
		System.out.println("音楽:「Beethoven - Symphony No.9」 " + ", 長さ: 70分");
	}
	//インターフェースのメソッドをオーバーライド
	@Override
	public void replay() {
		System.out.println("再生中: Beethoven - Symphony No.9");
	}
}
