package com.controlstatement;

import java.util.Scanner;

public class LeapYear {
	
	private static void isLeapYear(int yr) {
		if((yr%4 == 0 && yr%100 != 0) || yr%400 == 0)
			System.out.println("It's a Leap Year.");
		else 
			System.out.println("It's not a Leap Year.");
	}
	
	public static void main(String[] args) {
		int year;
		boolean isLeap = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		year = sc.nextInt();
		
		isLeapYear(year);
	}

}
