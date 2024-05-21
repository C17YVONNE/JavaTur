package com.lemicode.JAVA56;

//「支払い方法」の抽象クラス
abstract class BasePayment {
	
	//支払い方法の名称を格納する属性
	String paymentMethod;
	
	//支払い処理を行う抽象メソッド
	abstract void pps();
}
