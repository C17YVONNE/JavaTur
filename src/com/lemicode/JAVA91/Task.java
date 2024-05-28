package com.lemicode.JAVA91;

/**
 * タスクを表す Task クラスを作成
 */
public class Task {

	private String toDo;

	public Task(String toDo) {
		this.toDo = toDo;
	}

	public String getToDo() {
		return toDo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Task task = (Task) o;
		return toDo.equals(task.toDo);
	}

	@Override
	public int hashCode() {
		return toDo.hashCode();
	}

	@Override
	public String toString() {
		return toDo;
	}

}
