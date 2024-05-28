package com.lemicode.JAVA91;

import java.util.ArrayList;
import java.util.List;

/**
 * タスクを管理する ToDoListManager クラスを作成
 */
public class ToDoListManager {

	private List<Task> tasks;

	public ToDoListManager() {
		tasks = new ArrayList<>();
	}

	// 新しいタスクを追加するメソッド
	public void addTask(String toDo) {
		tasks.add(new Task(toDo));
	}

	// 特定のタスクを完了（削除）するメソッド
	public void completeTask(String toDo) {
		Task task = new Task(toDo);
		if (tasks.remove(task)) {
			System.out.println(toDo + " を完了しました。");
		} else {
			System.out.println(toDo + " はリストに存在しません。");
		}
	}

	// 全てのタスクを表示するメソッド
	public void printAllTasks() {
		if (tasks.isEmpty()) {
			System.out.println("現在、タスクはありません。");
		} else {
			for (Task task : tasks) {
				System.out.println(task);
			}
		}
	}

	// 特定のタスクがリスト内に存在するかを確認するメソッド
	public boolean isTaskExists(String toDo) {
		return tasks.contains(new Task(toDo));
	}
}
