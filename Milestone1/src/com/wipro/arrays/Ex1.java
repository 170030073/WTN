package com.wipro.arrays;

public class Ex1 {
	public static void main(String args[]) {
		
		int a[]=new int[] {1,2,3,4,5};
		int sum=0,l;
		int avg;
		l=a.length;
		for(int i=0;i<l;i++) {
			sum=sum+a[i];
		}
		avg=sum/5;
		System.out.println("Sum of elements is "+sum);
		System.out.println("Average of elements is "+avg);
		
	}

}
