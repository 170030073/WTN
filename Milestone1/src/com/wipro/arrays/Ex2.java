package com.wipro.arrays;

public class Ex2 {
	public static void main(String args[]) {
		int a[]=new int[]{15,10,25,30,16};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Maximum value of array is: "+max);
		System.out.println("Minimum value of array is: "+min);
		
	}
}
