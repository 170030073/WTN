package com.wipro.inheritance;

class Animal{
	void eat() {
		System.out.println("Eat method in Animal class");
	}
	void sleep() {
		System.out.println("Sleep method in Animal class");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Eat method is overrided");
	}
	void sleep() {
		System.out.println("Sleep method is overrided");
	}
	void fly() {
		System.out.println("Fly method in Birds");
	}
}
public class Animalsdemo {
	public static void main(String args[]) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
