package org.test;

import java.util.Scanner;

public class VotingAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter age of candidate");
				int age = sc.nextInt();
				
				if(age >= 18)
				{
					System.out.println(" Great you are eligible to vote");
				}
				else
				{
					System.out.println("Sorry You are not eligible to vote");
				}
	}

}
