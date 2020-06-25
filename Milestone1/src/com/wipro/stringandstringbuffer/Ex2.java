package com.wipro.stringandstringbuffer;

public class Ex2 {
	public static void main(String args[]) {
		String s1=args[0];
		String s2=args[1];
		if(s1.substring(s1.length()-1).equalsIgnoreCase(s2.substring(0,1)))
			System.out.println(s1.concat(s2.substring(1,s2.length())));
		else
			System.out.println(s1.concat(s2).toLowerCase());
			
	}

}
