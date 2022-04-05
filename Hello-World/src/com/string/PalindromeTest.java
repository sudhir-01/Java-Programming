package com.string;

import java.util.Scanner;

public class PalindromeTest {
	
	//Method-I: Traversing from both ends of string and comparing characters,
	//          If any mismatch found then return false else continue
/*	public static boolean isPalindrome(String str) {
		char[] temp = str.toCharArray();
		int i,j;
		int len = str.length();
		
		for(i=0,j=len-1; i<len && j>=0; i++,j--) {
			if(temp[i] != temp[j])
				return false;
			
			if(i==j || (j-i)==1) {
				return true;
			}
		}
		return true;
	}*/
	
	//Method-II: Reverse the string using the reverse() method of StringBuilder
	//           and compare it with actual string.
	
	
	//Method-III: Same as Method-I but using while loop
	public static boolean isPalindrome(String str) {
		char[] temp = str.toCharArray();
		int startIndex = 0;
		int endIndex = temp.length-1;
		
		while(startIndex <= endIndex) {
			if(temp[startIndex] != temp[endIndex])
				return false;
			startIndex++;
			endIndex--;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		
		System.out.println("Is the string palindrome: "+ isPalindrome(str));
	}

}
