package com.wipro.exceptionhandling;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array: ");
		try {
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			System.out.println("Enter the index of the array element");
			int index = sc.nextInt();
			System.out.println("The array element at index " + index + " = " + arr[index]);
			System.out.println("Successfully accessed the array element");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} catch (InputMismatchException e) {
			System.out.println("java.lang.NumberFormatException");
		}
		sc.close();
	}
}


