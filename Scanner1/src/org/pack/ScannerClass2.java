package org.pack;

import java.util.Scanner;

public class ScannerClass2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Id");
		String id = sc.nextLine();
		
		System.out.println("Enter the Nmae of Student");
		String name = sc.nextLine();
		
		System.out.println("Enter the Mark of subjec 1");
		int m1 = sc.nextInt();
		
		System.out.println("Enter the Mark of subjec 2");
		int m2 = sc.nextInt();
		
		System.out.println("Enter the Mark of subjec 3");
		int m3 = sc.nextInt();
		
		System.out.println("Enter the Mark of subjec 4");
		int m4 = sc.nextInt();
		
		System.out.println("Enter the Mark of subjec 5");
		int m5 = sc.nextInt();
		
		int tota = m1+m2+m3+m4+m5;
		
		int total = tota / 5;
	
		System.out.println("*****THIS IS MARKSHEET OF STUDENT*****");
		System.out.println("Nmae of Student is " +name);
		System.out.println("ID of Student is " +id);
		System.out.println("Marks of all Subject of Student is " + m1);
		System.out.println("Marks of all Subject of Student is " + m2);
		System.out.println("Marks of all Subject of Student is " + m3);
		System.out.println("Marks of all Subject of Student is " + m4);
		System.out.println("Marks of all Subject of Student is " + m5);
		System.out.println("Total mark of student is " + tota);
		System.out.println("Average persentage of Stufdent is " + total);
		
		
	}

}
