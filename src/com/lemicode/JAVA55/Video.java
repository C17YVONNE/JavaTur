package com.lemicode.JAVA55;
/**
 * 派生クラスVideo
 */
class Video extends BaseMedia implements IReplayable{
	//抽象メソッドを実装
		@Override
		void displayInfo() {
			System.out.println("ビデオ: 「Spirited Away」 " +  " , 長さ: 70分");
		}
		//インターフェースのメソッドをオーバーライド
		@Override
		public void replay() {
			System.out.println("再生中: Spirited Away");
		}

}
