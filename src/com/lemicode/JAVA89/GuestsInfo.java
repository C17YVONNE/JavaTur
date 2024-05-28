package com.lemicode.JAVA89;

import java.util.Objects;

/**
 * 「予約情報」クラス
 */
public class GuestsInfo {

	//予約者の名前と予約日
	private String name;
	private String date;
	
	//コンストラクタ
	public GuestsInfo(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GuestsInfo that = (GuestsInfo) o;
		return Objects.equals(name, that.name) &&
				Objects.equals(date, that.date);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, date);
	}	
}
	
	
