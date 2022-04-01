package com.oops;

interface Printable {
	void print();
}

class Printer implements Printable {
	public void print() {
		System.out.println("Printing...");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		Printable p = new Printer();
		p.print();

	}

}
