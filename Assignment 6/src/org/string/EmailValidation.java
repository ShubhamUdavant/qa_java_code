package org.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email Address");
		String email = sc.nextLine();
		
		if(email.contains("@"))
		{
			System.out.println("valid email id"+email);
		}
		else
		{
			System.out.println("invalid email id"+email);
		}
	}

	

}
