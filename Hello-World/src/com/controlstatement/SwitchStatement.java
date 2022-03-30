package com.controlstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		byte b = 2;
		short s = 3;
		int i = 4;
		char c = 'A';
		String str = "test";
		
		switch(c) {
		case 2:
			System.out.println("Its a byte.");
			break;
		case 3:
			System.out.println("It's a short.");
			break;
		case 4:
			System.out.println("It's an integer.");
			break;
		case 'A':
			System.out.println("It's a character.");
			break;
//		case "test":
//			System.out.println("It's a string.");
//			break;
		default:
			System.out.println("No match found.");	
		}
	}
}
