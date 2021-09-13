package org.pack;
import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
	
Scanner s = new Scanner(System.in);
{
	System.out.println("Enter the Id of Employee");
	String id = s.nextLine();
	
	System.out.println("Enter the Name of Employee");
	String name = s.nextLine();
	
	System.out.println("Enter the EmailId of Employee");
	String email = s.nextLine();
	
	System.out.println("Enter the Phone number of employee");
	Long phone = s.nextLong();
	
	System.out.println("Enter the Salary of Employee");
	String sal = s.nextLine();
	
	System.out.println("Enter the gender of Employee");
	String gender = s.nextLine();
	
	System.out.println("Enter the City of Employee");
	String city = s.nextLine();
	
	System.out.println("Id of Employee is " +id);
	System.out.println("name of your Employee is " +name);
	System.out.println("Email Id of Employee is " +email);
	System.out.println("Phone number is " +phone);
	System.out.println("current salary is " +sal);
	System.out.println("Gender of employee is " +gender);
	System.out.println("Current city of employe is  " +city);
} 
	}
}
