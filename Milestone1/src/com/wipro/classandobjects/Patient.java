package com.wipro.classandobjects;

public class Patient {
	String patientname;
	double height;
	double weight;
	Patient(double weight,double height){
		this.weight=weight;
		this.height=height;
	}
	double computeBMI() {
		return (weight/(height*height));
	}
	public static void main(String args[]) {
		Patient p=new Patient(70,155);
		System.out.println(p.computeBMI());
	}

}
