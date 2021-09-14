package org.test;

import java.util.Scanner;

public class SignMultiplication {

		public static void main(String[] args) {
		long num, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		num = sc.nextInt();
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		System.out.println("Enter the Third number");
		num3 = sc.nextInt();
		
		long total = num * num2 * num3;
		System.out.println(" "+total);
		
		if (total<0)
		{
			System.out.println("SIgn alert is -");
		}
		}
	
	
}
