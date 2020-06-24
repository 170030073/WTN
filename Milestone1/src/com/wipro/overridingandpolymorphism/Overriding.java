package com.wipro.overridingandpolymorphism;

class Shape{
	void draw() {
		System.out.println("drawing shape");
	}
	void erase() {
		System.out.println("ersing shape");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
	void erase() {
		System.out.println("erasing circle");
	}
}
class Traingle extends Shape{
	void draw() {
		System.out.println("drawing triangle");
	}
	void erase() {
		System.out.println("erasing triangle");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("drawing square");
	}
	void erase() {
		System.out.println("erasing square");
	}
}

public class Overriding {
	public static void main(String args[]) {
		Shape c=new Circle();
		Shape t=new Traingle();
		Shape s=new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
	}

}
