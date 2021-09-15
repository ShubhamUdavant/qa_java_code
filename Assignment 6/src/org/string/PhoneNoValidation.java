package org.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNoValidation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Mobile Number to varify");
	String s = sc.nextLine();
	System.out.println(mobileNumber(s));
	}
public static boolean mobileNumber(String s)
	{
		return s.matches("\\d{10}");
	}
}
