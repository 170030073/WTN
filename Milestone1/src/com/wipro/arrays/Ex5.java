package com.wipro.arrays;

public class Ex5 {
	public static void main(String args[]) {
		int a[]=new int[]{10,15,9,25,1};
		int min1=a[0],min2=a[0];
		int max1=a[0],max2=a[0];
		int temp,i;
		for(i=0;i<a.length;i++) {
			if(a[i]>max1) 
				max1=a[i];
			}
		for(i=0; i<a.length; i++){
			if(a[i]>max2 && a[i]!=max1)
				max2= a[i];
			}
		for(i=0;i<a.length; i++){
			if(a[i]< max1)
				min1 = a[i];
			}
		for(i=0; i<a.length; i++){
			if(a[i]<min2 && a[i]!=min1)
				min2= a[i];
			}
		System.out.println("Largest 2 numbers are: "+max1+" "+max2);
		System.out.println("Smallest 2 numbers are: "+min1+" "+min2);
		
		
	}

}
