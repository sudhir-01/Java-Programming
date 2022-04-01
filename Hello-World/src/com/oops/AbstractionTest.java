package com.oops;

abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Drawing circle...");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Drawing Rectangle...");
	}
}


public class AbstractionTest {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		Shape rect = new Rectangle();
		
		circle.draw();
		rect.draw();

	}

}
