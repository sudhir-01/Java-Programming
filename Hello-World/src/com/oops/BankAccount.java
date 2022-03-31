package com.oops;

public class BankAccount {
	
	int accountNo;
	String name;
	float balance;
	
	public void checkBalance(int accN) {
		System.out.println("Your account " + accountNo + " has a balance of INR" + balance);
	}
	
	public void deposit(float amount) {
		balance = balance+amount;
		System.out.println("Your account " + accountNo +" is credited with INR" + amount);
	}
	
	public void withdraw(float amount) {
		if(balance < amount) {
			System.out.println("Insufficient Balance!!");
		}else {
			balance = balance-amount;
			System.out.println("Your account " + accountNo + " is debited with INR" + amount);
		}
	}

}
