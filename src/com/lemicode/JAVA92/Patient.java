package com.lemicode.JAVA92;

/**
 * 患者情報を表す Patient クラスを作成
 */
public class Patient {
	//患者の名前と診察日
	String name;
	String consultationDate;

	public Patient(String name, String consultationDate) {
		this.name = name;
		this.consultationDate = consultationDate;
	}

	@Override
	public String toString() {
		return "名前- " + name + ", 診察日- " + consultationDate;
	}
}
