package com.wipro.stringandstringbuffer;

public class Ex8 {
	public static void main(String[] args) {
        
        String str = args[0];
        int x = str.length();
        if(x%2==0) {
        System.out.println(str.substring(0, x/2)); // return part of full string starting from index 0 to mid index
    }
        else {
        	System.out.println("null");
        }

}
}
