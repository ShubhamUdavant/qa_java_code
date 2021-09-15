package org.string;

import java.util.Scanner;

public class EqualityTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the string");
			String name1 = sc.nextLine();
		
		System.out.println("enter the index to find character");
			String name2 = sc.nextLine();

		boolean result = name1.equalsIgnoreCase(name2);
		System.out.println("both the strings are " +result+ " equal");
		
	}

}
