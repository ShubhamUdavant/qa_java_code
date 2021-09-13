package org.emp;

public class Employee {
	private void empId(String name) {
		// TODO Auto-generated method stub
		System.out.println("Enter Name" +name);
	}
	private void empId(String name, int emp) {
		// TODO Auto-generated method stub
		System.out.println("Enter name and emp number" +name+ " " +emp);
	}
	private void empId(int emp, String name, String city) {
		// TODO Auto-generated method stub
		System.out.println("Enter emp id, name and city of employee" +emp+ "" +name+ "" +city);
	}
public static void main(String[] args) {
	Employee em = new Employee();
	em.empId("Shubham");
	em.empId("shubham", 234);
	em.empId(234,"shubham","nashik");
}
}
