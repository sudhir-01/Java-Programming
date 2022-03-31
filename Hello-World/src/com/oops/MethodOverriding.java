package com.oops;

class Bank{
	
	//Getting Rate of Interest for specified bank
	public double getROI() {
		return 0;
	}
}

class HDFC extends Bank {
	public double getROI() {
		return 7;
	}
}

class ICICI extends Bank {
	public double getROI() {
		return 7.5;
	}
}


public class MethodOverriding {
	
	public static void main(String[] args) {
		HDFC h = new HDFC();
		ICICI i = new ICICI();
		
		System.out.println("ROI of HDFC is "+ h.getROI() +"%");
		System.out.println("ROI of ICICI is "+ i.getROI() +"%");
	}

}
