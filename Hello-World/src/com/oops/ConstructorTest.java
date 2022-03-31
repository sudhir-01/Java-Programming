package com.oops;

public class ConstructorTest {
	
	int a;

	public ConstructorTest() {
		System.out.println("This is default constructor.");
	}
	 
	
	public ConstructorTest(int a) {
		this(); //Here we are calling the default constructor.
		this.a = a;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ConstructorTest ct = new ConstructorTest(5);
	}

}
