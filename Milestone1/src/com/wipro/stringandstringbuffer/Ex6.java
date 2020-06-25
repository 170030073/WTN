package com.wipro.stringandstringbuffer;

public class Ex6 {
	static String remwStr(String s) {
		StringBuffer sb=new StringBuffer(s);
		int i=s.indexOf('*');
		int l=s.lastIndexOf('*');
		return new String(sb.delete(i-1, l+2));
	}
	public static void main(String args[]) {
		String s="ab**cd";
		System.out.println(remwStr(s));
	}

}
