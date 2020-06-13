package com.wipro.flowcontrolstatements;

public class Ex14 {
	public static void main(String args[]) {
		if(args.length==0)
			System.out.println("Please enter an integer number ");
		int a=Integer.parseInt(args[0]);
		int c=0;
		int i;
		
		if(a==0||a==1) {
			System.out.println(a+" is neither prime nor composite");
		}
		for(i=1;i<=a;i++)
		{
		if(a%i==0) {
			c++;
		}
		}
		if(c>2) {
			System.out.println(a+" is not a prime number");
		}
		if(c==2){
			System.out.println(a+" is a prime number");
			
		}
	}

}
