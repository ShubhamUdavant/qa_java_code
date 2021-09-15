package org.string;

import java.util.Scanner;

public class UpperLowerSpecialChar {
	public static void main(String[] args) {
		
		int up = 0;
		int low = 0;
		int num = 0;
		int spec = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		
		for(int i = 0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z') {
				up++;
			}
			else if (ch >= 'a' && ch <= 'z')
			{
				low++;
			}
			else if(ch >= '0' && ch<= '9')
			{
				num++;
			}
			else
			{
				spec++;
			}
		}
			
			System.out.println("Number of Uppercase letters are " +up);
			System.out.println("Number of LOwercase letters are " +low);
			System.out.println("Number of Specail letters are " +spec);
			System.out.println("Number of LOwercase letters are " +num);
	}

}
