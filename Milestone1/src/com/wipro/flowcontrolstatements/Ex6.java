package com.wipro.flowcontrolstatements;

public class Ex6 {
	public static void main(String args[]) {
		String gender=args[0];
		int a=Integer.parseInt(args[1]);
		if(args.length==0)
			System.out.println("Empty");
		else {
		if(gender.equals("Female")){
			if(a>=1&&a<=58) 
				System.out.println("The percentage of interest is 8.2%");
			if(a>=58&&a<=100) 
				System.out.println("The percentage of interest is 9.2%");
		}
		if(gender.equals("Male")) {
			if(a>=1&&a<=58)
				System.out.println("The percentage of interest is 8.4%");
			if(a>=59&&a<=100) {
				System.out.println("The percentage of interest is 10.5%");
			}
		}
		}
		
		
	}

}
