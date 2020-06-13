package com.wipro.flowcontrolstatements;

public class Ex15 {
	public static void main(String args[]) {
		int a=Integer.parseInt(args[0]);
		int sum=0;
		while(a!=0) {
			sum=sum+a%10;
			a=a/10;
		}
		System.out.println(sum);
	}

}
