package com.wipro.flowcontrolstatements;

public class Ex19 {
	public static void main(String args[]) {
		int a=0,i;
		for(i=1;i<1000;i++) {
			if(a==5)
				break;
			if((i%2==0)&&(i%3==0)&&(i%5==0))
			{
				System.out.println(i);
				a++;
			}
		}
	}

}
