package com.wipro.arrays;

public class Ex3 {
	public static void main(String args[]) {
		int a[]=new int[]{1,4,34,56,7};
		int n=Integer.parseInt(args[0]);
		int flag=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				System.out.println(i);
				flag=1;
			}		
		}
		if(flag==0)
			System.out.println(-1);
	}

}
