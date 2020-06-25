package com.wipro.stringandstringbuffer;

public class Ex1 {
	public static void main(String args[]) {
		String s=args[0];
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		if(s.equalsIgnoreCase(sb.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
