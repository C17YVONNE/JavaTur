package com.lemicode.JAVA89;

import java.util.ArrayList;
import java.util.List;

/**
 * /**
 * 「HotelReserveManager」クラス - ホテルの客室予約を管理するためのクラス。
 * このクラスは客室の予約の追加、キャンセル、全ての予約の表示、特定の日付の予約の存在確認を行います。
 */
public class HotelReserveManager {

	private List<GuestsInfo> reservations = new ArrayList<GuestsInfo>();

	//予約をリストに追加するメソッド
	public void addReservation(String name, String date) {
		reservations.add(new GuestsInfo(name, date));
	}

	//予約をキャンセルするメソッド
	public void cancelReservation(String name, String date) {
		reservations.remove(new GuestsInfo(name, date));
	}

	//全ての予約を表示するメソッド
	public void printReservation() {
		for (GuestsInfo reservation : reservations) {
			System.out.println("予約者: " + reservation.getName() + ", 日付: " + reservation.getDate());
		}
	}

	//特定の日付の予約が存在するかを確認するメソッド
	public boolean checkReservation(String date) {
		return reservations.stream()
				.anyMatch(reservation -> reservation.getDate().equals(date));
	}
}
