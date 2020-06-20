package com.wipro.classandobjects;

public class Box {
	int width;
	int height;
	int depth;
	int v;
	Box(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	int calculatevol() {
		v=width*height*depth;
		return v;
	}
	public static void main(String args[]) {
		Box b=new Box(5,6,7);
		System.out.println("The volume is: "+b.calculatevol());
	}
}
