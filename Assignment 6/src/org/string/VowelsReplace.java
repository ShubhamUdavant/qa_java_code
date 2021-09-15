package org.string;

import java.util.Scanner;

public class VowelsReplace {
	public static void main(String[] args) {
		
		int vcount = 0;
		int ccount = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String original = str;
		
		str = str.toLowerCase();
		
		for(int i = 0 ; i<str.length() ; i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				String front = str.substring(0, i);
				String back = str.substring(i+1);
				str = front + "@" + back;
			}
		}
		System.out.println(" "+original);
		System.out.println(" "+str);
	}

}
