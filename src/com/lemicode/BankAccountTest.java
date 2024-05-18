package com.lemicode;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("12345678", "山田太郎", 10000);
		
		myAccount.deposit(5000);
		myAccount.withdraw(4000);
		
		System.out.println("口座残高: " + myAccount.getBalance());
	}
}
