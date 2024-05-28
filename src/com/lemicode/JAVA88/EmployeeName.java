package com.lemicode.JAVA88;

import java.util.ArrayList;

/**
 * 「従業員名簿管理」クラス
 */
public class EmployeeName {
	public static void main(String[] args) {

		//従業員名簿リスト作成
		ArrayList<Employee> list = new ArrayList<>();

		Employee e1 = new Employee("田中一郎");
		Employee e2 = new Employee("佐藤恵子");

		//要素を追加
		list.add(e1);
		list.add(e2);

		//要素を削除
		list.remove(e2);

		//リスト内の全従業員の名前を出力するメソッド
		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);
			System.out.println(e.getName());
		}
		
		boolean nameCheck = contains(list, "佐藤恵子");
		if (nameCheck = true) {
			System.out.println("佐藤恵子はリストに存在します。");
		}else {
			System.out.println("佐藤恵子はリストに存在しません。");
		}
		
	}

	//従業員確認
	public static boolean contains(ArrayList<Employee> list, String name) {
		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);
			String eName = e.getName();
			if (eName.equals(name)) {
				return true;
			} 		
		}
		return false;
	}
}
