package org.string;

import java.util.Scanner;

public class IndexofString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
			String name = sc.nextLine();
		System.out.println("enter the index to find character");
			String ind = sc.nextLine();
		
		System.out.println(name.indexOf(ind));
		
	}

}
