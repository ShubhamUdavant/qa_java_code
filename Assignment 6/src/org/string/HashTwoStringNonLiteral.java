package org.string;

public class HashTwoStringNonLiteral {
	public static void main(String[] args) {
		
		// NON LITERAL STRING

		String a = new String("Selenium");
		String b = new String("Selenium");
				
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
	}
}
