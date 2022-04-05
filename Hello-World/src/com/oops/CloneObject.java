package com.oops;

public class CloneObject implements Cloneable {

	int no;
	String name;
	
	CloneObject(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneObject c1 = new CloneObject(10, "SK");
		CloneObject c2 = (CloneObject)c1.clone();
		
		System.out.println(c1.no +" "+ c1.name);
		System.out.println(c2.no +" "+ c2.name);

	}

}
