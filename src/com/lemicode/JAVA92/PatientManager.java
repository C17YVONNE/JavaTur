package com.lemicode.JAVA92;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 患者情報を管理する PatientManager クラスを作成
 */
public class PatientManager {
	private List<Patient> patients;

	public PatientManager() {
		patients = new ArrayList<>();
	}

	// 患者情報を追加するメソッド
	public void addPatient(String name, String consultationDate) {
		patients.add(new Patient(name, consultationDate));
	}

	// 特定の患者の情報を検索するメソッド
	public String searchPatient(String name) {
		for (Patient patient : patients) {
			if (patient.name.equals(name)) {
				return patient.name + "の診察日は " + patient.consultationDate + " です。";
			}
		}
		return name + "の患者情報は見つかりませんでした。";
	}

	// 診察日に基づいてリストをソートするメソッド
	public void sortPatientsByDate() {
		 patients.sort(Comparator.comparing(patient -> patient.consultationDate));
	}

	// 全ての患者情報を表示するメソッド
	public void printAllPatients() {
		for (Patient patient : patients) {
			System.out.println(patient);
		}
	}
}
