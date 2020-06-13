package com.wipro.flowcontrolstatements;

public class Ex18 {
	public static void main(String args[]) {
		int a=Integer.parseInt(args[0]);
		int b=a;
		int rev=0;
		while(a!=0) {
			int d=a%10;
			rev=rev*10+d;
			a/=10;
		}
		if(rev==b) {
			System.out.println(b+" is a palindrome");
		}
		else {
			System.out.println(b+" is not a palindrome");
		}
	}

}
