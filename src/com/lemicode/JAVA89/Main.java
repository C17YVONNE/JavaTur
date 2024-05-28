package com.lemicode.JAVA89;

public class Main {

	public static void main(String[] args) {
		HotelReserveManager manager = new HotelReserveManager();

		manager.addReservation("田中一郎", "2023/07/15");
		manager.cancelReservation("田中一郎", "2023/07/15");
		manager.printReservation();

		if (manager.checkReservation("2023/07/15")) {
			System.out.println("2023/07/15の予約はあります。");
		} else {
			System.out.println("2023/07/15の予約はありません。");
		}
	}
}
