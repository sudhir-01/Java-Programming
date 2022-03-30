package com.controlstatement;

public class SwitchWithoutBreak {

	public static void main(String[] args) {
		int a = 10;
		
		switch(a) {
		case 5:
			System.out.println("5");
		case 10:
			System.out.println("You have entered 10");
		case 20:
			System.out.println("20");
		default:
			System.out.println("This is default");	
		}

	}

}
