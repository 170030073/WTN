package com.wipro.arrays;

public class Ex7 {
	public static void main(String args[]) {
		int a[]=new int[] {12,34,12,45,67,89};
		int temp;
		int l=a.length;
		int[] tmp=new int[l];
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int j=0;
		for(int i=0;i<l-1;i++)
			if(a[i]!=a[i+1])
				tmp[j++]=a[i];
		tmp[j++]=a[l-1];
		for(int i=0;i<j;i++)
			a[i]=tmp[i];
		System.out.println("Array without duplicates:");
		for(int i=0;i<j;i++)
			System.out.println(a[i]+" ");
		
		}
	}


