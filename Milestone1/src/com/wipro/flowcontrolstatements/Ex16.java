package com.wipro.flowcontrolstatements;

public class Ex16 {
	public static void main(String args[]) {
	int a=Integer.parseInt(args[0]);
	int n=1;
	int c, d;
    for(c=1;c<=a;c++)
    {
      for(d=1;d<=c;d++)
      {
        System.out.print("*"+" ");
        n++;
      }
      System.out.println();
    }

}
}
