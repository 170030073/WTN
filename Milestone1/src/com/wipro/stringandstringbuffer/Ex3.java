package com.wipro.stringandstringbuffer;

public class Ex3 {
	static String charCopy(String s,int n) {
		String r="";
		if(n<2)
			return s;
		else
			s=s.substring(0,2);
		while(n!=0) {
			r=r.concat(s);
		n--;
		}
		return r;
	}
	public static void main(String args[]) {
		String s="Wipro";
		int n=s.length();
		System.out.println(charCopy(s,n));
	}

}
