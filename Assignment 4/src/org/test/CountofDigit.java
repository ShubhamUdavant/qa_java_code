package org.test;

import java.util.Scanner;

public class CountofDigit {
	
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		do
		{
			count++;
			i /= 10;
		}
		while(i != 0);
		System.out.println("total digit is" +count);
		
	}

}
