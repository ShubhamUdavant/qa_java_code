package org.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressZipCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine(); 
		System.out.println(zipIndia(name));
	}
	
	public static boolean zipIndia(String name) {
		// TODO Auto-generated method stub
		return name.matches("\\d{6}");
	}

}
