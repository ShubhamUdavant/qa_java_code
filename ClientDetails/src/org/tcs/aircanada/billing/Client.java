package org.tcs.aircanada.billing;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String nel = sc.nextLine();
		System.out.println("yout name is" + nel);
		
		System.out.println("Enter your first name");
		String ne = sc.next();
		System.out.println("yout name is" + ne);
		
		System.out.println("Enter pnone number");
		long nl = sc.nextLong();
		System.out.println("yout phone number is" + nl);
		
		System.out.println("Enter your avg value");
		float n = sc.nextFloat();
		System.out.println("yout avg value is" + n);
		
		System.out.println("Enter your salary");
		double nd = sc.nextDouble();
		System.out.println("salary" + nd);
		
		System.out.println("Enter your name");
		boolean nb = sc.nextBoolean();
		System.out.println("yout name is" + nb);
		
		
	}

}
