package com.lemicode.JAVA60;

//「自動車」クラスを作成
public class Car {

	//一日あたりの料金
	static final int BASE_RATE = 3000;
	//全てのレンタル車両の総数
	static int totalCars = 0;

	//車両のモデル名
	String model;

	//レンタル日数
	int rentDays;

	//コンストラクタ
	Car(String model, int rentDays) {
		this.model = model;
		this.rentDays = rentDays;
		totalCars++;//車両を作成するたびに車両の総数を増やす
	}

	//自動車のレンタル料金を計算するstaticメソッド
	static int totalFee(int rentDays) {
		return BASE_RATE * rentDays;
	}

	//自動車のレンタル情報を表示するメソッド

	void displayRentInfo() {
		System.out.println("モデル: " + model);
		System.out.println("レンタル日数: " + rentDays + "日");
		System.out.println("合計レンタル料金: " + totalFee(rentDays) + "円");
		System.out.println("全車両数: " + totalCars);
	}
}
