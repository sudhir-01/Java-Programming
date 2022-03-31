package com.oops;

//This is an example of Aggregation(HAS-A relationship)
//Here Employee HAS-A Address

public class Employee {
	
	String id;
	String name;
	Address address;
	
	public Employee(String id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void displayEmployeeInfo() {
		System.out.println("ID: "+ id);
		System.out.println("Name: "+ name);
		System.out.println("Address: "+ address.city +", "+ address.country +" - "+ address.zipCode);
		System.out.println("=========================================================");
	}

	public static void main(String[] args) {
		
		Address a1 = new Address(815314, "Giridih", "India");
		Address a2 = new Address(500032, "Hyderabad", "India");
		
		Employee e1 = new Employee("JH11T6486", "Sudhir", a1);
		Employee e2 = new Employee("SV665917", "SK", a2);
		
		e1.displayEmployeeInfo();
		e2.displayEmployeeInfo();

	}

}
