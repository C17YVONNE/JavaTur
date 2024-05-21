package com.lemicode.JAVA56;

/**
 * 派生クラス「電子マネー」
 */
class Emoney extends BasePayment implements IOnlineAuthN {

	//「支払い方法」の抽象メソッドを実装
		@Override
		void pps() {
			System.out.println("支払い方法: 電子マネー");
		}
		//「オンライン認証可能」インターフェースのメソッドをオーバーライド
			@Override
			public void onlineAuthN() {
				System.out.println("オンライン認証成功");
		}
}
