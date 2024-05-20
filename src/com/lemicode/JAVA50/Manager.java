package com.lemicode.JAVA50;

class Manager extends Employee {

	String department;
	
	 void setDepartment(String department) {
		this.department = department;
	}
	
	void showDepartment() {
		System.out.println("部門: " + department);
	}
}
