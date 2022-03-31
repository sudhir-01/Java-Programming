package com.oops;

public class MethodOverloading {
	
	//Method overloading implementation by changing number of arguments
	public static int sum(int a, int b) {
		System.out.println("int function is invoked.");
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}

	
	//Method overloading implementation by changing type of arguments
		public static int sum(short a, short b) {
			System.out.println("short function is invoked.");
			return a+b;
		}
		
	
	public static void main(String[] args) {
		short a=4, b=5;
		System.out.println("Sum of 6 & 7 is equal to "+ sum(6,7));
		System.out.println("Sum of 6, 7 & 8 is equal to "+ sum(6,7,8));
		System.out.println("Sum of 4 & 5 is equal to "+ sum(a,b));

	}

}
