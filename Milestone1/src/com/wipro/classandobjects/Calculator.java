package com.wipro.classandobjects;

public class Calculator {
	static double powerInt(int n1,int n2) {
		return Math.pow(n1,n2);
	}
	static double powerDouble(double n1,int n2) {
		return Math.pow(n1,n2);
	}
	public static void main(String args[]) {
		Calculator c=new Calculator();
		System.out.println(c.powerInt(45, 3));
		System.out.println(c.powerDouble(65.0, 3));
		
	}

}
