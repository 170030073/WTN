package com.wipro.flowcontrolstatements;

public class Ex3 {
	public static void main(String args[]) {
		int l=args.length;
		if(l==0)
			System.out.println("No Values");
		else
		{
			System.out.println(args[0]);
			for(int i=1;i<l;i++) {
				System.out.println(","+args[i]);
			}
		}
	}

}
