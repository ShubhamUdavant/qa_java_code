package org.test;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to show its odd or even");
		int a = sc.nextInt();
		
		if (a%2==0)
		{
			System.out.println(a+ " even Number");
		}
		else
		{
			System.out.println(a+ " Odd Number");
		}
	}

}
