package com.wipro.flowcontrolstatements;

public class Ex13 {
	public static void main(String args[]) {
		int flag=0;
		int i,j;
        for (i = 10; i <= 99; i++) { 
            if (i == 1 || i == 0) 
                continue; 
            flag = 1; 
            for (j = 2; j <= i / 2; ++j) { 
                if (i % j == 0) { 
                    flag = 0; 
                    break; 
                } 
            } 
            if (flag == 1) 
                System.out.println(i); 
        } 
    } 
}
		
		
	


