package com.wipro.arrays;

public class Ex6 {
	public static void main(String args[]) {
		int a[]=new int[]{10,9,8,15,25};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Elements of array in sorted order:");
		for(int i=0;i<a.length;i++) 
			System.out.print(a[i]+" ");
	}
}
