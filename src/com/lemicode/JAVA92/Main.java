package com.lemicode.JAVA92;

public class Main {

	public static void main(String[] args) {
		PatientManager manager = new PatientManager();

		// 患者情報を追加
		manager.addPatient("田中太郎", "2023/07/15");
		manager.addPatient("佐藤花子", "2023/07/14");

		// 全ての患者情報を表示
		System.out.println("全ての患者情報:");
		manager.printAllPatients();

		// 特定の患者情報を検索
		System.out.println(manager.searchPatient("田中太郎"));

		// 患者情報を診察日でソート
		manager.sortPatientsByDate();
		System.out.println("診察日でソートした患者情報:");
		manager.printAllPatients();
	}
}
