package com.wipro.flowcontrolstatements;

public class Ex17 {
	public static void main(String args[]) {
		int a=Integer.parseInt(args[0]);
		int rev=0;
		while(a!=0) {
			int d=a%10;
			rev=rev*10+d;
			a/=10;
		}
		System.out.println(rev);
	}

}
