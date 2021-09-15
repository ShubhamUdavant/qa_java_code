package org.string;

import java.util.Scanner;

public class CompareString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string One");
		String a = sc.nextLine();
		
		System.out.println("Enter the String two");
		String b = sc.nextLine();
		
		int compare = a.compareTo(b);
		System.out.println("Difference is : "+compare);
	}

}
