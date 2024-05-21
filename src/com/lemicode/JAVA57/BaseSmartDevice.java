package com.lemicode.JAVA57;
/**
 * 「スマートデバイス」の抽象クラス
 */
abstract class BaseSmartDevice {

	//デバイス名を格納する属性
	String deviceName;
	
	//デバイス情報を出力する抽象メソッド
	abstract void displayDeviceInfo();
	
}
