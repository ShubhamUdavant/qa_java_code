package org.emp;

public class Employee {
	private void empId() {
	System.out.println(1250);
	}
	private void empName() {
		// TODO Auto-generated method stub
		System.out.println("Shubham Udavant");
	}
	private void empDob() {
		// TODO Auto-generated method stub
		System.out.println("10.02.1999");
	}
	private void empPhone() {
		// TODO Auto-generated method stub
		System.out.println("9156756946");
	}
	private void empEmail() {
		// TODO Auto-generated method stub
		System.out.println("shubhamudavant19@gmail.com");
	}
	private void empAddress() {
		// TODO Auto-generated method stub
		System.out.println("Nashik");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();
	}
}
