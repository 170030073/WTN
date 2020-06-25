package com.wipro.stringandstringbuffer;

public class Ex10 {
	static String repeatEnd(String str, int n) {
		  int len = str.length();
		  String nw = "";
		  
		  for (int i = 0; i < n; i++) {
		    nw += str.substring(len - n, len);
		  }
		  return nw;
		}
	public static void main(String args[]) {
		String str ="Wipro";
		System.out.println(repeatEnd(str,3));
	}


}
