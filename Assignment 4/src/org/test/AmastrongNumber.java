package org.test;

import java.util.Scanner;

public class AmastrongNumber {
static boolean isArmstrong(int n)
{
	int temp;
	int digits=0;
	int last=0;
	int sum=0;
	temp = n;
	
	while(temp>0)
	{
		temp = temp/10;
		digits++;
	}
	temp = n;
	while(temp>0)
	{
		last = temp%10;
		sum += (Math.pow(last, digits));
		temp = temp/10;
	}
	
	if(n==sum) {
		return true;
	}
	else
	{
		return false;
	}
}
public static void main(String[] args) {
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	
	num = sc.nextInt();
	
	if(isArmstrong(num))
	{
		System.out.println("Armstrong");
	}
	
	else
	{
		System.out.println("not Armstrong");
	}
}
}
