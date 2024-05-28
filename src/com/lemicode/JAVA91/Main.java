package com.lemicode.JAVA91;

public class Main {

	public static void main(String[] args) {
		ToDoListManager manager = new ToDoListManager();

		// タスクを追加
		manager.addTask("買い物に行く");
		manager.addTask("部屋の掃除");

		// 全てのタスクを表示
		System.out.println("全てのタスク:");
		manager.printAllTasks();

		// タスクを完了（削除）
		manager.completeTask("買い物に行く");

		// 全てのタスクを表示
		System.out.println("タスクを完了した後の全てのタスク:");
		manager.printAllTasks();

		// 特定のタスクが存在するかを確認
		String checkTask = "買い物に行く";
		if (manager.isTaskExists(checkTask)) {
			System.out.println(checkTask + " はリストに存在します。");
		} else {
			System.out.println(checkTask + " はリストに存在しません。");
		}
	}

}
