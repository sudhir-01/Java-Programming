package com.string;

import java.util.Scanner;

public class ReverseString {
	
	//Custom method to reverse string.
	public static String reverseStr(String str) {
		char[] temp = str.toCharArray();
		
		String rev = "";
		for(int i=temp.length-1;i>=0;i--) {
			rev += temp[i];
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse:");
		str = sc.nextLine();
		
		System.out.println("The reversed string is: "+ reverseStr(str));
		
	}

}
