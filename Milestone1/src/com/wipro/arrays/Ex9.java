package com.wipro.arrays;

public class Ex9 {
	public static void main(String args[])
    {
    int l=args.length;
    int x,y,w,z,i;
    int a[][] = new int[4][4];
    if(l<4)
    	System.out.println("enter 4 values");
    if(l==4)    
    {
        int k=0;
    for(i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            
        a[i][j]=Integer.parseInt(args[k]);
        k++;
        }
    }
    System.out.println("The given array is:");
    for(i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
        System.out.print(a[i][j]+" ");
        }
        System.out.println();  
    }
    System.out.println("The reverse of array is:");
    for(i=1;i>=0;i--)
    {
        for(int j=1;j>=0;j--)
        {
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }  
}
}


