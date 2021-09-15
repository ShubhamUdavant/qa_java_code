package org.string;

import java.util.Scanner;

public class HashTwoString {
	public static void main(String[] args) {
		
		// LITERAL STRING
		
		String a = "Selenium";
		String b = "Selenium";
		
		int return1 = System.identityHashCode(a);
		System.out.println(return1);
		
		int return2 = System.identityHashCode(b);
		System.out.println(return2);
	}

}
