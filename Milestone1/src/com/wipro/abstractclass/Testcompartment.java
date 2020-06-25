package com.wipro.abstractclass;
import java.util.*;
abstract class Compartment{
	abstract public void notice();
}
class Firstclass extends Compartment{
	public void notice() {
		System.out.println("First class Compartment (reserved use)");
	}
}
class Ladies extends Compartment{
	public void notice() {
		System.out.println("Reserved for ladies");
	}
}
class General extends Compartment{
	public void notice() {
		System.out.println("General compartment");
	}
}
class Luggage extends Compartment{
	public void notice() {
		System.out.println("Luggages compartment");
	}
}

public class Testcompartment {
	public static void main(String args[]) {
		Compartment com[]=new Compartment[10];
		Random r=new Random();
		int n=0;
		for(int i=0;i<10;i++) {
			n=r.nextInt(4);
			if(n==0)
				com[i]=new Firstclass();
			else if(n==1)
				com[i]=new Ladies();
			else if(n==2)
				com[i]=new General();
			else
				com[i]=new Luggage();
			com[i].notice();
			System.out.println();
		}
	}
}
