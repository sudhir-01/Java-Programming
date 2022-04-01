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

class BOI extends Bank {
	public double getROI() {
		return 6.5;
	}
}


public class MethodOverriding {
	
	public static void main(String[] args) {
		HDFC h = new HDFC();
		ICICI i = new ICICI();
		Bank b = new BOI(); //Upcasting
		
		System.out.println("ROI of HDFC is "+ h.getROI() +"%");
		System.out.println("ROI of ICICI is "+ i.getROI() +"%");
		System.out.println("ROI of BOI is "+ b.getROI() +"%");
	}

}
