package com.wipro.flowcontrolstatements;

public class Ex7 {
	public static void main(String args[]) {
		char c=args[0].charAt(0);
		char c1;
		int t,s;
		t =(int) c;
		if(c>='a'&&c<='z') {
			t=t-32;
			c1=(char) t;
			System.out.println(c+"->"+c1);
		}
		else if(c>='A'&&c<='Z') {
			t=t+32;
			c1=(char) t;
			System.out.println(c+"->"+c1);
		}
		else {
			System.out.println("none");
		}
			
	}

}
