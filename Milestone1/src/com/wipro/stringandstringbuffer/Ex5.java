package com.wipro.stringandstringbuffer;

public class Ex5 {
	static String strCount(String s,int p) {
		String r="";
		while(p>0) {
			r+=s.concat("X");
		p--;
		}
		r=r.substring(0,r.length()-1);
		return r;
	}
	public static void main(String args[]) {
		String s="Wipro";
		int p=3;
		System.out.println(strCount(s,p));
	}

}
