package org.string;

import java.util.Scanner;

public class ConstandAndVowels {
	public static void main(String[] args) {
		
		int vcount = 0;
		int ccount = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		
		for(int i = 0 ; i<str.length() ; i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
			
			System.out.println("Number of Vowels are" +vcount);
			System.out.println("Number of Counts are" +ccount);
	}
	
}
