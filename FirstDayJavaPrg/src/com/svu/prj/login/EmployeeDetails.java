package com.svu.prj.login;

public class EmployeeDetails {
	public void empName() {
	System.out.println("SSSS");

	}
	
	private void empSalary() {
		// TODO Auto-generated method stub
System.out.println(12000);
	}
	
	public void empID() {
		// TODO Auto-generated method stub
System.out.println(715);
	}
	
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.empName();
		emp.empID();
		emp.empSalary();
		
		CourseDetails cd = new CourseDetails();
		cd.javaCourse();
		cd.seleniumCource();
	}
}
