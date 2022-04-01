package com.oops.encapsulation;

//A Account class which is a fully encapsulated class.  
//It has private data members and getter and setter methods.  
public class Account {
	
	//private data members
	private long accountNo;
	private String name,email;
	private float amount;
	
	//public getters & setters
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}

}
