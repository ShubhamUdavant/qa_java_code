package org.string;

import java.util.Scanner;

public class StringOne {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to find the length of String");
		String name = sc.nextLine();
		int length = name.length();
		System.out.println("length of this string is" +length);
	}
	
	

}
