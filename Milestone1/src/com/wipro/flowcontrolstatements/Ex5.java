package com.wipro.flowcontrolstatements;

public class Ex5 {
	public static void main(String args[]) {
		char c1=args[0].charAt(0);
		if((c1>=48)&&(c1<=57)||c1==45)
			System.out.println("The given charecter is digit");
		else if((c1>='a'&&c1<='z')||(c1>='A'&&c1<='Z'))
				System.out.println("The given charecter is alphabet");
		else
			System.out.println("The given charecter is special charecter");
	}

}
