package com.wipro.stringandstringbuffer;

public class Ex7 {
	static String alter(String a,String b) {
		String r="";
		int la=a.length();
		int lb=b.length();
		int len=Math.min(la,lb);
		int i=0;
		while(i<len) {
			r+=a.substring(i,i+1)+b.substring(i,i+1);
		i++;
		}
		if(la!=lb) {
			r+=b.substring(len);
		}
		if(lb!=la) {
			r+=a.substring(len);
		}
		return r;
	}
	public static void main(String args[]) {
		String a="Hello";
		String b="World";
		System.out.println(alter(a,b));
	}

}
