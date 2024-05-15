package com.lemicode;

public class JAVA41 {
	/**
	 * 与えられた年が閏年（リープイヤー）かどうかを判定するメソッドisLeapYearを作成してください。
	 */
	public static void main(String[] args) {
		System.out.println(isLeapYear(1900));
	}

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
	}
}
