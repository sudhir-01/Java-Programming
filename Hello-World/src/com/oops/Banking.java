package com.oops;

public class Banking {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(), b2 = new BankAccount();
		
		b1.accountNo = 4888;
		b1.name = "Sudhir Kumar";
		b1.balance = 100;
		
		b2.accountNo = 5454;
		b2.name = "Anant Kumar";
		b2.balance = 200;
		
		b1.checkBalance(4888);
		b1.deposit(200);
		b1.withdraw(300);
		
		b2.checkBalance(5454);
		b2.deposit(500);
		b2.withdraw(400);

	}

}
