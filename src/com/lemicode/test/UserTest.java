package com.lemicode.test;

public class UserTest {

	public static void main(String[] args) {
		
		User u1 = new User();
		
		u1.setUsername("Alice");
		u1.setPassword("Alice123!@#");
		u1.setEmail("Alice@gmail.com");
		u1.setGender("female");
		u1.setAge(27);
		
		System.out.println(u1.getUsername());
		System.out.println(u1.getPassword());
		System.out.println(u1.getEmail());
		System.out.println(u1.getGender());
		System.out.println(u1.getAge());
		
	}
}
