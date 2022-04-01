package com.oops.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setAccountNo(32589631211L);
		acc.setName("Sudhir");
		acc.setEmail("test123@gmail.com");
		acc.setAmount(50000);
		
		System.out.println(acc.getAccountNo()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());

	}

}
