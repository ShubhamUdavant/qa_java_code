package org.array;

import java.util.Scanner;

public class SumofArra {
	public static void main(String[] args) {
		int a[] = new int[10];
		int sum = 0;
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		for(int i =0; i<10; i++)
		{
			a[i] = sc.nextInt();
			x = a[i];
			sum = sum+x;
		}
		System.out.println(+sum);
	}
}
