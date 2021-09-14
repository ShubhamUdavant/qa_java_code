package org.test;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	int n;
	int m=0;
	int flag = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enterh the value to find its prime or not");
	int i = sc.nextInt();
	if(i==0 || i==1)
	{
		System.out.println(i+ " is not prime number");
	}
	else
	{
		for(n=2; n<=m; n++)
		{
			if(i%n==0)
			{
				System.out.println(i+ " is not prime number");
				flag = 1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(i+ "is prime number");
		}
	}
}
}
