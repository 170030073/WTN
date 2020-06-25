package com.wipro.stringandstringbuffer;

public class Ex4 {
	static String trim(String s,int n) {
		if(n==1) {
			if(s.charAt(0)=='x')
				return "";
			else
				return s;
		}
		if(s.charAt(0)=='x'&&s.charAt(n-1)=='x')
			s=s.substring(1,n-1);
		return s;
		
	}
	public static void main(String args[]) {
		String s="xHix";
		int n=s.length();
		System.out.println(trim(s,n));
	}

}
