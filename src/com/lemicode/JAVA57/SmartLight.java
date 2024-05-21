package com.lemicode.JAVA57;
/**
 * 派生クラス「スマートライト」
 */
class SmartLight extends BaseSmartDevice implements IControll{
	
	//「スマートデバイス」の抽象メソッドを実装
	@Override
	public void displayDeviceInfo() {
		System.out.println("デバイス: スマートライト");
	}
	
	//「コントロール可能」インターフェースのメソッドをオーバーライド
	@Override
	public void deviceControll() {
		System.out.println("ライトをオンにしました。");
	}

}
