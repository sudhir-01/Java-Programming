package com.oops;

//Example of Inheritance(IS-A relationship)
//Here Dog/Cat IS-A Animal

class Animal{
	public void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Woff...Woff!!");
	}
}

class Cat extends Animal{
	public void meow() {
		System.out.println("Meow...Meow!!");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.bark();
		c.eat();
		c.meow();
	}
	
}
