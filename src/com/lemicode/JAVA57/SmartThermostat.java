package com.lemicode.JAVA57;
/**
 * 派生クラス「スマートサーモスタット」
 */
class SmartThermostat extends BaseSmartDevice implements IControll{

	//「スマートデバイス」の抽象メソッドを実装
	@Override
	public void displayDeviceInfo() {
		System.out.println("デバイス: スマートサーモスタット");
	}
	
	//「コントロール可能」インターフェースのメソッドをオーバーライド
	@Override
	public void deviceControll() {
		System.out.println("サーモスタットをオフにしました。");
	}
}
