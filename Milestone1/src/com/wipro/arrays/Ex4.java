package com.wipro.arrays;

public class Ex4 {
	public static void main(String args[]) {
		int arr[]=new int[]{65,120,119,72,122};
		String s =null;
        for(int i: arr){
            s = Character.toString((char)i);
            System.out.println(s);
        }
	}

}
