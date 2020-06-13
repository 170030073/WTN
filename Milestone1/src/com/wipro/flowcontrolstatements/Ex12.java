package com.wipro.flowcontrolstatements;

public class Ex12 {
	public static void main(String args[]) {
		int a=Integer.parseInt(args[0]);
		int c=0;
		int i;
		if(a==0||a==1) {
			System.out.println(a+" is not prime number");
		}
		for(i=1;i<=a;i++)
		{
		if(a%i==0) {
			c++;
		}
		}
		if(c>2) {
			System.out.println(a+" is not prime number");
		}
		if(c==2){
			System.out.println(a+" is prime number");
			
		}
	}

}
