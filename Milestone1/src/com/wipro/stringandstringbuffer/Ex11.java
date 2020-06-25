package com.wipro.stringandstringbuffer;

public class Ex11 {
	static String FirstAndLast(String str) 
    {
        String[] arr = str.split(" "); 
        String r = ""; 
        for (String a : arr) { 
            r += a.substring(1, a.length() - 1) + " "; 
        } 
  
        return r; 
    } 
    public static void main(String args[]) 
    { 
        String str = "Suman"; 
        System.out.println(str); 
        System.out.println(FirstAndLast(str)); 
    } 

}
