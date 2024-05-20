package com.lemicode.JAVA50;

class Employee {

	String name;
	int salary;
	
	 void setName(String name) {
		this.name = name;
	}
	
	 void showName() {
		System.out.print("名前: " + name);
	}
	
	 void setSalary(int salary) {
		this.salary = salary;
	}
	
	 void showSalary() {
		System.out.println(", 給料: " + salary);
	}
}
