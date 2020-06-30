package com.wipro.exceptionhandling;
import java.util.*;
class NegativeValuesException extends Exception {
	public NegativeValuesException() {
		super();
		System.out.println("NegativeValuesException occured");
	}
}
class ValuesOutOfRangeException extends Exception {
	public ValuesOutOfRangeException() {
		super();
		System.out.println("ValuesOutOfRangeException occured");
	}
}


public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String sname = "";
			int sA = 0;
			int sB = 0;
			int sC = 0;
			System.out.println("Enter name and marks :");
			try {				
				sname = sc.nextLine();
				if (sc.hasNextInt())
					sA = sc.nextInt();
				else
					throw new NumberFormatException();
				if (sc.hasNextInt())
					sB = sc.nextInt();
				else
					throw new NumberFormatException();
				if (sc.hasNextInt())
					sC = sc.nextInt();
				else
					throw new NumberFormatException();
				if (sA < 0) throw new NegativeValuesException();
				if (sA > 100) throw new ValuesOutOfRangeException();
				if (sB < 0) throw new NegativeValuesException();
				if (sB > 100) throw new ValuesOutOfRangeException();
				if (sC < 0) throw new NegativeValuesException();
				if (sC > 100) throw new ValuesOutOfRangeException();
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
			} catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Name: " + sname);
			System.out.println("Marks of subject A: " + sA);
			System.out.println("Marks of subject B: " + sB);
			System.out.println("Marks of subject C: " + sC);
		}
		sc.close();
	}

}
