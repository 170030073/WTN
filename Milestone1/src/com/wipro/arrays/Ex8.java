package com.wipro.arrays;
import java.util.Scanner;
public class Ex8 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int flag=0,sum=0;
		for(int i:a) {
			if(i==6)
				flag=1;
			if(flag==1) {
				if(i==7)
					flag=0;
			continue;
			}
			else {
				if(i==7)
					sum+=i+7;
				else
					sum+=i;
			}
		}
		System.out.println("total: "+sum);
	}

}
